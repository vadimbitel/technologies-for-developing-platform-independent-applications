package eu.senla.LaboratorySession1.actions;

import eu.senla.LaboratorySession1.services.HarborService;
import eu.senla.LaboratorySession1.services.PortService;

public class BuildShipAutomaticallyAction implements Action {
    @Override
    public void doAction(int index) {
        HarborService.addShip(PortService.getRandomShip());
        System.out.println("Корабль успешно построен!\n");
    }
}
