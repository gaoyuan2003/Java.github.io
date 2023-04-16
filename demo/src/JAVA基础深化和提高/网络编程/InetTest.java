package JAVA基础深化和提高.网络编程;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetTest {
    public static void main(String[] args) throws UnknownHostException {
        //实例化InetTestAddress对象
        InetAddress inetAddress = InetAddress.getLocalHost();
        //返回IP地址
        System.out.println(inetAddress.getHostAddress());
        //返回计算机名
        System.out.println(inetAddress.getHostName());
    }
}
