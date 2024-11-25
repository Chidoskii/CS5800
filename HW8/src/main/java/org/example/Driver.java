package org.example;

import java.util.ArrayList;

public class Driver {
    public static void main(String[] args) {
        SnackDispenseHandler snackDispenser = new CokeHandler(new PepsiHandler(
                new CheetosHandler(new DoritosHandler(new KitKatHandler(
                        new SnickersHandler(null))))));
        StateOfVendingMachine stateOfMachine = new StateOfVendingMachine();
        Snack coke = new Snack(SnackItem.COKE, 12);
        Snack pepsi = new Snack(SnackItem.PEPSI, 6);
        Snack cheetos = new Snack(SnackItem.CHEETOS, 15);
        Snack doritos = new Snack(SnackItem.DORITOS, 8);
        Snack kitkat = new Snack(SnackItem.KITKAT, 9);
        Snack snickers = new Snack(SnackItem.SNICKERS, 1);
        ArrayList<Snack> snacks = new ArrayList<>();
        snacks.add(coke);
        snacks.add(pepsi);
        snacks.add(cheetos);
        snacks.add(doritos);
        snacks.add(kitkat);
        snacks.add(snickers);
        VendingMachine machine = new VendingMachine(snackDispenser, stateOfMachine, snacks);

        stateOfMachine.machineResponse(stateOfMachine.getState());
        machine.selectSnack(coke);
        stateOfMachine.setState(MachineStates.WAITING_FOR_MONEY);
        stateOfMachine.machineResponse(stateOfMachine.getState());
        machine.insertMoney(3.00);
        stateOfMachine.setState(MachineStates.IDLE);
        stateOfMachine.machineResponse(stateOfMachine.getState());
        System.out.println();

        stateOfMachine.machineResponse(stateOfMachine.getState());
        machine.selectSnack(pepsi);
        stateOfMachine.setState(MachineStates.WAITING_FOR_MONEY);
        stateOfMachine.machineResponse(stateOfMachine.getState());
        machine.insertMoney(1.00);
        stateOfMachine.setState(MachineStates.CANCEL_REQUEST);
        stateOfMachine.machineResponse(stateOfMachine.getState());
        stateOfMachine.setState(MachineStates.IDLE);
        stateOfMachine.machineResponse(stateOfMachine.getState());
        System.out.println();

        stateOfMachine.machineResponse(stateOfMachine.getState());
        machine.selectSnack(cheetos);
        stateOfMachine.setState(MachineStates.WAITING_FOR_MONEY);
        stateOfMachine.machineResponse(stateOfMachine.getState());
        machine.insertMoney(3.00);
        stateOfMachine.setState(MachineStates.IDLE);
        stateOfMachine.machineResponse(stateOfMachine.getState());
        System.out.println();

        stateOfMachine.machineResponse(stateOfMachine.getState());
        machine.selectSnack(doritos);
        stateOfMachine.setState(MachineStates.WAITING_FOR_MONEY);
        stateOfMachine.machineResponse(stateOfMachine.getState());
        machine.insertMoney(3.00);
        stateOfMachine.setState(MachineStates.IDLE);
        stateOfMachine.machineResponse(stateOfMachine.getState());
        System.out.println();

        stateOfMachine.machineResponse(stateOfMachine.getState());
        machine.selectSnack(kitkat);
        stateOfMachine.setState(MachineStates.WAITING_FOR_MONEY);
        stateOfMachine.machineResponse(stateOfMachine.getState());
        machine.insertMoney(3.00);
        stateOfMachine.setState(MachineStates.IDLE);
        stateOfMachine.machineResponse(stateOfMachine.getState());
        System.out.println();

        stateOfMachine.machineResponse(stateOfMachine.getState());
        machine.selectSnack(snickers);
        stateOfMachine.setState(MachineStates.WAITING_FOR_MONEY);
        stateOfMachine.machineResponse(stateOfMachine.getState());
        machine.insertMoney(3.00);
        stateOfMachine.setState(MachineStates.IDLE);
        stateOfMachine.machineResponse(stateOfMachine.getState());
        System.out.println();

        stateOfMachine.machineResponse(stateOfMachine.getState());
        machine.selectSnack(snickers);
        stateOfMachine.setState(MachineStates.WAITING_FOR_MONEY);
        stateOfMachine.machineResponse(stateOfMachine.getState());
        machine.insertMoney(3.00);
        stateOfMachine.machineResponse(stateOfMachine.getState());
        System.out.println();
    }
}