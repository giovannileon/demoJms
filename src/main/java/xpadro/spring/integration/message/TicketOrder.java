package xpadro.spring.integration.message;

import java.io.Serializable;
import java.util.Date;

public class TicketOrder implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	final private int filmId;
	final private int quantity;
	final private Date sessionDate;
	final private Date orderDate;

	public TicketOrder(int filmId, int quantity, Date sessionDate) {
		this.filmId = filmId;
		this.quantity = quantity;
		this.sessionDate = sessionDate;
		this.orderDate = sessionDate;
	}

	public int getFilmId() {
		return filmId;
	}

	public int getQuantity() {
		return quantity;
	}

	public Date getSessionDate() {
		return sessionDate;
	}

   public Date getOrderDate() {
      // TODO Auto-generated method stub
      return orderDate;
   }

}
