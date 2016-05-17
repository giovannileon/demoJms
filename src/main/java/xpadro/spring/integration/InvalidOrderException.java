package xpadro.spring.integration;

public class InvalidOrderException extends RuntimeException {

   private static final long serialVersionUID = 1L;

   public InvalidOrderException(String errorInvalidId) {
      super(errorInvalidId);
   }

}
