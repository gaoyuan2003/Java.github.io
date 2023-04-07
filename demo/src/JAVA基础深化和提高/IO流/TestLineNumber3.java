package JAVA基础深化和提高.IO流;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class TestLineNumber3 {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new FileReader("e:/a1.txt"));
            PrintWriter pw = new PrintWriter("e:/a.txt")){
            String temp = "";
            int i = 1;
            while((temp = br.readLine()) != null){
                pw.println(i + ": " + temp);
                i++;
            }
            pw.flush();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
