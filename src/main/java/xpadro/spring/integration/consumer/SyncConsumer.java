package xpadro.spring.integration.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;

import xpadro.spring.integration.message.TicketOrder;

public class SyncConsumer {
    @Autowired
    private JmsTemplate jmsTemplate;
    
    public TicketOrder receive() {
        return (TicketOrder) jmsTemplate.receiveAndConvert("test.sync.queue");
    }
}