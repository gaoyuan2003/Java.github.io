package JAVA基础深化和提高.IO流;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class TestFileUtilsDemo1 {
    public static void main(String[] args)throws IOException {
        String content = FileUtils.readFileToString(new File("e:/a.txt"),"utf-8");
        System.out.println(content);
    }
}
