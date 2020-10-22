package com.edityj.v1ch03;

import java.util.Arrays;

public class CompoundInterest {
  public static void main(String[] args) {
    final double STARTRATE = 10;
    final int NRATES = 6;
    final int NYEARS = 10;

    // set interest rates to 10 ..... 15%
    double[] interestRate = new double[NRATES];
    for (int j = 0; j < interestRate.length; j++) {
      interestRate[j] = (STARTRATE + j) / 100.0;
    }

    double[][] balance = new double[NYEARS][NRATES];

    Arrays.fill(balance[0], 10000);

    for (int i = 1; i < balance.length; i++) {
      for (int j = 0; j < balance[i].length; j++) {
        double oldBalance = balance[i - 1][j];

        // 计算利率
        double interest = oldBalance * interestRate[j];

        // 计算这一年的余额
        balance[i][j] = oldBalance + interest;
      }
    }

    for (double v : interestRate) {
      System.out.printf("%9.0f%%", 100 * v);
    }
    System.out.println();

    // 打印余额表
    for (double[] row : balance) {
      for (double b : row) {
        System.out.printf("%10.2f", b);
      }
      System.out.println();
    }
  }
}
