package eu.senla.LaboratorySession1.initializers;

import eu.senla.LaboratorySession1.actions.*;
import eu.senla.LaboratorySession1.menu.Menu;
import eu.senla.LaboratorySession1.menu.MenuContext;
import eu.senla.LaboratorySession1.menu.MenuItem;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuInitializer {

    public static void initMenuContext() {
        MenuContext.setScanner(new Scanner(System.in));
        initRootMenu();
    }

    // 1 Level Menu
    private static void initRootMenu() {
        MenuContext.setCurrentMenu(new Menu());
        MenuContext.getCurrentMenu().setItems(new ArrayList<>());

        MenuItem amountOfWaterInPort = new MenuItem(" Посмотреть количество воды в порту.", new AmountOfWaterInPortAction());
        MenuContext.getCurrentMenu().getItems().add(amountOfWaterInPort);

        MenuItem shipsInPort = new MenuItem(" Список кораблей в порту.", new ShipsInPortAction());
        MenuContext.getCurrentMenu().getItems().add(shipsInPort);

        MenuItem shipOutOfPort = new MenuItem(" Вывести корабль из порта.", new ShipOutOfPortAction());
        MenuContext.getCurrentMenu().getItems().add(shipOutOfPort);

        MenuItem buildShip = new MenuItem(" Построить корабль.", new BuildShipAction(), initBuildShipMenu(MenuContext.getCurrentMenu()));
        MenuContext.getCurrentMenu().getItems().add(buildShip);

        MenuItem shipsInQueue = new MenuItem(" Список ожидающих кораблей.", new ShipsInQueueAction());
        MenuContext.getCurrentMenu().getItems().add(shipsInQueue);

        MenuItem moorShip = new MenuItem(" Причалить корабль.", new MoorShipAction());
        MenuContext.getCurrentMenu().getItems().add(moorShip);

        MenuItem exit = new MenuItem(" Выйти из программы.", new ExitProgramAction());
        MenuContext.getCurrentMenu().getItems().add(exit);
    }

    // 2 Level Menu
    private static Menu initBuildShipMenu(Menu previousMenu) {
        Menu buildShipMenu = new Menu();
        buildShipMenu.setItems(new ArrayList<>());

        MenuItem checkoutManually = new MenuItem(" Построить корабль вручную.", new BuildShipManuallyAction(), initBuildShipManuallyMenu(buildShipMenu));
        buildShipMenu.getItems().add(checkoutManually);

        MenuItem checkoutAutomatically = new MenuItem(" Построить корабль автоматически.", new BuildShipAutomaticallyAction());
        buildShipMenu.getItems().add(checkoutAutomatically);

        MenuItem exitToPreviousMenu = new MenuItem(" Вернуться назад.", new ReturnToPreviousMenuAction());
        buildShipMenu.getItems().add(exitToPreviousMenu);

        buildShipMenu.setPreviousMenu(previousMenu);

        return buildShipMenu;
    }

    // 3 Level Menu
    private static Menu initBuildShipManuallyMenu(Menu previousMenu) {
        Menu buildShipMenuManually = new Menu();
        buildShipMenuManually.setItems(new ArrayList<>());

        MenuItem fillFirstDeck = new MenuItem(" Заполнить палубу 1.", new FillDeckAction(), initFillDeckMenu(buildShipMenuManually));
        buildShipMenuManually.getItems().add(fillFirstDeck);

        MenuItem fillSecondDeck = new MenuItem(" Заполнить палубу 2.", new FillDeckAction(), initFillDeckMenu(buildShipMenuManually));
        buildShipMenuManually.getItems().add(fillSecondDeck);

        MenuItem setShipName = new MenuItem(" Назвать корабль.", new NameShipAction());
        buildShipMenuManually.getItems().add(setShipName);

        MenuItem completeConstruction = new MenuItem(" Завершить постройку.", new CompleteBuildingOfShipAction());
        buildShipMenuManually.getItems().add(completeConstruction);

        MenuItem exitToPreviousMenu = new MenuItem(" Отменить постройку и вернуться назад.", new CancelShipBuildingAction());
        buildShipMenuManually.getItems().add(exitToPreviousMenu);

        buildShipMenuManually.setPreviousMenu(previousMenu);

        return buildShipMenuManually;
    }

    // 4 Level Menu
    private static Menu initFillDeckMenu(Menu previousMenu) {
        Menu fillDeckMenu = new Menu();
        fillDeckMenu.setItems(new ArrayList<>());

        MenuItem fillFirstDeck = new MenuItem(" Загрузить большой контейнер (1000 л., 2 слота)", new LoadBigContainerAction());
        fillDeckMenu.getItems().add(fillFirstDeck);

        MenuItem fillSecondDeck = new MenuItem(" Загрузить маленький контейнер (450 л., 1 слот)", new LoadSmallContainerAction());
        fillDeckMenu.getItems().add(fillSecondDeck);

        MenuItem exitToPreviousMenu = new MenuItem(" Вернуться назад.", new ReturnToPreviousMenuAction());
        fillDeckMenu.getItems().add(exitToPreviousMenu);

        fillDeckMenu.setPreviousMenu(previousMenu);

        return fillDeckMenu;
    }
}
