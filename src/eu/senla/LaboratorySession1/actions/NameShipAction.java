package eu.senla.LaboratorySession1.actions;

import eu.senla.LaboratorySession1.context.Context;
import eu.senla.LaboratorySession1.entities.Ship;
import eu.senla.LaboratorySession1.menu.MenuContext;

public class NameShipAction implements Action {

    @Override
    public void doAction(int index) {
        System.out.print("Название корабля: ");
        ((Ship)Context.getTempEntities().get("Строящийся корабль")).setShipName(MenuContext.getScanner().next());
        System.out.println();
        System.out.println(Context.getTempEntities().get("Строящийся корабль"));
    }
}
