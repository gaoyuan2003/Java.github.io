package 数据库编程;

import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

public class JdbcUtils {
    private static String url;
    private static String name;
    private static String pwd;
    static{
        try{
            Properties prop = new Properties();
            InputStream is = JdbcTest2.class.getClassLoader().getResourceAsStream("jdbc.properties");
            prop.load(is);
            url = prop.getProperty("url");
            name = prop.getProperty("username");
            pwd = prop.getProperty("pwd");
            String drive = prop.getProperty("driver");
            Class.forName(drive);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static Connection getConnection(){
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url,name,pwd);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
    public static void closeConnection(Connection connection){
        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static void commit(Connection connection){
        try {
            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static void rollback(Connection connection){
        try {
            connection.rollback();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static void closeStatement(Statement statement){
        try {
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static void closeResultSet(ResultSet resultSet){
        try {
            resultSet.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static void closeResource(Statement statement,Connection connection){
        closeStatement(statement);
        closeConnection(connection);
    }
    public static void closeResource(ResultSet resultSet,Statement statement,Connection connection){
        closeResultSet(resultSet);
        closeResource(statement, connection);
    }
}
