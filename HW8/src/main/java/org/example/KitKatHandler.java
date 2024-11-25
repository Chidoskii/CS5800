package org.example;

public class KitKatHandler extends SnackDispenseHandler {
    public KitKatHandler(SnackDispenseHandler nextHandler) {
        super(nextHandler);
    }

    public void dispenseSnack(Snack snack) {
        if (snack.getSnackItem() == SnackItem.KITKAT) {
            System.out.println("KitKatDispenser: Here is your KitKat snack!");
        }
        else {
            super.dispenseSnack(snack);
        }
    };
}
