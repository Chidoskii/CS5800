package org.example;

public class PepsiHandler extends SnackDispenseHandler{
    public PepsiHandler(SnackDispenseHandler nextHandler) {
        super(nextHandler);
    }

    public void dispenseSnack(Snack snack) {
        if (snack.getSnackItem() == SnackItem.PEPSI) {
            System.out.println("PepsiDispenser: Here is your Cola");
        }
        else {
            super.dispenseSnack(snack);
        }
    };
}
