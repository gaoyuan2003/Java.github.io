package JAVA基础深化和提高.常用类;

import java.io.File;
import java.util.Date;

public class TestFile2 {
    public static void main(String[] args) {
        File f = new File("d:/b.txt");
        System.out.println("File是否存在："+f.exists());
        System.out.println("File是否是目录："+f.isDirectory());
        System.out.println("File是否是文件"+f.isFile());
        System.out.println("File最后修改的时间"+new Date(f.lastModified()));
        System.out.println("File的大小："+f.length());
        System.out.println("File的文件名："+f.getName());
        System.out.println("File的目录路径："+f.getAbsolutePath());
    }
}
