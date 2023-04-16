package JAVA基础深化和提高.网络编程;

import java.net.URL;

public class UrlTest {
    public static void main(String[] args) throws Exception {
        URL url = new URL("https://www.itbaizhan.com/search.html?kw=java");
        System.out.println("获取与此URL相关联协议的默认端口："+url.getDefaultPort());
        System.out.println("访问资源："+url.getFile());
        System.out.println("主机名："+url.getHost());
        System.out.println("访问资源路径："+url.getPath());
        System.out.println("协议："+url.getProtocol());
        System.out.println("参数部分："+url.getQuery());
        /*System.out.println(url.toString());
        System.out.println(url.getAuthority());
        System.out.println(url.getContent());
        System.out.println(url.getUserInfo());*/
    }
}
