package eu.senla.JavaLaboratory3.actions;

import eu.senla.JavaLaboratory3.services.MenuService;

public class ExitProgramAction implements Action {
    @Override
    public void invoke(int index) {
        MenuService.exitProgram();
    }
}
