package com.edityj.testjdbc;

import com.edityj.testjdbc.utils.JdbcUtils;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class UseJdbcUtil {
  public static void main(String[] args) {
    Connection connection = null;
    Statement statement = null;
    try {
      connection = JdbcUtils.getConnection();
      statement = connection.createStatement();

      String sql1 = "INSERT INTO users (`id`,`NAME`, `PASSWORD`, `email`, `birthday`) VALUES (4,'edityj', 'nidhahs', '1123@qq.com', '2020-03-22')";
      final int row = statement.executeUpdate(sql1);
      if (row > 0) {
        System.out.println("插入成功, rows: " + row);
      }
    } catch (SQLException throwables) {
      throwables.printStackTrace();
    } finally {
      JdbcUtils.release(connection, statement, null);
    }
  }
}
