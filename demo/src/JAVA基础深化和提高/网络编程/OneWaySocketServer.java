package JAVA基础深化和提高.网络编程;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class OneWaySocketServer {
    public static void main(String[] args) {
        System.out.println("服务端开启，等待监听...");
        try(ServerSocket serverSocket = new ServerSocket(8888);
            Socket socket = serverSocket.accept();
            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter pw = new PrintWriter(socket.getOutputStream())
            ){
            System.out.println("服务端连接成功");
            while(true){
                String str = br.readLine();
                System.out.println("客户端说："+str);
                if("exit".equals(str) || "quit".equals(str)){
                    break;
                }
                pw.println(str);
                pw.flush();
            }
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("服务器启动失败");
        }
    }
}
