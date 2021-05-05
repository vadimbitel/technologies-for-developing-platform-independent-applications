package eu.senla.JavaLaboratory3.initializers;

import eu.senla.JavaLaboratory3.actions.*;
import eu.senla.JavaLaboratory3.menu.*;

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

        MenuItem taskOne = new MenuItem(" Task one.", new ToTaskOneMenuAction(),
                initTaskOneMenu(MenuContext.getCurrentMenu()));
        MenuContext.getCurrentMenu().getItems().add(taskOne);

        MenuItem taskTwo = new MenuItem(" Task two.", new ToTaskTwoMenuAction(),
                initTaskTwoMenu(MenuContext.getCurrentMenu()));
        MenuContext.getCurrentMenu().getItems().add(taskTwo);

        MenuItem exit = new MenuItem(" Exit the program.", new ExitProgramAction());
        MenuContext.getCurrentMenu().getItems().add(exit);
    }

    // 2 Level Menu
    private static Menu initTaskOneMenu(Menu previousMenu) {
        Menu taskOneMenu = new Menu();
        taskOneMenu.setItems(new ArrayList<>());

        MenuItem displayMaxDigit = new MenuItem(" Display max digit from random number.",
                new DisplayMaxDigitAction());
        taskOneMenu.getItems().add(displayMaxDigit);

        MenuItem displaySumOfFirstDigits = new MenuItem(" Display the sum of the first digits of three numbers.",
                new DisplaySumOfFirstDigitsAction());
        taskOneMenu.getItems().add(displaySumOfFirstDigits);

        MenuItem displayDifferenceBetweenNumbers = new MenuItem(" Display difference between the first " +
                "two numbers and the third number.", new DisplayDifferenceBetweenNumbersAction());
        taskOneMenu.getItems().add(displayDifferenceBetweenNumbers);

        MenuItem displaySumOfDigits = new MenuItem(" Display sum of digits in random number.",
                new DisplaySumOfDigitsAction());
        taskOneMenu.getItems().add(displaySumOfDigits);

        MenuItem exitToPreviousMenu = new MenuItem(" Exit to previous menu.", new ReturnToPreviousMenuAction());
        taskOneMenu.getItems().add(exitToPreviousMenu);

        taskOneMenu.setPreviousMenu(previousMenu);

        return taskOneMenu;
    }

    private static Menu initTaskTwoMenu(Menu previousMenu) {
        Menu taskTwoMenu = new Menu();
        taskTwoMenu.setItems(new ArrayList<>());

        MenuItem displayMaxDigit = new MenuItem(" Display the weight of the stored item.",
                new DisplayWeightOfStoredItemAction());
        taskTwoMenu.getItems().add(displayMaxDigit);

        MenuItem exitToPreviousMenu = new MenuItem(" Exit to previous menu.", new EndTaskTwoAction());
        taskTwoMenu.getItems().add(exitToPreviousMenu);

        taskTwoMenu.setPreviousMenu(previousMenu);

        return taskTwoMenu;
    }
}
