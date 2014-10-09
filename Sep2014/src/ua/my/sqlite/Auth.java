package ua.my.sqlite;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Auth {
	
	public static void main (String [] args)throws Exception{
		Class.forName("org.sqlite.JDBC");
		Connection bd=DriverManager.getConnection("jdbc:sqlite:C:/Development/auth.db");
		Statement st=bd.createStatement();
		st.execute ("delete from auth;");
		st.execute("CREATE TABLE IF NOT EXISTS 'auth' ('id' int, 'login' text, 'password' text);");
		//st.execute("insert into auth VALUES(1, 'Pudge', 'FreshMeat');");
		//st.execute("insert into auth VALUES(2, 'CrystalMaiden', 'IceIsNice');");
		//st.execute("insert into auth VALUES(3, 'Axe', 'AXEAXE');");
			
	
		Scanner scanner = new Scanner (System.in);
		System.out.println("Please, enter your login:");
		String log = scanner.nextLine();
		System.out.println("Please, enter your password");
		String pass = scanner.nextLine();
		
		PreparedStatement pst = bd.prepareStatement("SELECT * FROM auth WHERE login = ? and password = ?");
		pst.setString(1, log);
		pst.setString(2, pass);
		ResultSet rs2 = pst.executeQuery();
		if(rs2.next()){
			System.out.println("YAY!");
		}
		else System.out.println("NOPE");
		
		st.close();
		bd.close();
		rs2.close();
		scanner.close();
	}
}
