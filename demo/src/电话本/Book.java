package 电话本;

import java.io.*;

public class Book {
    public static void main(String[] args) {
        try(BufferedWriter bw = new BufferedWriter(new FileWriter("e:/a.txt",true));
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bbw=new BufferedWriter(new OutputStreamWriter(System.out))){
            while(true) {
                bbw.write("Input:\r\n");
                bbw.flush();
                int i = 1;
                String input = br.readLine();
                if ("exit".equals(input) || "quit".equals(input)) {
                    bbw.write("Finish");
                    bbw.flush();
                    break;
                }
                bw.write(i+": "+input);
                i++;
                bw.newLine();
                bw.flush();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
