package 数据库编程;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ResultSetTest {
    public List<Users> selectUsersAll(){
        Connection connection = null;
        PreparedStatement ps = null;
        ResultSet resultSet = null;
        List<Users> list = new ArrayList<>();
        try{
            connection = JdbcUtils.getConnection();
            ps = connection.prepareStatement("select * from users");
            resultSet = ps.executeQuery();
            while(resultSet.next()){
                int userid = resultSet.getInt("userid");
                String username = resultSet.getString("username");
                int userage = resultSet.getInt("userage");
//                System.out.println(userid+" "+username+" "+userage);
                //orm映射处理
                Users users = new Users();
                users.setUserid(userid);
                users.setUserage(userage);
                users.setUsername(username);
                list.add(users);
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            JdbcUtils.closeResource(resultSet,ps,connection);
        }
        return list;
    }
}
