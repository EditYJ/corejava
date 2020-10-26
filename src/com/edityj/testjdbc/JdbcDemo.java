package com.edityj.testjdbc;

import java.sql.*;

public class JdbcDemo {
  public static void main(String[] args) throws ClassNotFoundException, SQLException {
    // 1. 加载驱动
    // DriverManager.registerDriver(new com.mysql.jdbc.Driver());
    // 以上语句不推荐使用，因为内部源码静态代码块已经注册，无需再次注册
    Class.forName("com.mysql.jdbc.Driver");

    // 2. 配置用户信息
    // useUnicode 支持中文
    // characterEncoding utf8格式转码
    // useSSL 安全连接
    String url = "jdbc:mysql://localhost:3306/jdbcstudy?useUnicode=true&characterEncoding=utf8&useSSL=false";
    String username = "root";
    String password = "123456";

    // 3. 填入参数连接数据库
    // connection 代表数据库，可以做一些数据库层级的事情
    final Connection connection = DriverManager.getConnection(url, username, password);

    // 4. 得到执行SQL的对象
    final Statement statement = connection.createStatement();

    // 5. 新建查询SQL执行输出结果
    String sql = "SELECT * FROM users";
    final ResultSet resultSet = statement.executeQuery(sql);
    while (resultSet.next()) {
      System.out.println("id=\t" + resultSet.getObject("id"));
      System.out.println("name=\t" + resultSet.getObject("NAME"));
      System.out.println("password=\t" + resultSet.getObject("PASSWORD"));
      System.out.println("email=\t" + resultSet.getObject("email"));
      System.out.println("birthday=\t" + resultSet.getObject("birthday"));
      System.out.println();
    }

    //6. 释放资源
    resultSet.close();
    statement.close();
    connection.close();
  }
}
