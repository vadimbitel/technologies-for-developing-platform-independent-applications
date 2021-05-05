package eu.senla.LaboratorySession1.actions;

import eu.senla.LaboratorySession1.context.Context;
import eu.senla.LaboratorySession1.entities.Container;
import eu.senla.LaboratorySession1.entities.Deck;
import eu.senla.LaboratorySession1.entities.Ship;
import eu.senla.LaboratorySession1.exceptions.SpaceException;
import eu.senla.LaboratorySession1.services.MenuService;

public class BuildShipManuallyAction implements Action {
    @Override
    public void doAction(int index) throws SpaceException {
        Deck[] decks = new Deck[]{new Deck(), new Deck()};
        for (var deck : decks) {
            deck.setOccupiedSlots(0);
            deck.setContainers(new Container[]{null, null});
        }
        Context.getTempEntities().put("Строящийся корабль", new Ship("NoName", decks));
        MenuService.goToSubmenu(index);
    }
}
