package JAVA基础深化和提高.网络编程;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;

public class UDPClient {
    public static void main(String[] args) {
        try(DatagramSocket datagramSocket = new DatagramSocket(8888)){
            byte[] bytes = "百战程序员".getBytes();
            DatagramPacket datagramPacket = new DatagramPacket(bytes,bytes.length, new InetSocketAddress("127.0.0.1",9999));
            datagramSocket.send(datagramPacket);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
