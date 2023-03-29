package JAVA基础深化和提高.IO流;

import java.io.FileInputStream;
import java.io.IOException;

public class Test2 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try{
            fis = new FileInputStream("E:\\Users\\GAOYUAN\\Documents\\GitHub\\Java.github.io\\demo\\a.txt");
            StringBuilder sb = new StringBuilder();
            int temp = 0;
            while((temp = fis.read()) != -1){
                sb.append((char) temp);
            }
            System.out.println(sb);
        }catch(Exception e){
            e.printStackTrace();
        }finally {
            if(fis!=null){
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }

        }
    }
}
