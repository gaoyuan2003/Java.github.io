package JAVA基础深化和提高.IO流;

import java.io.FileWriter;
import java.io.IOException;

public class TestFileWriter {
    public static void main(String[] args) {
        //实例化文件字符输出流对象
        try(FileWriter fw = new FileWriter("e:/a.txt",true)){
            fw.write("您好尚学堂nihao\r\n");
            fw.flush();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
