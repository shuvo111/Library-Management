package com.library.management;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Statement;

public class dbcon {
	ResultSet rs;
	int a=0;
	public ResultSet subject(String sub)
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			final Connection connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/library","root", "");
			 String query = "SELECT Book_Name,Writer_Name,Self,Row,Price FROM book WHERE Subject='"+sub+"'";
	         java.sql.Statement stm = connection.createStatement();
	         rs=stm.executeQuery(query);
//	         while(rs.next())
//	         {
//	        	 System.out.println(rs.getString("Book_Name"));
//	         }
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
		return rs;
	}
	public int allbook()
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			final Connection connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/library","root", "");
			 String query = "SELECT Book_Name,Writer_Name,Self,Row,Price FROM book";
	         java.sql.Statement stm = connection.createStatement();
	         rs=stm.executeQuery(query);
	         while(rs.next())
	         {
	        	 a++;
	         }
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
		return a;
	}
	public ResultSet booksearch(String bookname,String writername)
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			final Connection connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/library","root", "");
			 String query = "SELECT Book_Name,Writer_Name,Self,Row,Price FROM book WHERE Book_Name='"+bookname+"'";
	         java.sql.Statement stm = connection.createStatement();
	         rs=stm.executeQuery(query);
	         
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
		return rs;
	}
	public ResultSet booksearch1(String bookname,String writername)
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			final Connection connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/library","root", "");
			 String query = "SELECT Book_Name,Writer_Name,Self,Row,Price FROM book WHERE Writer_Name='"+writername+"'";
	         java.sql.Statement stm = connection.createStatement();
	         rs=stm.executeQuery(query);
	         
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
		return rs;
	}
	public ResultSet checkuser(String email)
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			final Connection connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/library","root", "");
			 String query = "SELECT Id FROM users WHERE Email='"+email+"'";
	         java.sql.Statement stm = connection.createStatement();
	         rs=stm.executeQuery(query);
//	         while(rs.next())
//	         {
//	        	 a++;
//	        	 System.out.println(rs.getString("Id")+a);
//	         }
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
		return rs;
	}

	public void insert(String Bookname,String writer,String subject,int self,int row,int price)
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/library","root", "");
			
			dbcon a=new dbcon();
			int b=a.allbook();

            String query = "INSERT INTO book VALUES ("+b+",'" + Bookname + "','" + writer+ "','"+subject+"',"+row+","+self+"," +price+")";

            java.sql.Statement stm = connection.createStatement();

            stm.executeUpdate(query);
			
		}catch(ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
	}
//public static void main(String args[])
//{
//	dbcon a=new dbcon();
//	a. likesrarch("Ham");
//	System.out.println("ham");
//	
//	
//}
	public void insert1(String name,String contact,String id,String email,String time )
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/library","root", "");

            String query = "INSERT INTO users VALUES ('" + name +"','" + contact + "','" + id+ "','"+email+"','"+time+"')";

            java.sql.Statement stm = connection.createStatement();

            stm.executeUpdate(query);
			
		}catch(ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
	}
	
	
	
	public ResultSet Alluser()
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/library","root", "");
			 String query = "SELECT Name,Contact,Id,Email,Date FROM users";
	         java.sql.Statement stm = connection.createStatement();
	         rs=stm.executeQuery(query);         
	         
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return rs;
	}
	
	public ResultSet likesrarch(String a)
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			final Connection connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/library","root", "");
			 String query = "SELECT * FROM book WHERE Book_Name LIKE '"+a+"%'";
	         java.sql.Statement stm = connection.createStatement();
	         rs=stm.executeQuery(query);
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
		return rs;
	}	
	
}
