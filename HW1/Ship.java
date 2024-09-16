public class Ship {
    protected String shipName;
    protected String shipYear;

    public Ship(String shipName, String shipYear) {
        this.shipName = shipName;
        this.shipYear = shipYear;
    }

    public void shipInfo() {
        System.out.println("Ship Name: " + shipName);
        System.out.println("Ship Year: " + shipYear + "\n");
    }
}

class CruiseShip extends Ship {
    private final int capacity;
    public CruiseShip(String shipName, String shipYear, int capacity) {
        super(shipName, shipYear);
        this.capacity = capacity;
    }

    public void shipInfo() {
        System.out.println("Ship Name: " + shipName);
        System.out.println("Ship Year: " + shipYear);
        System.out.println("Passenger Capacity: " + capacity + "\n");
    }
}

class CargoShip extends Ship {
    private final int tonnage;
    public CargoShip(String shipName, String shipYear, int tons) {
        super(shipName, shipYear);
        this.tonnage = tons;
    }

    public void shipInfo() {
        System.out.println("Ship Name: " + shipName);
        System.out.println("Ship Year: " + shipYear);
        System.out.println("Weight Capacity: " + tonnage + "\n");
    }
}