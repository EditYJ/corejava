package com.edityj.v1ch04;

public class StaticTest {
  public static void main(String[] args) {
    Employee[] staff = new Employee[3];
    staff[0] = new Employee("Tom", 29999);
    staff[1] = new Employee("Dick", 60000);
    staff[2] = new Employee("Harry", 544444);

    for (Employee e :
        staff) {
      e.setId();
      System.out.println("name: " + e.getName() + " id: " + e.getId() + " salary: " + e.getSalary());
    }
  }
}

class Employee {
  private static int nextId = 1;

  private String name;
  private double salary;
  private int id;

  public Employee(String name, double salary) {
    this.name = name;
    this.salary = salary;
    this.id = 0;
  }

  public String getName() {
    return name;
  }

  public double getSalary() {
    return salary;
  }

  public int getId() {
    return id;
  }

  public static int getNextId() {
    return nextId;
  }

  public void setId() {
    this.id = nextId;
    nextId++;
  }

  public static void main(String[] args) {
    final Employee employee = new Employee("EditYJ", 40000);
    System.out.println(employee.getName() + " " + employee.getSalary());
  }
}
