package JAVA基础深化和提高.IO流;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestFileByteBuffer {
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
        //"后开先关",按照IO流对象被创建的顺序的逆序来关闭
        try(FileInputStream fis = new FileInputStream(source);
            FileOutputStream fos = new FileOutputStream(destination)){
            //创建字节缓冲区
            byte[] buffer = new byte[1024];

            int temp = 0;
            while((temp = fis.read(buffer)) != -1){
                fos.write(buffer,0,temp);
            }
            //将数据从内存中写入硬盘
            fos.flush();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
