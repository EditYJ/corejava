package com.edityj.v1ch05;

import java.util.Scanner;

public class EnumTest {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter a Size: ");
    String input = in.next().toUpperCase();

    Size size = Enum.valueOf(Size.class, input);
    Size size1 = Size.valueOf(input);
    System.out.println(size.getAbbreviation());
//    System.out.println(size.ordinal());
    if (size == Size.EXTRA_LARGE){
      System.out.println("你好 太大了");
    }
  }
}

enum Size {
  SMALL("S"),
  MEDIUM("M"),
  LARGE("L"),
  EXTRA_LARGE("XL");

  private final String abbreviation;

  Size(String abbreviation) {
    this.abbreviation = abbreviation;
  }

  public String getAbbreviation() {
    return abbreviation;
  }
}
