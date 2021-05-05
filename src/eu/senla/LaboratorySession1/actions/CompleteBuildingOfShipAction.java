package eu.senla.LaboratorySession1.actions;

import eu.senla.LaboratorySession1.context.Context;
import eu.senla.LaboratorySession1.entities.Ship;
import eu.senla.LaboratorySession1.services.HarborService;
import eu.senla.LaboratorySession1.services.MenuService;

public class CompleteBuildingOfShipAction implements Action {

    @Override
    public void doAction(int index) {
        HarborService.addShip((Ship) Context.getTempEntities().get("Строящийся корабль"));
        MenuService.goToPreviousMenu();
        Context.getTempEntities().remove("Строящийся корабль");
        Context.getTempEntities().remove("Номер заполняемой палубы");
        System.out.println("Корабль успешно построен!\n");
    }
}
