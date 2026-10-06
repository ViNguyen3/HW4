package part3_polymorphism;

public class CargoShip extends Ship {
    int cargoCapacityInTonnage;

    public CargoShip() {
    }

    public CargoShip(String shipName, String yearBuilt, int cargoCapacityInTonnage) {
        super(shipName, yearBuilt);
        this.cargoCapacityInTonnage = cargoCapacityInTonnage;
    }

    public int getCargoCapacityInTonnage() {
        return cargoCapacityInTonnage;
    }

    public void setCargoCapacityInTonnage(int cargoCapacityInTonnage) {
        this.cargoCapacityInTonnage = cargoCapacityInTonnage;
    }

    @Override
    public String toString() {
        return "CargoShip{" + "shipName='" + shipName + '\'' + ", cargoCapacityInTonnage=" + cargoCapacityInTonnage + '}';
    }
}