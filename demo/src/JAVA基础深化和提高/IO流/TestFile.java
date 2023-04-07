package JAVA基础深化和提高.IO流;


import java.io.*;

public class TestFile {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new FileReader(new File("e:/a.txt")));
            PrintWriter pw = new PrintWriter(new File("e:/a1.txt"))){
            //操作流
            String temp = "";
            int i = 1;
            while ((temp = br.readLine()) != null){
                pw.println(i+": "+temp);
                i++;
            }
            pw.flush();

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
