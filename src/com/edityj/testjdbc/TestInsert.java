package com.edityj.testjdbc;

import com.edityj.testjdbc.utils.JdbcUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;

public class TestInsert {
  public static void main(String[] args) {
    Connection conn = null;
    PreparedStatement psmt = null;

    try {
      String sql = "insert into users (`id`, `NAME`, `PASSWORD`, `email`, `birthday`) values (?,?,?,?,?)";
      conn = JdbcUtils.getConnection();
      psmt = conn.prepareStatement(sql);

      psmt.setInt(1, 5);
      psmt.setString(2, "俞杰");
      psmt.setString(3, "2233123");
      psmt.setString(4, "2132@qq.com");
      psmt.setDate(5, new java.sql.Date(new Date().getTime()));

      final int updateRes = psmt.executeUpdate();
      if (updateRes > 0) {
        System.out.println(updateRes + " 行插入成功");
      }
    } catch (SQLException throwables) {
      throwables.printStackTrace();
    }
  }
}
