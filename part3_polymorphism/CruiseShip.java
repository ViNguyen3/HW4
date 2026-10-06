package part3_polymorphism;

public class CruiseShip extends Ship {
    int maxNumberPassengers;

    public CruiseShip() {
    }

    public CruiseShip(String shipName, String yearBuilt, int maxNumberPassengers) {
        super(shipName, yearBuilt);
        this.maxNumberPassengers = maxNumberPassengers;
    }

    public int getMaxNumberPassengers() {
        return maxNumberPassengers;
    }

    public void setMaxNumberPassengers(int maxNumberPassengers) {
        this.maxNumberPassengers = maxNumberPassengers;
    }

    @Override
    public String toString() {
        return "CruiseShip{" + "shipName='" + shipName + '\'' + ", maxNumberPassengers=" + maxNumberPassengers + '}';
    }
}