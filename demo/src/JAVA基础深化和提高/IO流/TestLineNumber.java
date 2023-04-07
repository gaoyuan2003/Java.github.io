package JAVA基础深化和提高.IO流;

import java.io.*;

public class TestLineNumber {
    public static void main(String[] args) {
        //创建字符输入缓冲流与文件字符输入流对象
        try(BufferedReader br = new BufferedReader(new FileReader("e:/a.txt"));
            //创建字符输出缓冲流与文件字符输出流对象
            BufferedWriter bw = new BufferedWriter(new FileWriter("e:/a1.txt"))){

            //定义行号的变量
            int i = 1;
            String temp = "";
            while((temp = br.readLine()) != null){
                //将读取到的一行内容添加行号，并写出到目标文件中。
                bw.write(i+":"+temp);
                bw.newLine();
                //行号变量累加
                i++;
            }
            //刷新
            bw.flush();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
