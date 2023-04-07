package JAVA基础深化和提高.IO流;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TestBufferReader {
    public static void main(String[] args) {
        //创建字符输入缓冲流对象及文件字符流对象
        try(BufferedReader br = new BufferedReader(new FileReader("e:/a.txt"))){
            //操作字符输入缓冲流
            String temp = "";
            while((temp  = br.readLine()) != null){
                System.out.println(temp);
            }


        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
