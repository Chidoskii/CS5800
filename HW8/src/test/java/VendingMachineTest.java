import org.example.*;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class VendingMachineTest {
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
    public void testInsertMoney() {
        snacks.add(coke);
        snacks.add(pepsi);
        snacks.add(cheetos);
        snacks.add(doritos);
        snacks.add(kitkat);
        snacks.add(snickers);
        VendingMachine machine = new VendingMachine(dispenser, machineState, snacks);
        int expected = 11;
        machine.selectSnack(coke);
        machine.insertMoney(5);
        int actual = coke.getQuantity();
        assertEquals(expected, actual);

    }
}
