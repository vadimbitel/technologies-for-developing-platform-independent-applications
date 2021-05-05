package eu.senla.LaboratorySession1.services;

import eu.senla.LaboratorySession1.context.Context;
import eu.senla.LaboratorySession1.entities.Ship;

public class HarborService {
    public static void displayShipsInfo() {
        for (var ship : Context.getHarbor().getShips()) {
            System.out.print(Context.getHarbor().getShips().indexOf(ship) + 1 + ". " + ship.toString());
        }
    }

    public static int getNumberOfShips() {
        return Context.getHarbor().getShips().size();
    }

    public static void removeShip(int index) {
        Context.getHarbor().getShips().remove(index);
    }

    public static void addShip(Ship dockingShip) {
        Context.getHarbor().getShips().add(dockingShip);
    }

    public static Ship getDockingShip(int index) {
        return Context.getHarbor().getShips().get(index);
    }
}
