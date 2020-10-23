package com.edityj.v1ch06;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class InnerClassTest {
  public static void main(String[] args) {
    TalkClock clock = new TalkClock(1000, true);
    clock.start();
    JOptionPane.showMessageDialog(null, "退出？");
    System.exit(0);
  }
}

class TalkClock {
  private int interval;
  private boolean beep;

  public TalkClock(int interval, boolean beep) {
    this.interval = interval;
    this.beep = beep;
  }

  public void start(){
    final TimePrinter printer = new TimePrinter();

    Timer t = new Timer(interval, printer);
    t.start();
  }

  public class TimePrinter implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e) {
      System.out.println("此刻，时间是："+ new Date());
      if (beep) Toolkit.getDefaultToolkit().beep();
    }
  }
}
