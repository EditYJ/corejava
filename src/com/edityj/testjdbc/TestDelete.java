package com.edityj.testjdbc;

import com.edityj.testjdbc.utils.JdbcUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TestDelete {
  public static void main(String[] args) {
    Connection conn = null;
    PreparedStatement psmt = null;

    try {
      String sql = "delete from users where id=?";
      conn = JdbcUtils.getConnection();
      psmt = conn.prepareStatement(sql);

      psmt.setInt(1, 5);

      final int updateRes = psmt.executeUpdate();
      if (updateRes > 0) {
        System.out.println(updateRes + " 行删除成功");
      }
    } catch (SQLException throwables) {
      throwables.printStackTrace();
    }
  }
}
