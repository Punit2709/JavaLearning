import java.sql.*;

class Database
{

public static void main(String args[]) throws Exception
{
	Class.forName("org.sqlite.JDBC");
	Connection con = DriverManager.getConnection("jdbc:sqlite:D://SQLLITE//sqlite-tools-win32-x86-3420000//univ.db");
	Statement stm = con.createStatement();
	ResultSet rs = stm.executeQuery("select * from Department");
	
	int dno;
	String dname;

	while(rs.next())
	{
		dno = rs.getInt("deptno");
		dname = rs.getString("dname");
		
		System.out.println(dno + "	" + dname);
	}
	
}

}