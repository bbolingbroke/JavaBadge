package org.familysearch;

/**
 * Created by bolingbrokeba on 12/31/15.
 */
public class InheritedClass extends BaseClass {
  public InheritedClass(String name, String email, String phone, int age) {
    super(name, email, phone, age);
  }

  public InheritedClass(String name, String email, String phone) {
    this(name, email, phone, 18); //Default age to 18
  }

  public InheritedClass(String name, String email) {
    this(name, email, null); //Default phone to null
  }

  public InheritedClass(String name) {
    this(name, null); //Default email to null
  }

  @Override
  public void printMessage() {
    super.printMessage();
    System.out.println("InheritedClass:printMessage");
  }
}
