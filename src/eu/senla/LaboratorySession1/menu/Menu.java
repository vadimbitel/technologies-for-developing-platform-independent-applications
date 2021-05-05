package eu.senla.LaboratorySession1.menu;

import eu.senla.LaboratorySession1.exceptions.SpaceException;
import lombok.Getter;
import lombok.Setter;

import java.util.InputMismatchException;
import java.util.List;

@Getter
@Setter
public class Menu {
    private List<MenuItem> items;
    private Menu previousMenu;

    public void executeSelectedFunction() {
        try {
            int index = MenuContext.getScanner().nextInt() - 1;
            System.out.println();
            try {
                items.get(index).getAction().doAction(index);
            } catch (SpaceException se) {
                System.out.println(se.getMessage());
            } catch (Exception exception) {
                System.out.println("Такого пункта нет!\n");
            }
        } catch (InputMismatchException inputMismatchException) {
            System.out.println("\nОшибка формата данных!\n");
            MenuContext.getScanner().nextLine();
        }
    }
}
