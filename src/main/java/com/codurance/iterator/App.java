package com.codurance.iterator;

import com.codurance.iterator.entities.DinerMenu;
import com.codurance.iterator.entities.Menu;
import com.codurance.iterator.entities.MenuItem;
import com.codurance.iterator.entities.PancakeHouseMenu;
import com.codurance.iterator.entities.Waitress;
import java.util.List;

public class App {
  public static void main(String[] args) {
    Menu pancakeHouseMenu = new PancakeHouseMenu(List.of(
        new MenuItem("K&B's Pancake Breakfast", 2.99, "Pancakes with scrambled eggs, and toast"),
        new MenuItem("Regular Pancake Breakfast", 2.99, "Pancakes with fried eggs, sausage"),
        new MenuItem("Blueberry Pancakes", 3.49, "Pancakes made with fresh blueberries, and blueberry syrup"),
        new MenuItem("Waffles", 3.59, "Waffles, with your choice of blueberries or strawberries")
    ));

    Menu dinerMenu = new DinerMenu(List.of(
        new MenuItem("Vegetarian BLT", 2.99, "Fakin Bacon with real lettuce and beef steak tomatoes"),
        new MenuItem("BLT", 3.99, "Bacon with lettuce and tomato"),
        new MenuItem("Soup of the day", 3.99, "Homemade soup")
    ));

    Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu);

    waitress.sayMenu();
  }


}
