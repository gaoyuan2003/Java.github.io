package JAVA基础深化和提高.网络编程;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;

public class BasicTypeUDPClient {
    public static void main(String[] args) {
        long n = 2000l;
        try(DatagramSocket datagramSocket = new DatagramSocket(9000);
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            DataOutputStream dos = new DataOutputStream(bos)){
            dos.writeLong(n);
            byte[] bytes = bos.toByteArray();
            DatagramPacket datagramPacket = new DatagramPacket(bytes,bytes.length,new InetSocketAddress("127.0.0.1",9999));
            datagramSocket.send(datagramPacket);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
