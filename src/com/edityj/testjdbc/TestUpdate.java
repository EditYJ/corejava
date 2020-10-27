package com.edityj.testjdbc;

import com.edityj.testjdbc.utils.JdbcUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TestUpdate {
  public static void main(String[] args) {
    Connection conn = null;
    PreparedStatement psmt = null;

    try {
      String sql = "update users set `NAME`=? where id=?";
      conn = JdbcUtils.getConnection();
      psmt = conn.prepareStatement(sql);

      psmt.setString(1, "成龙");
      psmt.setInt(2, 5);

      final int updateRes = psmt.executeUpdate();
      if (updateRes > 0) {
        System.out.println(updateRes + " 行更新成功");
      }
    } catch (SQLException throwables) {
      throwables.printStackTrace();
    }
  }
}
