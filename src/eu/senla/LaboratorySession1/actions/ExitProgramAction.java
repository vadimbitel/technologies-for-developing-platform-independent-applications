package eu.senla.LaboratorySession1.actions;

import eu.senla.LaboratorySession1.exceptions.SpaceException;
import eu.senla.LaboratorySession1.services.MenuService;

public class ExitProgramAction implements Action {

    @Override
    public void doAction(int index) throws SpaceException {
        MenuService.exitProgram();
    }
}
