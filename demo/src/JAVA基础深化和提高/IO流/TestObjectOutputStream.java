package JAVA基础深化和提高.IO流;

import java.io.*;

public class TestObjectOutputStream {
    public static void main(String[] args) {
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("e:/a1.txt"))){
            //创建Users对象
            Users users = new Users();
            users.setUserage("20");
            users.setUserid(1);
            users.setUsername("Old鲁");

            //将Users对象序列化到文件中
            oos.writeObject(users);
            oos.flush();

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
