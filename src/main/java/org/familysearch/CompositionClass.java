package org.familysearch;

/**
 * Created by bolingbrokeba on 12/31/15.
 */
public class CompositionClass {
  BaseClass baseClass = new BaseClass("Test User", null, null, 18);

  public void printMessage() {
    baseClass.printMessage();
    System.out.println("CompositionClass:printMessage");
  }
}
