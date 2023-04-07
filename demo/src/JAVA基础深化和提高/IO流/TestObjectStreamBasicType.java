package JAVA基础深化和提高.IO流;

import java.io.*;

public class TestObjectStreamBasicType {
    public static void main(String[] args) {
            try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("e:/a1.txt"));
                ObjectInputStream ois = new ObjectInputStream(new FileInputStream("e:/a1.txt"))){
                //将数据输出到文件中
                oos.writeInt(10);
                oos.writeDouble(Math.random());
                oos.writeChar('a');
                oos.writeBoolean(true);
                oos.writeUTF("您好，Old");
                //刷新
                oos.flush();

                //从文件中读取数据,必须按照写入的顺序读取
                System.out.println("Int: "+ois.readInt());
                System.out.println("Double: "+ois.readDouble());
                System.out.println("Char: "+ois.readChar());
                System.out.println("Boolean: "+ois.readBoolean());
                System.out.println("String: "+ois.readUTF());

            }catch (IOException e){
                e.printStackTrace();
            }
    }
}
