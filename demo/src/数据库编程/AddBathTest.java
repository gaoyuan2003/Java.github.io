package 数据库编程;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class AddBathTest {
    public void addBath2(){
        Connection connection = null;
        PreparedStatement ps = null;


        try{
            connection = JdbcUtils.getConnection();
            ps = connection.prepareStatement("insert into users values(default,?,?)");
            for(int i=1;i<=1000;i++){
                ps.setString(1,"ITBZ"+i);
                ps.setInt(2,20);
                ps.addBatch();
                if(i%500 == 0){
                    ps.executeBatch();
                    ps.clearBatch();
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            JdbcUtils.closeResource(ps,connection);
        }
    }

    public static void main(String[] args) {
        AddBathTest addBathTest = new AddBathTest();
        addBathTest.addBath2();
    }
}
