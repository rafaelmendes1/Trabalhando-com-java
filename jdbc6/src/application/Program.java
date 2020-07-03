package application;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import db.DB;
import db.DbIntegrityException;

public class Program {

	public static void main(String[] args) {
			Connection conn = null;
			Statement st = null;
		try {
			conn = DB.getConnction();
			
			conn.setAutoCommit(false);
			
			st = conn.createStatement();
			
			int rows = st.executeUpdate("UPDATE seller SET BaseSalary = 3090 WHERE Department = 2");
			
			int x = 1;
			if(x < 2) {
				throw new SQLException("Fake Error");
			}
			
			int rows2 = st.executeUpdate("UPDATE seller SET BaseSalary = 2090 WHERE Department = 3");
			
			conn.commit();
			
			System.out.println("rows1 " + rows);
			System.out.println("rows2 " + rows2);
		}
		catch(SQLException e) {
			try {
				conn.rollback();
				throw new DbIntegrityException("Transaction rolled back! Caused by: " + e.getMessage());
			} catch (SQLException e1) {
				throw new DbIntegrityException("Error trying to rollback! Caused by: " + e1.getMessage());
			}
		}
		finally {
			DB.closeStatement(st);
			DB.closeConnection();
		}
		
	}

}
