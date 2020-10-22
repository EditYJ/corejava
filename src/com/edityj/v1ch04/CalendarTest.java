package com.edityj.v1ch04;

import java.time.DayOfWeek;
import java.time.LocalDate;

/**
 * 把玩 LocalDate
 *
 * @author EditYJ
 * <em>lalala</em>
 * {@code
 * int month = date.getMonthValue();
 * int today = date.getDayOfMonth();
 * }
 */
public class CalendarTest{
  public static void main(String[] args) {
    // 当前日期
    LocalDate date = LocalDate.now();
    // 获取当前的月和日
    int month = date.getMonthValue();
    int today = date.getDayOfMonth();

    // 设置date为本月的第一天
    date = date.minusDays(today - 1);
    final DayOfWeek weekDay = date.getDayOfWeek();
    // 第一天为周几？
    int value = weekDay.getValue();

    System.out.println("Mon\tTue\tWed\tThu\tFir\tSat\tSun");
    for (int i = 1; i < value; i++) {
      System.out.print("\t");
    }

    // 打印日历
    while (date.getMonthValue() == month) {
      final int dayOfMonth = date.getDayOfMonth();
      System.out.printf("%3d", dayOfMonth);
      if (dayOfMonth == today) {
        System.out.print("*");
      } else {
        System.out.print(" ");
      }
      date = date.plusDays(1);
      if (date.getDayOfWeek().getValue() == 1) System.out.println();
    }
  }
}
