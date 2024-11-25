package org.example;

public class StateOfVendingMachine {
    private MachineStates state;
    public StateOfVendingMachine() {
        state = MachineStates.IDLE;
    }
    public MachineStates getState() {
        return state;
    }
    public void setState(MachineStates state) {
        this.state = state;
    }
    public void machineResponse(MachineStates state) {
        if (state == MachineStates.IDLE) {
            System.out.println("Machine is on Standby");
        }
        if (state == MachineStates.WAITING_FOR_MONEY) {
            System.out.println("Machine is waiting for money");
        }
        if (state == MachineStates.DISPENSING_SNACK) {
            System.out.println("Dispensing SNACK");
        }
        if (state == MachineStates.GETTING_CHANGE) {
            System.out.println("Getting your change");
        }
        if (state == MachineStates.CANCEL_REQUEST) {
            System.out.println("Cancelling request");
        }
    }
}
