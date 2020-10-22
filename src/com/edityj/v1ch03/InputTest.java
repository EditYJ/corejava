package com.edityj.v1ch03;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.nio.file.Paths;
import java.util.Scanner;

public class InputTest {
  final static String THIS_PATH = System.getProperty("user.dir");

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    // get first input
//    System.out.println("你的名字？");
//    String name = in.nextLine();

    // get second input
//    System.out.println("你的年龄？");
//    int age = in.nextInt();

    // display user info
//    System.out.println("姓名：" + name + "\n" + "年龄：" + age);

    // 读取和存取
    StringBuilder content = new StringBuilder();
    try {
      final String path = THIS_PATH + "\\README.md";

      // 读取原来数据
      Scanner fileIn = new Scanner(Paths.get(path), "utf-8");
      while (fileIn.hasNext()) {
        content.append(fileIn.nextLine()).append("\n");
      }
      fileIn.close();

      // 写入新数据
      content.append("我是测试行3777");
      PrintWriter out = new PrintWriter(path, "utf-8");
      out.print(content);
      out.close();

      System.out.println(content);
    } catch (IOException e) {
      System.out.println(e.toString());
    }
  }
}
