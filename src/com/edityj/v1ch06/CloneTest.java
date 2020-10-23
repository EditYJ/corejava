package com.edityj.v1ch06;

import com.edityj.v1ch05.Employee;

public class CloneTest {
  public static void main(String[] args) {
    try {
      Employee original = new Employee("TomBoss", 20000);
      original.setHireDay(2001, 3, 12);
      final Employee clone = original.clone();
      clone.setHireDay(2200, 2, 1);
      System.out.println("original=" + original.getHireDay());
      System.out.println("clone=" + clone.getHireDay());
    } catch (CloneNotSupportedException e) {
      e.printStackTrace();
    }

  }
}
