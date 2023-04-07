package JAVA基础深化和提高.IO流;

import java.io.*;

public class TestFileBufferStream {
    public static void main(String[] args) {
        long time1 = System.currentTimeMillis();
        copyFile("e:/src1.png","e:/copy.png");
        long time2 = System.currentTimeMillis();
        System.out.println(time2-time1);
    }

    /**
     *
     * @param source 源文件
     * @param destination 目的地文件
     */
    public static void copyFile(String source,String destination){

        try(//实例化节点流对象
            FileInputStream fis = new FileInputStream(source);
            FileOutputStream fos = new FileOutputStream(destination);
            //实例化处理流对象
            BufferedInputStream bis = new BufferedInputStream(fis);
            BufferedOutputStream bos = new BufferedOutputStream(fos)){
            int temp = 0;
            while ((temp = bis.read()) != -1){
                bos.write(temp);
            }
            bos.flush();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
