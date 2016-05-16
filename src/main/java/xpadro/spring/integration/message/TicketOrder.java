package xpadro.spring.integration.message;

import java.util.Date;

public class TicketOrder {

	final private int filmId;
	final private int quantity;
	final private Date sessionDate;

	public TicketOrder(int filmId, int quantity, Date sessionDate) {
		this.filmId = filmId;
		this.quantity = quantity;
		this.sessionDate = sessionDate;
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

}
