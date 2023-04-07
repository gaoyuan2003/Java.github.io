package JAVA基础深化和提高.IO流;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestInputStreamReader {
    public static void main(String[] args) {
        try(//创建文件字节输入流对象
            FileInputStream fis = new FileInputStream("e:/a.txt");
            //字节到字符的转换流
            InputStreamReader isr = new InputStreamReader(fis)){
            int temp = 0;
            StringBuilder sb = new StringBuilder();
            while((temp = isr.read()) != -1){
                sb.append((char)temp);
            }
            System.out.println(sb);
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
