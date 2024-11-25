package org.example;

public class CokeHandler extends SnackDispenseHandler{
    public CokeHandler(SnackDispenseHandler nextHandler) {
        super(nextHandler);
    }

    public void dispenseSnack(Snack snack) {
        if (snack.getSnackItem() == SnackItem.COKE) {
            System.out.println("CokeDispenser: Here is your Cola");
        }
        else {
            super.dispenseSnack(snack);
        }
    };
}
