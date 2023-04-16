package JAVA基础深化和提高.网络编程;

import java.net.InetAddress;

public class InetTest3 {
    public static void main(String[] args) throws Exception{
        InetAddress inetAddress = InetAddress.getByName("110.242.98.4");
        System.out.println(inetAddress.getHostAddress());
        System.out.println(inetAddress.getHostName());
    }
}
