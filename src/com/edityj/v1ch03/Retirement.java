package com.edityj.v1ch03;

import java.util.Scanner;

//计算需要多长时间才能够存储一定数量的退休金， 假定每年存入相同数量的金额而且利率是固定的。
public class Retirement {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.println("你需要寸多少钱？");
    double goal = in.nextDouble();

    System.out.println("你每年存多少钱？");
    double insertMoney = in.nextDouble();

    System.out.println("利率是多少？");
    double insertRate = in.nextDouble();

    double balance = 0;
    int years = 0;

    // 当存款未到目标时持续循环
    while (balance < goal) {
      balance += insertMoney;
      double interest = balance * insertRate / 100;
      balance += interest;
      years++;
    }

    System.out.printf("需要%d年", years);
  }
}
