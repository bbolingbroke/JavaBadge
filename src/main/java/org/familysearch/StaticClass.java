package org.familysearch;

/**
 * Created by bolingbrokeba on 12/31/15.
 */
public class StaticClass {
  public void printMessage() {
    BaseClass.printStaticMessage();
    System.out.println("StaticClass:printMessage");
  }
}
