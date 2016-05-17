package xpadro.spring.integration;

import java.util.Date;

public class TicketConfirmation {
   final private String idConfirmation;
   final private int filmId;
   final private Date orderDate;
   final private int quantity;
   final private float amount;

   public TicketConfirmation(String idConfirmation, int filmId, Date orderDate, int quantity, float amount) {
      this.idConfirmation = idConfirmation;
      this.filmId = filmId;
      this.quantity = quantity;
      this.amount = amount;
      this.orderDate = orderDate;
   }

   public String getId() {
      return idConfirmation;
   }

   public int getFilmId() {
      return filmId;
   }

   public Date getOrderDate() {
      return orderDate;
   }

   public int getQuantity() {
      return quantity;
   }

   public float getAmount() {
      return amount;
   }

}
