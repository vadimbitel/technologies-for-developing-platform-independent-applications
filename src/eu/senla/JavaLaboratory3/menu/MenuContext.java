package eu.senla.JavaLaboratory3.menu;

import lombok.Getter;
import lombok.Setter;

import java.util.Scanner;

public class MenuContext {
    @Getter
    @Setter
    private static Menu currentMenu;

    @Getter
    @Setter
    private static Scanner scanner;
}
