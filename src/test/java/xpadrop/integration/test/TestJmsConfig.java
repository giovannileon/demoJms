package xpadrop.integration.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.rmi.RemoteException;
import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import xpadro.spring.integration.consumer.SyncConsumer;
import xpadro.spring.integration.message.TicketOrder;
import xpadro.spring.integration.producer.JmsProducer;

@ContextConfiguration({ "classpath:xpadro/spring/integration/test/config/applicationContext.xml" })
@RunWith(SpringJUnit4ClassRunner.class)
public class TestJmsConfig {
	@Autowired
	private JmsProducer producer;

	@Autowired
	private SyncConsumer consumer;

	@Test
	public void testReceiving() throws InterruptedException, RemoteException {
		 TicketOrder order = new TicketOrder(1, 5, new Date());
		 //Sends the message to the jmsTemplate's default destination
		 producer.convertAndSendMessage(order);
		
		 Thread.sleep(2000);
		
		 TicketOrder receivedOrder = consumer.receive();
		 assertNotNull(receivedOrder);
		 assertEquals(1, receivedOrder.getFilmId());
		 assertEquals(5, receivedOrder.getQuantity());
	}
}