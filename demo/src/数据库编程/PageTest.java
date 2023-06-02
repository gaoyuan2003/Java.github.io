package 数据库编程;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class PageTest {
    public Page<Users> selectPage(Page page){
        Connection connection = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        List<Users> list = new ArrayList<>();
        try{
            connection = JdbcUtils.getConnection();
            ps = connection.prepareStatement("select * from users limit ?,?");
            ps.setInt(1,(page.getCurrentPage()-1)*page.getPageSize());
            ps.setInt(2,page.getPageSize());
            rs = ps.executeQuery();
            while(rs.next()){
                Users users = new Users();
                users.setUserid(rs.getInt("userid"));
                users.setUsername(rs.getString("username"));
                users.setUserage(rs.getInt("userage"));
                list.add(users);
            }
            page.setResult(list);
            rs = ps.executeQuery();
            while(rs.next()){
                int count = rs.getInt(1);
                page.setTotalCount(count);
                int totalPage = (int)Math.ceil(1.0*count/page.getPageSize());
                page.setTotalPage(totalPage);
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            JdbcUtils.closeResource(rs,ps,connection);
        }
        return page;
    }

    public static void main(String[] args) {
        PageTest pageTest = new PageTest();
        Page page = new Page();
        page.setCurrentPage(2);
        page.setPageSize(2);
        Page page1 = pageTest.selectPage(page);
        System.out.println("总条数："+page1.getTotalCount());
        System.out.println("总页数："+page1.getTotalPage());
        System.out.println("当前页："+page1.getCurrentPage());
        System.out.println("每页显示的条数："+page1.getPageSize());
        List<Users> list = page1.getResult();
        for(Users users:list){
            System.out.println(users.getUserid()+" "+users.getUsername()+" "+users.getUserage());
        }
    }
}
