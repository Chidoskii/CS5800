package org.example;

public abstract class SnackDispenseHandler {
   private final SnackDispenseHandler nextHandler;
   public SnackDispenseHandler(SnackDispenseHandler nextHandler) {
       this.nextHandler = nextHandler;
   }
   public void dispenseSnack(Snack snack) {
       if (nextHandler != null) {
           nextHandler.dispenseSnack(snack);
       }
   };
}
