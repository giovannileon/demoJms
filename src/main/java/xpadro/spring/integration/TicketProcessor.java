package xpadro.spring.integration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import xpadro.spring.integration.message.TicketOrder;

@Component("ticketProcessor")
public class TicketProcessor {
    private static final Logger logger = LoggerFactory.getLogger(TicketProcessor.class);
    private static final String ERROR_INVALID_ID = "Order ID is invalid";
    
    @Autowired
    private OrderRepository repository;

    public void processOrder(TicketOrder order) {
        logger.info("Processing order {}", order.getFilmId());
        
        if (isInvalidOrder(order)) {
            logger.info("Error while processing order [{}]", ERROR_INVALID_ID);
            throw new InvalidOrderException(ERROR_INVALID_ID);
        }
        
        float amount = 5.95f * order.getQuantity();
        
        TicketConfirmation confirmation = new TicketConfirmation("123", order.getFilmId(), order.getOrderDate(), order.getQuantity(), amount);
        repository.confirmOrder(confirmation);
    }
    
    private boolean isInvalidOrder(TicketOrder order) {
        if (order.getFilmId() == -1) {
            return true;
        }
        return false;
    }
}
