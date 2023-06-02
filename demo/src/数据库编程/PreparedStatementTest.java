package 数据库编程;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class PreparedStatementTest {
    public void insertUsers(String username,int userage){
        Connection connection = null;
        PreparedStatement ps = null;
        try{
            connection = JdbcUtils.getConnection();
            String sql = "insert into users values(default,?,?)";
            ps = connection.prepareStatement(sql);
            ps.setString(1,username);
            ps.setInt(2,userage);
            int i = ps.executeUpdate();
            System.out.println(i);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            JdbcUtils.closeResource(ps,connection);
        }
    }

    public void updateUsersById(int userid,String username,int userage){
        Connection connection = null;
        PreparedStatement ps = null;
        try{
            connection = JdbcUtils.getConnection();
            ps = connection.prepareStatement("update users set username = ?,userage = ? where userid=?");
            ps.setString(1,username);
            ps.setInt(2,userage);
            ps.setInt(3,userid);
            int i = ps.executeUpdate();
            System.out.println(i);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            JdbcUtils.closeResource(ps,connection);
        }
    }


    public void deleteUsersById(int userid){
        Connection connection = null;
        PreparedStatement ps = null;
        try{
            connection = JdbcUtils.getConnection();
            ps = connection.prepareStatement("delete from users where userid=?");
            ps.setInt(1,userid);
            int i = ps.executeUpdate();
            System.out.println(i);
        }catch (Exception e){
            e.printStackTrace();
        }finally{
            JdbcUtils.closeResource(ps,connection);
        }
    }

}
