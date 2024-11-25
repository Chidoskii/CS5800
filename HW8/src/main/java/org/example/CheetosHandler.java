package org.example;

public class CheetosHandler extends SnackDispenseHandler {
    public CheetosHandler(SnackDispenseHandler nextHandler) {
        super(nextHandler);
    }

    public void dispenseSnack(Snack snack) {
        if (snack.getSnackItem() == SnackItem.CHEETOS) {
            System.out.println("CheetosDispenser: Here is your Cheetos");
        }
        else {
            super.dispenseSnack(snack);
        }
    };
}
