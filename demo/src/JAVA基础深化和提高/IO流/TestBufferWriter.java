package JAVA基础深化和提高.IO流;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TestBufferWriter {
    public static void main(String[] args) {
        //创建字符输出缓冲流以及文件字符输出流对象
        try(BufferedWriter bw = new BufferedWriter(new FileWriter("e:/a.txt",false))){
            //操作字符输出缓冲流
            bw.write("nihao尚学堂");
            bw.newLine();
            bw.write("你好");
            bw.flush();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
