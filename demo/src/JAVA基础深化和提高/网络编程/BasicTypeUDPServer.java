package JAVA基础深化和提高.网络编程;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class BasicTypeUDPServer {
    public static void main(String[] args) {
        try(DatagramSocket datagramSocket = new DatagramSocket(9999)){
            byte[] bytes = new byte[1024];
            DatagramPacket datagramPacket = new DatagramPacket(bytes,bytes.length);
            datagramSocket.receive(datagramPacket);
            try(DataInputStream dis = new DataInputStream(new ByteArrayInputStream(datagramPacket.getData()))){
                System.out.println(dis.readLong());
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
