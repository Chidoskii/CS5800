package org.example;

import java.util.ArrayList;
import java.util.HashMap;

public class VendingMachine {
    private final SnackDispenseHandler dispenseHandler;
    private final StateOfVendingMachine stateOfVendingMachine;
    private Snack snack;
    private final ArrayList<Snack> snackInventory;

    public VendingMachine(SnackDispenseHandler dispenseHandler, StateOfVendingMachine stateOfVendingMachine, ArrayList<Snack> snackInventory) {
        this.snackInventory = snackInventory;
        this.dispenseHandler = dispenseHandler;
        this.stateOfVendingMachine = stateOfVendingMachine;
    }
    public void selectSnack(Snack snack) {
        this.snack = snack;
    }
    public void insertMoney(double money) {
        if (snack.getQuantity() == 0) {
            System.out.println("Out of stock");
            stateOfVendingMachine.setState(MachineStates.IDLE);
        }
        if (money > snack.getPrice() && snack.getQuantity() > 0) {
            snack.decrementQuantity();
            stateOfVendingMachine.setState(MachineStates.DISPENSING_SNACK);
            stateOfVendingMachine.machineResponse(stateOfVendingMachine.getState());
            dispenseHandler.dispenseSnack(snack);
            stateOfVendingMachine.setState(MachineStates.GETTING_CHANGE);
            stateOfVendingMachine.machineResponse(stateOfVendingMachine.getState());
        }
        if (money == snack.getPrice() && snack.getQuantity() > 0) {
            snack.decrementQuantity();
            stateOfVendingMachine.setState(MachineStates.DISPENSING_SNACK);
            stateOfVendingMachine.machineResponse(stateOfVendingMachine.getState());
            dispenseHandler.dispenseSnack(snack);
        }
        if (money < snack.getPrice()) {
            System.out.println("Not enough money");
            stateOfVendingMachine.setState(MachineStates.WAITING_FOR_MONEY);
            stateOfVendingMachine.machineResponse(stateOfVendingMachine.getState());
        }
    }
}
