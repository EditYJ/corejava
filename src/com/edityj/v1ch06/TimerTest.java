package com.edityj.v1ch06;

import javax.swing.*;
import java.awt.*;
import java.util.Date;

public class TimerTest {
  public static void main(String[] args) {
    Timer t = new Timer(1000, e -> {
      System.out.println("此刻，时间为：" + new Date());
      Toolkit.getDefaultToolkit().beep();
    });
    t.start();
    JOptionPane.showMessageDialog(null, "退出？");
    System.exit(0);
  }
}
