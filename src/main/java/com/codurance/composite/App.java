package com.codurance.composite;

import com.codurance.composite.entities.Menu;
import com.codurance.composite.entities.MenuComponent;
import com.codurance.composite.entities.MenuItem;
import com.codurance.composite.entities.Waitress;

public class App {

  public static void main(String[] args) {

    MenuComponent starterMenu = new Menu("Starter Menu", "Our starters");
    MenuComponent mainMenu = new Menu("Main Menu", "Our mains");
    MenuComponent desertMenu = new Menu("Desert Menu", "Our deserts");

    MenuComponent menu = new Menu("All Menus", "Stay for the day! Eat starter, main, desert!");

    starterMenu.add(new MenuItem("Soup of the day", 3.99, "Homemade soup"));
    starterMenu.add(new MenuItem("Mixed platter", 4.99, "Assorted meats"));

    mainMenu.add(new MenuItem("Vegetarian BLT", 2.99, "Fakin Bacon with real lettuce and beef steak tomatoes"));
    mainMenu.add(new MenuItem("BLT", 3.99, "Bacon with lettuce and tomato"));

    desertMenu.add(new MenuItem("Ice cream", 3.45, "Yummy ice cream"));
    desertMenu.add(new MenuItem("Chocolate brownies", 4.50, "Chocolaty goodness!"));

    menu.add(starterMenu);
    menu.add(mainMenu);
    menu.add(desertMenu);

    Waitress waitress = new Waitress(menu);

    waitress.sayMenu();
  }
}
