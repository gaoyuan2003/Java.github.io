package 数据库编程;

/**
 * 动态条件查询测试类
 */

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class DynamicConditionQueryTest {
    public List<Users> queryUsers(Users user){
        List<Users> list = new ArrayList<>();
        Connection connection = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try{
            connection = JdbcUtils.getConnection();
            String sql = this.generateSql(user);
            ps = connection.prepareStatement(sql);
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

    private String generateSql(Users users){
        StringBuffer stringBuffer = new StringBuffer("select * from users where 1=1 ");
        if(users.getUserid()>0){
            stringBuffer.append(" and userid = ").append(users.getUserid());
        }
        if(users.getUsername() != null && users.getUsername().length() > 0){
            stringBuffer.append(" and username = '").append(users.getUsername()).append("'");
        }
        if(users.getUserage() > 0){
            stringBuffer.append(" and userage = ").append(users.getUserage());
        }
        return stringBuffer.toString();
    }

    public static void main(String[] args) {
        DynamicConditionQueryTest d = new DynamicConditionQueryTest();
        Users users = new Users();
        users.setUsername("ITBZ12");
        users.setUserage(20);
        List<Users> list = d.queryUsers(users);
        for (Users us:list
        ) {
            System.out.println(us.getUserid()+" "+us.getUsername()+" "+us.getUserage());
        }
    }
}
