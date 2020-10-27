package com.edityj.testjdbc;

import com.edityj.testjdbc.utils.JdbcUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TestQuery {
  public static void main(String[] args) {
    Connection conn = null;
    PreparedStatement psmt = null;

    try {
      String sql = "select * from users where id>?;";
      conn = JdbcUtils.getConnection();
      psmt = conn.prepareStatement(sql);

      psmt.setInt(1, 2);

      final ResultSet resultSet = psmt.executeQuery();
      while (resultSet.next()){
        System.out.println(resultSet.getString("NAME"));
      }
    } catch (SQLException throwables) {
      throwables.printStackTrace();
    }
  }
}
