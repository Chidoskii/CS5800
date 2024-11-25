import org.example.*;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class SnackDispenserHandlerTest {
    SnackDispenseHandler dispenser = new CokeHandler(new PepsiHandler(
            new CheetosHandler(new DoritosHandler(new KitKatHandler(
                    new SnickersHandler(null))))));

    StateOfVendingMachine machineState = new StateOfVendingMachine();
    Snack coke = new Snack(SnackItem.COKE, 12);
    Snack pepsi = new Snack(SnackItem.PEPSI, 6);
    Snack cheetos = new Snack(SnackItem.CHEETOS, 15);
    Snack doritos = new Snack(SnackItem.DORITOS, 8);
    Snack kitkat = new Snack(SnackItem.KITKAT, 9);
    Snack snickers = new Snack(SnackItem.SNICKERS, 1);
    ArrayList<Snack> snacks = new ArrayList<>();

    @Test
    public void testCokeHandler() {
        snacks.add(coke);
        VendingMachine machine = new VendingMachine(dispenser, machineState, snacks);
        int expected = 11;
        machine.selectSnack(coke);
        machine.insertMoney(4.00);
        int actual = coke.getQuantity();
        assertEquals(expected, actual);
    }

    @Test
    public void testPepsiHandler() {
        snacks.add(pepsi);
        VendingMachine machine = new VendingMachine(dispenser, machineState, snacks);
        int expected = 5;
        machine.selectSnack(pepsi);
        machine.insertMoney(4.00);
        int actual = pepsi.getQuantity();
        assertEquals(expected, actual);
    }

    @Test
    public void testCheetosHandler() {
        snacks.add(cheetos);
        VendingMachine machine = new VendingMachine(dispenser, machineState, snacks);
        int expected = 14;
        machine.selectSnack(cheetos);
        machine.insertMoney(4.00);
        int actual = cheetos.getQuantity();
        assertEquals(expected, actual);
    }

    @Test
    public void testDoritosHandler() {
        snacks.add(doritos);
        VendingMachine machine = new VendingMachine(dispenser, machineState, snacks);
        int expected = 7;
        machine.selectSnack(doritos);
        machine.insertMoney(4.00);
        int actual = doritos.getQuantity();
        assertEquals(expected, actual);
    }

    @Test
    public void testKitKatHandler() {
        snacks.add(kitkat);
        VendingMachine machine = new VendingMachine(dispenser, machineState, snacks);
        int expected = 8;
        machine.selectSnack(kitkat);
        machine.insertMoney(4.00);
        int actual = kitkat.getQuantity();
        assertEquals(expected, actual);
    }

    @Test
    public void testSnickersHandler() {
        snacks.add(snickers);
        VendingMachine machine = new VendingMachine(dispenser, machineState, snacks);
        int expected = 0;
        machine.selectSnack(snickers);
        machine.insertMoney(4.00);
        int actual = snickers.getQuantity();
        assertEquals(expected, actual);
    }
}
