package org.familysearch;

/**
 * Created by bolingbrokeba on 12/31/15.
 */
public class StaticClass {
  public void printMessage() {
    BaseClass.printStaticMessage();
    System.out.println("StaticClass:printMessage");
  }

  public static void alterParams(int size, Integer length, final String value) {
    size = 12;
    length = 10;
//    value = "infinite"; //Will not compile, because a final parameter cannot be modified.
  }
}
