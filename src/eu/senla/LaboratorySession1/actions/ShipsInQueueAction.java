package eu.senla.LaboratorySession1.actions;

import eu.senla.LaboratorySession1.services.HarborService;

public class ShipsInQueueAction implements Action {

    @Override
    public void doAction(int index) {
        if (HarborService.getNumberOfShips() == 0) {
            System.out.println("Очередь пуста!\n");
        } else {
            HarborService.displayShipsInfo();
            System.out.println();
        }
    }
}
