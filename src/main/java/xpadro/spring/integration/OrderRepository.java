package xpadro.spring.integration;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OrderRepository {

   private static final Logger logger = LoggerFactory.getLogger(OrderRepository.class);
   private List<TicketConfirmation> orderRepository;

   public void confirmOrder(TicketConfirmation confirmation) {
      logger.info("confirmOrder order {}", confirmation.getFilmId());
      orderRepository.add(confirmation);
      logger.info("confirmOrder order added {}", confirmation.getFilmId());
   }

   public List<TicketConfirmation> getConfirmations() {
      // TODO Auto-generated method stub
      return orderRepository;
   }

}
