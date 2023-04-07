package JAVA基础深化和提高.IO流;

import java.io.*;

public class TestLineNumber2 {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("e:/a.txt")));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("e:/a1.txt")))){
            String temp = "";
            int i = 1;
            while ((temp = br.readLine()) != null){
                bw.write(i+":"+temp);
                bw.newLine();
                i++;
            }
            bw.flush();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
