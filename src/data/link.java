package data;
import java.sql.Connection;
import java.sql.DriverManager;
 class link {
		
		public static Connection getConnection() {
			Connection connection = null;
			
			try {
				String username = "root";
				String password = "Zettc1702!";
				String databaseName = "Owner";
				String url = "jdbc:mysql://localhost:3306/" + databaseName;
				Class.forName("com.mysql.cj.jdbc.Driver");
				connection = DriverManager.getConnection(url, username, password);
				System.out.println("Kết nối thành công với database " + databaseName);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			return connection;
	   }
	   public static void closeConnection(Connection connection) {
	   	try {
	   		if(connection != null) {
	   			connection.close();
	   		}
	   	} catch(Exception e) {
	   		e.printStackTrace();
	   	}
	   }
	}
