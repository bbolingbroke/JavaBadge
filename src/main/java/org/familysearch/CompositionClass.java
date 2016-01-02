package org.familysearch;

/**
 * Created by bolingbrokeba on 12/31/15.
 */
public class CompositionClass {
  BaseClass baseClass = new BaseClass();

  public void printMessage() {
    baseClass.printMessage();
    System.out.println("CompositionClass:printMessage");
  }
}
