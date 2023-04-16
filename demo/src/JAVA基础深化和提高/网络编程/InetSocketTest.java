package JAVA基础深化和提高.网络编程;

import java.net.InetSocketAddress;

public class InetSocketTest {
    public static void main(String[] args) {
        InetSocketAddress inetSocketAddress = new InetSocketAddress("www.baidu.com",80);
        System.out.println(inetSocketAddress.getHostName());
        System.out.println(inetSocketAddress.getAddress().getHostAddress());
    }
}
