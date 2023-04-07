package JAVA基础深化和提高.IO流;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;

public class TestFileUtilsDemo2 {
    public static void main(String[] args)throws IOException {
        FileUtils.copyDirectory(new File("C:/Users/GAOYUAN/Desktop/JDK API/commons-io-2.11.0/docs"), new File("e:/bbb"), new FileFilter() {
            //定义copy规则
            @Override
            public boolean accept(File pathname) {
                //只copy目录或以html结尾的文件
                if(pathname.isDirectory()||pathname.getName().endsWith("html")){
                    return true;
                }else {
                    return false;
                }
            }
        });
    }
}
