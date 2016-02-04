package singleton.dbconnection;

import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private static DBConnection instance = null;
    private static int counter;
    private DBConnection() {
    	try {
			Class.forName("com.mysql.jdbc.Driver");
			DriverManager.getConnection("jdbc:mysql://" + Config.DB_SERVER + ":" + Config.DB_PORT + "/" + Config.DB_NAME, Config.DB_USER, Config.DB_PWD);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
    }

    private static synchronized void syncInit() {
        if (instance == null) {
            instance = new DBConnection();
            System.out.println("new");
        }else{
        	System.out.println("get" + counter ++);
        }
    }

    public static DBConnection getInstance() {
        if (instance == null) {
            syncInit();
        }
        return instance;
    }
}
