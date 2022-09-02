package com.demxntia.Petrescue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@SpringBootTest
class PetRescueApplicationTests {

	@Autowired
	DataSource dataSource;

	@Test
	public void testDataSource() throws SQLException {
		System.out.println(dataSource.getClass());

		Connection connection = dataSource.getConnection();
		System.out.println(connection);
		connection.close();
	}
}


