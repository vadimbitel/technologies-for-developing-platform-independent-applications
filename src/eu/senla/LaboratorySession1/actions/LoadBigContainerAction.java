package eu.senla.LaboratorySession1.actions;

import eu.senla.LaboratorySession1.context.Context;
import eu.senla.LaboratorySession1.exceptions.SpaceException;
import eu.senla.LaboratorySession1.services.PortService;

public class LoadBigContainerAction implements Action {
    @Override
    public void doAction(int index) throws SpaceException {
        try {
            PortService.addBigContainer();
            System.out.println(Context.getTempEntities().get("Строящийся корабль"));
        } catch (SpaceException spaceException){
            System.out.println(spaceException.getMessage());
            System.out.println(Context.getTempEntities().get("Строящийся корабль"));
        }
    }
}
