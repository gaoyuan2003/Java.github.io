package JAVA基础深化和提高.常用类;

import java.io.File;
import java.io.IOException;

public class TestFile1 {
    public static void main(String[] args) throws IOException {
        System.out.println(System.getProperty("user.dir"));
        File f = new File("./a.txt");
        f.createNewFile();
        File f2 = new File("d:/b.txt");
        f2.createNewFile();
    }
}
