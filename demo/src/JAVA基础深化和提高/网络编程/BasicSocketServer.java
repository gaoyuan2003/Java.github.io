package JAVA基础深化和提高.网络编程;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class BasicSocketServer {
    public static void main(String[] args) {
        System.out.println("服务器已启动，等待监听...");
        //创建SeverSocket对象
        try(ServerSocket serverSocket = new ServerSocket(8888);){
            //监听8888端口,当前线程处于阻塞状态
            Socket socket = serverSocket.accept();
            //链接成功后会得到客户端对应的Socket对象，并解除线程阻塞
            //通过客户端对应的Socket对象中的输入流对象，获取客户端发送过来的消息
            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            System.out.println(br.readLine());
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("服务器启动失败");
        }
    }
}
