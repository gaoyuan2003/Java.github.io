package JAVA基础深化和提高.IO流;

import org.apache.commons.io.IOUtils;

import java.io.FileInputStream;

public class TestIOUtilsDemo {
    public static void main(String[] args)throws Exception {
        String s = IOUtils.toString(new FileInputStream("e:/a.txt"), "utf-8");
        System.out.println(s);
    }
}
