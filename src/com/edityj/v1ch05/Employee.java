package com.edityj.v1ch05;

public class Employee extends Person {
  private static int nextId = 1;

  private String name;
  private double salary;
  private int id;

  public Employee(String name, double salary) {
    super(name);
    this.name = name;
    this.salary = salary;
    this.id = 0;
  }

  @Override
  public String getDescription() {
    return "name: = " + name;
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
}
