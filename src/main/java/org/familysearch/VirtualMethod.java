package org.familysearch;

/**
 * Created by bolingbrokeba on 12/31/15.
 */
public class VirtualMethod {
  class A {
    String getName() {
      return "A";
    }
  }
  public class B extends A {
    String getName() {
      return "B";
    }
    String getBName() {
      return "ExtraB";
    }
  }

  public static void main(String[] args) {
    new VirtualMethod().run();
  }

  public void run() {
    printName(new A());
    printName(new B());
  }

  public void printName(A a) {
    System.out.println ("Name: " + a.getName());
    //noinspection ConstantConditions
    if (a instanceof A) {
      System.out.println("Instanceof A");
    }
    if (a instanceof B) {
      System.out.println("Instanceof B");
      System.out.println(((B)a).getBName());
    }
    System.out.println ("");
  }
}
