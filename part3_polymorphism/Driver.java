package part3_polymorphism;

public class Driver {
    public static void main(String[] args) {

        Ship[] ships = new Ship[3];

        ships[0] = new Ship();
        ships[0].setShipName("Titanic");
        ships[0].setYearBuilt("March31st,1909");

        ships[1] = new CruiseShip();
        ships[1].setShipName("MVGemini");
        ships[1].setYearBuilt("May30th,1991");
        ((CruiseShip) ships[1]).setMaxNumberPassengers(100);

        ships[2] = new CargoShip();
        ships[2].setShipName("EverGiven");
        ships[2].setYearBuilt("September25th,2018");
        ((CargoShip) ships[2]).setCargoCapacityInTonnage(220940);

        for (Ship ship : ships) {
            ship.printShip();
        }
    }
}