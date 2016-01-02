package org.familysearch;

/**
 * Created by bolingbrokeba on 12/31/15.
 */
public class BaseClass {
  String name;
  String email;
  String phone;
  int age;

  public BaseClass(String name, String email, String phone, int age) {
    this.name = name;
    this.email = email;
    this.phone = phone;
    this.age = age;
  }

  public void printMessage() {
    System.out.println("BaseClass:printMessage");
  }

  public static void printStaticMessage() {
    System.out.println("BaseClass:printStaticMessage");
  }
}
