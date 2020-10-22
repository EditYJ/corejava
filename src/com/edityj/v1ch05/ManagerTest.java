package com.edityj.v1ch05;

public class ManagerTest {
  public static void main(String[] args) {
    Manager boss = new Manager("I am Boss", 30000);
    boss.setBonus(2000);
    boss.setId();

    System.out.println(boss.getName() + " " + boss.getSalary() + boss.getDescription());
    System.out.println(boss);
  }
}
