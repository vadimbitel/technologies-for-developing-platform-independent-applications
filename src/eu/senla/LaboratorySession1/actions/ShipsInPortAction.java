package eu.senla.LaboratorySession1.actions;

import eu.senla.LaboratorySession1.services.PortService;

public class ShipsInPortAction implements Action {
    @Override
    public void doAction(int index) {
        if (PortService.getNumberOfShips() == 0) {
            System.out.println("В порту нет кораблей!\n");
        } else {
            PortService.displayShipsInfo();
            System.out.println();
        }
    }
}
