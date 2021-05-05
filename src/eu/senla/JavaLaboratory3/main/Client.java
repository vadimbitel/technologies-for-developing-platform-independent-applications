package eu.senla.JavaLaboratory3.main;

import eu.senla.JavaLaboratory3.menu.MenuContext;

public class Client {
    public static void userInterface(){
        while (true){
            for(int i = 0; i < MenuContext.getCurrentMenu().getItems().size(); i++) {
                System.out.println( (i + 1) + "." + MenuContext.getCurrentMenu().getItems().get(i).getText());
            }
            System.out.print("Your choice: ");
            MenuContext.getCurrentMenu().executeSelectedFunction();
        }
    }
}
