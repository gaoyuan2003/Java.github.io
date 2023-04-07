package JAVA基础深化和提高.IO流;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TestObjectInputStream {
    public static void main(String[] args) {
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("e:/a1.txt"))){
            //反序列化处理
            Users users = (Users) ois.readObject();
            System.out.println(users);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
