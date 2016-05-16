package xpadro.spring.integration.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jms.core.JmsTemplate;

import xpadro.spring.integration.message.TicketOrder;

public class JmsProducer {
    @Autowired
    @Qualifier("jmsTemplate")
    private JmsTemplate jmsTemplate;
    
    public void convertAndSendMessage(TicketOrder order) {
        jmsTemplate.convertAndSend(order);
    }
    
    public void convertAndSendMessage(String destination, TicketOrder order) {
        jmsTemplate.convertAndSend(destination, order);
    }
}