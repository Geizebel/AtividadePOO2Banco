package br.com.Poo2Ati.confi;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public abstract class Banco {
	 private static final String url= "jdbc:postgresql://localhost:5432/poo";
	 private static final String user = "postgres";
	 private static final String pass = "0000";
	 
	 public static Connection getConnection() throws SQLException  {
		 return DriverManager.getConnection(url,user,pass);
	 }

}
