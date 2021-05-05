package eu.senla.LaboratorySession1.actions;

import eu.senla.LaboratorySession1.context.Context;
import eu.senla.LaboratorySession1.exceptions.SpaceException;
import eu.senla.LaboratorySession1.services.MenuService;

public class FillDeckAction implements Action {
    @Override
    public void doAction(int index) throws SpaceException {
        MenuService.goToSubmenu(index);
        Context.getTempEntities().put("Номер заполняемой палубы", index);
        System.out.println(Context.getTempEntities().get("Строящийся корабль"));
    }
}
