package part3_polymorphism;

public class Ship {
    protected String shipName;
    protected String yearBuilt;

    public Ship() {
    }

    public Ship(String shipName, String yearBuilt) {
        this.shipName = shipName;
        this.yearBuilt = yearBuilt;
    }

    public String getShipName() {
        return shipName;
    }

    public void setShipName(String shipName) {
        this.shipName = shipName;
    }

    public String getYearBuilt() {
        return yearBuilt;
    }

    public void setYearBuilt(String yearBuilt) {
        this.yearBuilt = yearBuilt;
    }

    @Override
    public String toString() {
        return "Ship{" + "shipName='" + shipName + '\'' + ", yearBuilt='" + yearBuilt + '\'' + '}';
    }

    public void printShip() {
        System.out.println(this.toString());
    }
}