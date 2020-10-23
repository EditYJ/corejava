package com.edityj.v1ch06;

import com.edityj.v1ch05.Employee;

import java.util.Arrays;

public class EmployeeSortTest {
  public static void main(String[] args) {
    Employee[] staff = new Employee[3];
    staff[0] = new Employee("Tom Boss", 90000);
    staff[1] = new Employee("Carl", 30000);
    staff[2] = new Employee("Tony", 30022);

    Arrays.sort(staff);
//    Arrays.sort(staff, (Employee a, Employee b) -> 0);

    for (Employee e : staff) {
      System.out.println("name=" + e.getName() + ",salary=" + e.getSalary());
    }
  }
}
