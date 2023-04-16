package JAVA基础深化和提高.网络编程;

import java.net.InetAddress;

public class InetTest2 {
    public static void main(String[] args) throws Exception {
        InetAddress inetAddress = InetAddress.getByName("www.baidu.com");
        System.out.println(inetAddress.getHostName());
        System.out.println(inetAddress.getHostAddress());
    }
}
