package JAVA基础深化和提高.IO流;

import java.io.FileReader;
import java.io.IOException;

public class TestFileReader {
    public static void main(String[] args) {
        //创建文件字符流对象
        try(FileReader fr = new FileReader("e:/a.txt")){
            StringBuilder sb = new StringBuilder();
            //操作流对象
            int temp = 0;
            while((temp = fr.read()) != -1){
                sb.append((char) temp);
            }
            System.out.println(sb);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
