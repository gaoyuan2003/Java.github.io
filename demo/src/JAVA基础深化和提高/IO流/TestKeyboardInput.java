package JAVA基础深化和提高.IO流;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class TestKeyboardInput {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))){
            while (true){
                bw.write("请输入：");
                bw.flush();
                String input = br.readLine();
                if("exit".equals(input)||"quit".equals(input)){
                    bw.write("Bye Bye !");
                    bw.flush();
                    break;
                }
                bw.write("您输入的是："+input);
                bw.newLine();
                bw.flush();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
