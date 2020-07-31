package com.codurance.composite.entities;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Menu implements MenuComponent {

  List<MenuComponent> menuComponents = new ArrayList<>();
  String name;
  String description;

  public Menu(String name, String description) {
    this.name = name;
    this.description = description;
  }

  @Override
  public void add(MenuComponent menuComponent) {
    menuComponents.add(menuComponent);
  }

  @Override
  public String toString() {
    return this.name + "\n" +
         "================\n" +
        this.description + "\n\n" +
        menuComponents.stream()
            .map(MenuComponent::toString)
            .collect(Collectors.joining("\n"))
        + "\n";
  }
}
