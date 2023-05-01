package JAVA基础深化和提高.网络编程;

import java.io.ByteArrayOutputStream;
import java.io.ObjectOutputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;

public class ObjectTypeUDPClient {
    public static void main(String[] args) {
        try(DatagramSocket datagramSocket = new DatagramSocket(8888);
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos)){
            //创建自定义对象
            Person p = new Person();
            p.setAge(18);
            p.setName("old");
            oos.writeObject(p);
            byte[] bytes = bos.toByteArray();
            DatagramPacket datagramPacket = new DatagramPacket(bytes,bytes.length,new InetSocketAddress("127.0.0.1",9999));
            datagramSocket.send(datagramPacket);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
