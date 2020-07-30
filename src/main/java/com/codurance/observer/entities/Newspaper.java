package com.codurance.observer.entities;

import java.util.ArrayList;
import java.util.List;

public class Newspaper implements Subject {
  List<Observer> observers = new ArrayList<>();
  private String headline = "Narrowboat on the loose";

  public void setHeadline(String newHeadline){
    headline = newHeadline;
    notifyObservers();
  }

  @Override
  public void registerObserver(Observer o) {
    observers.add(o);
  }

  @Override
  public void removeObserver(Observer o) {
    observers.remove(o);
  }

  @Override
  public void notifyObservers() {
    observers.forEach(o -> o.update(headline));
  }
}
