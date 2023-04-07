package JAVA基础深化和提高.IO流;

import java.io.IOException;
import java.io.PrintWriter;

public class TestPrintWriter {
    public static void main(String[] args) {
        try(PrintWriter pw = new PrintWriter("e:/a1.txt")){
            pw.print("abc");
            pw.print("3534");
            pw.println("def");
            pw.println("wer");
            pw.flush();

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
