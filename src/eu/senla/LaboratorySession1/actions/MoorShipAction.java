package eu.senla.LaboratorySession1.actions;

import eu.senla.LaboratorySession1.context.Context;
import eu.senla.LaboratorySession1.exceptions.SpaceException;
import eu.senla.LaboratorySession1.menu.MenuContext;
import eu.senla.LaboratorySession1.services.HarborService;
import eu.senla.LaboratorySession1.services.PortService;

public class MoorShipAction implements Action {

    @Override
    public void doAction(int index) throws SpaceException {
        if (HarborService.getNumberOfShips() == 0) {
            System.out.println("Очередь пуста!\n");
        } else {
            do {
                HarborService.displayShipsInfo();
                System.out.print(HarborService.getNumberOfShips() + 1 + ". Вернуться назад.\nВаш выбор: ");
                index = MenuContext.getScanner().nextInt() - 1;
                System.out.println();
                if (PortService.getNumberOfShips() > 9) {
                    throw new SpaceException("Все рейды заняты!\n");
                } else {
                    try {
                        if (index != Context.getHarbor().getShips().size()) {
                            PortService.addShip(HarborService.getDockingShip(index));
                            PortService.unloadTheShip(PortService.getNumberOfShips() - 1);
                            HarborService.removeShip(index);
                            System.out.println("Корабль пришвартован!\n");
                        } else {
                            break;
                        }
                    } catch (Exception exception) {
                        System.out.println("Корабля с таким номером нет!\n");
                    }
                    if (HarborService.getNumberOfShips() == 0) {
                        break;
                    }
                }
            } while (true);
        }
    }
}
