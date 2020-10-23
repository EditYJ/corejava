package com.edityj.v1ch03;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Logger;

public class InputTest {
  final static String THIS_PATH = System.getProperty("user.dir");

  public static void main(String[] args) {
    final String path = THIS_PATH + "\\README.md";
    StringBuilder content = new StringBuilder();

    try (Scanner fileIn = new Scanner(Paths.get(path), "utf-8");) {
      // 读取原来数据
      while (fileIn.hasNext()) {
        final String nextLine = fileIn.nextLine();
        content.append(nextLine).append("\n");
      }
      // 写入新数据
      content.append("我是测试行37123213");
      PrintWriter out = new PrintWriter(path, "utf-8");
      out.print(content);
      Logger.getGlobal().info("File->" + content);
//      System.out.println(content);
      out.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
