package 数据库编程;

import java.sql.Connection;
import java.sql.DriverManager;

public class JdbcTest {
    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://localhost:3306/itbz";
        String name = "root";
        String pwd = "root";
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection(url, name, pwd);
        System.out.println(connection);
    }
}
