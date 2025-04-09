import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCConnection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			//1.Register the Driver Class
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = null;
			
			//2.Create connection
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/assignments", "root", "security");
			System.out.println(con);
			PreparedStatement ps = null;
			
			//3.Create Statement
			Statement stmt = con.createStatement();
			
			//4. Execute Queries
			
			//Creating the table in the database
			/*String create = "create table person (person_id int primary key, name varchar(50),age int)";
			stmt.executeUpdate(create);
			System.out.println("Created table in given database.");
			*/
			
			//Inserting data into table
			/*String insert = "insert into person values (1, 'Ram', 20),(2, 'Sham', 20)";
			ps = con.prepareStatement(insert);
			ps.execute();
			System.out.println("Data inserted in the table.");
			*/
			
			//Updating data in the table
			/*String update = "update person set name = 'Ajay' where person_id = 2";
			ps = con.prepareStatement(update);
			ps.execute();
			System.out.println("Data updated successfully...");
			*/
			
			//Deleting data from table 
			String delete = "delete from person where person_id = 2";
			ps = con.prepareStatement(delete);
			ps.execute();
			System.out.println("Data deleted successfully...");
			
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}

	}

}


/*
OUTPUT:

//Creating the table in the database
mysql> show tables;
+-----------------------+
| Tables_in_assignments |
+-----------------------+
| bankaccount           |
| person                |
+-----------------------+
2 rows in set (0.00 sec)

mysql> desc person;
+-----------+-------------+------+-----+---------+-------+
| Field     | Type        | Null | Key | Default | Extra |
+-----------+-------------+------+-----+---------+-------+
| person_id | int         | NO   | PRI | NULL    |       |
| name      | varchar(50) | YES  |     | NULL    |       |
| age       | int         | YES  |     | NULL    |       |
+-----------+-------------+------+-----+---------+-------+
3 rows in set (0.00 sec)

//Inserting data into table
mysql> select * from person;
+-----------+------+------+
| person_id | name | age  |
+-----------+------+------+
|         1 | Ram  |   20 |
|         2 | Sham |   20 |
+-----------+------+------+
2 rows in set (0.00 sec)

//Updating data in the table at person_id = 2
mysql> select * from person;
+-----------+------+------+
| person_id | name | age  |
+-----------+------+------+
|         1 | Ram  |   20 |
|         2 | Ajay |   20 |
+-----------+------+------+
2 rows in set (0.00 sec)

//Deleting data from the table at person_id = 2
mysql> select * from person;
+-----------+------+------+
| person_id | name | age  |
+-----------+------+------+
|         1 | Ram  |   20 |
+-----------+------+------+
1 row in set (0.00 sec)

 */
