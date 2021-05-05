package eu.senla.JavaLaboratory3.menu;

import eu.senla.JavaLaboratory3.actions.Action;
import lombok.Data;

@Data
public class MenuItem {
    private String text;
    private Action action;
    private Menu submenu;

    public MenuItem(String text, Action action, Menu submenu) {
        this.text = text;
        this.action = action;
        this.submenu = submenu;
    }

    public MenuItem(String text, Action action) {
        this.text = text;
        this.action = action;
    }
}
