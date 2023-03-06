package JAVA基础深化和提高.常用类;

import java.io.File;
import java.io.IOException;

public class TestFile3 {
    public static void main(String[] args) throws IOException {
        File f = new File("d:/b.txt");
        f.createNewFile();
        f.delete();
        File f2 = new File("d:/电影/华语/大陆");
        boolean flag = f2.mkdir();
        System.out.println(flag);
        boolean flag2 = f2.mkdirs();
        System.out.println(flag2);
    }
}
