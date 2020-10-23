package com.edityj.v1ch05;

import java.util.Date;
import java.util.GregorianCalendar;

public class Employee extends Person implements Comparable<Employee>, Cloneable {
  private static int nextId = 1;

  private String name;
  private double salary;
  private Date hireDay;
  private int id;

  public Employee(String name, double salary) {
    super(name);
    this.name = name;
    this.salary = salary;
    this.id = 0;
    this.hireDay = new Date();
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

  public void setHireDay(int year, int month, int day) {
    final Date time = new GregorianCalendar(year, month - 1, day).getTime();
    this.hireDay = time;
  }

  public Date getHireDay() {
    return hireDay;
  }

  @Override
  public int compareTo(Employee o) {
    return Double.compare(this.salary, o.salary);
  }

  @Override
  public Employee clone() throws CloneNotSupportedException {
    final Employee employee = (Employee) super.clone();
    employee.hireDay = (Date) hireDay.clone();

    return employee;
  }
}
