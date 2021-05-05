package eu.senla.LaboratorySession1.actions;

import eu.senla.LaboratorySession1.context.Context;
import eu.senla.LaboratorySession1.exceptions.SpaceException;
import eu.senla.LaboratorySession1.services.MenuService;

public class CancelShipBuildingAction implements Action {

    @Override
    public void doAction(int index) throws SpaceException {
        MenuService.goToPreviousMenu();
        Context.getTempEntities().remove("Строящийся корабль");
        Context.getTempEntities().remove("Номер заполняемой палубы");
    }
}
