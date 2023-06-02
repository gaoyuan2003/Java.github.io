package 数据库编程;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class FuzzyQueryTest {
    public List<Users> fuzzyQuery(String username){
        Connection connection = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        List<Users> list = new ArrayList<>();
        try{
            connection = JdbcUtils.getConnection();
            ps = connection.prepareStatement("select * from users where username like ?");
            ps.setString(1,username);
            rs = ps.executeQuery();
            while(rs.next()){
                Users users = new Users();
                users.setUserid(rs.getInt("userid"));
                users.setUsername(rs.getString("username"));
                users.setUserage(rs.getInt("userage"));
                list.add(users);
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            JdbcUtils.closeResource(rs,ps,connection);
        }
        return list;
    }

    public static void main(String[] args) {
        FuzzyQueryTest ft = new FuzzyQueryTest();
        List<Users> list = ft.fuzzyQuery("ITBZ%");
        for (Users users:list
             ) {
            System.out.println(users.getUserid()+" "+users.getUsername()+" "+users.getUserage());
        }
    }
}
