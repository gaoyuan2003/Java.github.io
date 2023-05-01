package JAVA基础深化和提高.网络编程;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPServer {
    public static void main(String[] args) {
        //创建服务端接受数据的DatagramSocket对象
        try(DatagramSocket datagramSocket = new DatagramSocket(9999)){
            //创建数据缓冲区
            byte[] b = new byte[1024];
            //创建数据报包对象
            DatagramPacket datagramPacket = new DatagramPacket(b,b.length);
            //等待接收客户端所发送的数据
            datagramSocket.receive(datagramPacket);
            //取出数据
            String str = new String(datagramPacket.getData(),0,datagramPacket.getLength());
            System.out.println(str);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
