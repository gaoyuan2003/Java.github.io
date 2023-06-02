package 数据库编程;


import java.util.List;

public class Test {
    public static void main(String[] args) {
       /* StatementTest st = new StatementTest();
        st.insertUsers("gy",28);
        st.updateUsers(1,"pop",90);
        st.deleteUsersByID(1);
        PreparedStatementTest ps = new PreparedStatementTest();
        ps.insertUsers("oldlu",29);
        ps.updateUsersById(3,"gy",999);
        ps.deleteUsersById(3);*/
       ResultSetTest rt = new ResultSetTest();
        List<Users> list = rt.selectUsersAll();
        for (Users users: list
             ) {
            System.out.println(users.getUserid()+" "+users.getUsername()+" "+users.getUserage());
        }
    }
}
