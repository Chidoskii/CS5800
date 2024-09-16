public class ShipMain {
    public static void main(String[] args) {
        // declare an array of ships
        Ship [] shipObjects = new Ship[3];
        shipObjects[0] = new Ship("The Black Pearl", "2016");
        shipObjects[1] = new CruiseShip("The Flying Dutchman", "2003", 50);
        shipObjects[2] = new CargoShip("Storm Breacher", "2020", 100);

        for (int i = 0; i < 3; i++) {
            shipObjects[i].shipInfo();
        }
    }
}
