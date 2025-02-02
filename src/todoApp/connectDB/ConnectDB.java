package todoApp.connectDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDB {
    public static volatile ConnectDB instance;
    public Connection connection;

    public ConnectDB() {
        String url = System.getenv("DB_URL");
        String user = System.getenv("DB_USER");
        String password = System.getenv("DB_PASSWORD");
        try {
            connection = DriverManager.getConnection(url, user, password);
        }catch (SQLException e){
            e.fillInStackTrace();
        }
    }
    public Connection getConnection(){
        return connection;
    }

    public static ConnectDB getInstance() {
        if (instance == null){
            synchronized (ConnectDB.class){
                if (instance ==null) {
                    instance = new ConnectDB();
                }
            }
        }
        return instance;
    }
    public void closeConnect() {
        try {
            connection.close();
        } catch (SQLException e) {
            e.fillInStackTrace();
        }
    }
}
