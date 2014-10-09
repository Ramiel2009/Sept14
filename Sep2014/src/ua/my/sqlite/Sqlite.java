package ua.my.sqlite;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import org.sqlite.*;

public class Sqlite {
	
	public static void main (String [] args)throws Exception{
		Class.forName("org.sqlite.JDBC");
		Connection bd=DriverManager.getConnection("jdbc:sqlite:C:/Development/atod.db");
		Statement st=bd.createStatement();
		//st.execute(""); //запрос без возварата результата, st.executeQuery("") - с возвратом
		/*st.execute("CREATE TABLE IF NOT EXISTS 'items' ('id' int, 'name' text);");
		st.execute("insert into items VALUES(1, 'Mask of masness');");
		st.execute("insert into items VALUES(2, 'Heart of Tarasque');");
		ResultSet rs=st.executeQuery("select * from items");
		*/
		PreparedStatement pst=bd.prepareStatement("SELECT * FROM items WHERE name=?");
		pst.setString(1, "Mask of masness");
		ResultSet rs=pst.executeQuery();
		
		while(rs.next()){
			System.out.print(rs.getString(1));
			System.out.print("-");
			System.out.println(rs.getString(2));
		}
		//st.close();
		bd.close();
		rs.close();
	}
}
