package com.edityj.testjdbc;

import com.edityj.testjdbc.utils.JdbcUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TestTransaction {

  public static void main(String[] args) {
    Connection conn = null;
    PreparedStatement psmt1 = null;
    PreparedStatement psmt2 = null;

    try {
      conn = JdbcUtils.getConnection();
      final String sql1 = "update users set PASSWORD=PASSWORD-6 where id=1";
      final String sql2 = "update users set PASSWORD=PASSWORD+6 where id=2";
      conn.setAutoCommit(false);

      psmt1 = conn.prepareStatement(sql1);
      psmt1.executeUpdate();
//      int x= 1/0;
      psmt2 = conn.prepareStatement(sql2);
      psmt2.executeUpdate();

      conn.commit();
      conn.setAutoCommit(true);
    } catch (SQLException throwables) {
      throwables.printStackTrace();
    } finally {
      JdbcUtils.release(conn, psmt1, null);
      try {
        assert psmt2 != null;
        psmt2.close();
      } catch (SQLException throwables) {
        throwables.printStackTrace();
      }
    }
  }
}
