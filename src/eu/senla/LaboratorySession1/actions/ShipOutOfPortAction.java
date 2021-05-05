package eu.senla.LaboratorySession1.actions;

import eu.senla.LaboratorySession1.menu.MenuContext;
import eu.senla.LaboratorySession1.services.PortService;

public class ShipOutOfPortAction implements Action {

    @Override
    public void doAction(int index) {
        if (PortService.getNumberOfShips() == 0) {
            System.out.println("В порту нет кораблей!\n");
        } else {
            do {
                PortService.displayShipsInfo();
                System.out.print(PortService.getNumberOfShips() + 1 + ". Вернуться назад.\nВаш выбор: ");
                index = MenuContext.getScanner().nextInt() - 1;
                System.out.println();
                try {
                    if (index != PortService.getNumberOfShips()) {
                        PortService.removeShip(index);
                        System.out.println("Корабль отчалил из порта!\n");
                    } else {
                        break;
                    }
                } catch (Exception exception) {
                    System.out.println("Корабля с таким номером нет!\n");
                }
                if (PortService.getNumberOfShips() == 0) {
                    break;
                }
            } while (true);
        }
    }
}
