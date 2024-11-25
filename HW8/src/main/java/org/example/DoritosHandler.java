package org.example;

public class DoritosHandler extends SnackDispenseHandler{
    public DoritosHandler(SnackDispenseHandler nextHandler) {
        super(nextHandler);
    }

    public void dispenseSnack(Snack snack) {
        if (snack.getSnackItem() == SnackItem.DORITOS) {
            System.out.println("DoritosDispenser: Here is your Doritos");
        }
        else {
            super.dispenseSnack(snack);
        }
    };
}
