package JAVA基础深化和提高.IO流;

import java.io.FileInputStream;


public class Test1 {
    public static void main(String[] args) {
        //创建一个流对象
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("E:\\Users\\GAOYUAN\\Documents\\GitHub\\Java.github.io\\demo\\a.txt");
            int s1 = fis.read();
            int s2 = fis.read();
            int s3 = fis.read();
            int s4 = fis.read();
            System.out.println(s1);
            System.out.println(s2);
            System.out.println(s3);
            System.out.println(s4);
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                if(fis != null)
                fis.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
