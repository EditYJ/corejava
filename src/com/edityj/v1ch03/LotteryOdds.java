package com.edityj.v1ch03;

import java.math.BigInteger;
import java.util.Scanner;

// 计算中奖概率
public class LotteryOdds {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.println("请输入数字数量：");
    int k = in.nextInt();

    System.out.println("请输入你要猜的最大数字: ");
    int n = in.nextInt();

//    int lotterOdds = 1;
//    for (int i = 1; i < k; i++) {
//      lotterOdds = lotterOdds * (n - i + 1) / i;
//    }

    BigInteger lotterOdds = BigInteger.ONE;
    for (int i = 1; i < k; i++) {
      lotterOdds = lotterOdds.multiply(BigInteger.valueOf(n - i + 1)).divide(BigInteger.valueOf(i));
    }

    System.out.println(lotterOdds);
  }
}
