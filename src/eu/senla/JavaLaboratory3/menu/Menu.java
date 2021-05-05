package eu.senla.JavaLaboratory3.menu;

import lombok.Data;
import java.util.InputMismatchException;
import java.util.List;

@Data
public class Menu {
    private List<MenuItem> items;
    private Menu previousMenu;

    public void executeSelectedFunction() {
        try {
            int index = MenuContext.getScanner().nextInt() - 1;
            System.out.println();
            try {
                items.get(index).getAction().invoke(index);
            }  catch (Exception exception) {
                System.out.print("There is no such item! \n");
            }
        } catch (InputMismatchException inputMismatchException){
            System.out.println("\nData format error! \n");
            MenuContext.getScanner().nextLine();
        }
    }
}
