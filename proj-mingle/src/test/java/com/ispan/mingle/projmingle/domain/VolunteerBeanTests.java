package com.ispan.mingle.projmingle.domain;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class VolunteerBeanTests {
	@Autowired
	private DataSource dataSource;

	@Test
	public void tes() throws SQLException {
		System.out.println("hahaha");
//		Connection conn = dataSource.getConnection();
//		PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM Volunteer");
//		ResultSet rs = pstmt.executeQuery();
//		while (rs.next()) {
//			System.out.println("id=" + rs.getString(1));
//			System.out.println("password=" + rs.getString(2));
//		}
	}
}
