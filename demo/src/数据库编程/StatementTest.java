package 数据库编程;

import java.sql.Connection;
import java.sql.Statement;

public class StatementTest {
    /**
     * 添加用户
     */
    public void insertUsers(String username,int userage){
        Connection connection = null;
        Statement statement = null;
        try{
            //获取connection对象
            connection = JdbcUtils.getConnection();
            //获取statement对象
            statement = connection.createStatement();
            String sql = "insert into users values(default,'"+username+"',"+userage+")";
            boolean execute = statement.execute(sql);
            System.out.println(execute);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            JdbcUtils.closeResource(statement,connection);
        }
    }

    public void updateUsers(int userid,String username,int userage){
        Connection connection = null;
        Statement statement = null;
        try{
            connection = JdbcUtils.getConnection();
            statement = connection.createStatement();
            //定义sql语句
            String sql = "update users set username='"+username+"',userage="+userage+" where userid="+userid;
            int i = statement.executeUpdate(sql);
            System.out.println(i);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            JdbcUtils.closeResource(statement,connection);
        }
    }

    public void deleteUsersByID(int userid){
        Connection connection = null;
        Statement statement = null;
        try{
            connection = JdbcUtils.getConnection();
            statement = connection.createStatement();
            String sql = "delete from users where userid="+userid;
            int i = statement.executeUpdate(sql);
            System.out.println(i);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            JdbcUtils.closeResource(statement,connection);
        }
    }
}
