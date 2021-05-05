package eu.senla.LaboratorySession1.menu;

import eu.senla.LaboratorySession1.actions.Action;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
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
