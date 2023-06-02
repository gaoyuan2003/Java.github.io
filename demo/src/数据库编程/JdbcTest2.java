package 数据库编程;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class JdbcTest2 {
    public static void main(String[] args) throws Exception{
        Properties prop = new Properties();
        InputStream is = JdbcTest2.class.getClassLoader().getResourceAsStream("jdbc.properties");
        prop.load(is);
        String url = prop.getProperty("url");
        String name = prop.getProperty("username");
        String pwd = prop.getProperty("pwd");
        String drive = prop.getProperty("driver");
        Class.forName(drive);
        Connection connection = DriverManager.getConnection(url, name, pwd);
        System.out.println(connection);
    }
}
