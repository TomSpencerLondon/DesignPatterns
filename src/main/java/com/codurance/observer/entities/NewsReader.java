package com.codurance.observer.entities;

public class NewsReader implements Observer {

  private Subject publication;

  public NewsReader(Subject publication) {
    this.publication = publication;
    publication.registerObserver(this);
  }

  @Override
  public void update(String message) {
    System.out.println("NewsReader " + hashCode() + " just read: " + message);
  }
}
