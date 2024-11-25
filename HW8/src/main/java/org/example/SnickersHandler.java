package org.example;

public class SnickersHandler extends SnackDispenseHandler{
    public SnickersHandler(SnackDispenseHandler nextHandler) {
        super(nextHandler);
    }

    public void dispenseSnack(Snack snack) {
        if (snack.getSnackItem() == SnackItem.SNICKERS) {
            System.out.println("SnickersDispenser: Here is your Snickers");
        }
        else {
            super.dispenseSnack(snack);
        }
    };
}
