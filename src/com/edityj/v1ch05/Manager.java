package com.edityj.v1ch05;

public class Manager extends Employee {

  private double bonus;

  public Manager(String name, double salary) {
    super(name, salary);
  }

  public double getSalary() {
    double baseSalary = super.getSalary();
    return baseSalary + bonus;
  }

  public void setBonus(double bonus) {
    this.bonus = bonus;
  }

  @Override
  public String toString() {

    return getClass().getName() + "\n" + "Manager{" +
        "bonus=" + bonus +
        '}';
  }
}
