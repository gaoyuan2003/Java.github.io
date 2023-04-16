package JAVA基础深化和提高.网络编程;

import java.io.PrintWriter;
import java.net.Socket;

public class BasicSocketClient {
    public static void main(String[] args) {
        try(//创建Socket对象
            Socket socket = new Socket("127.0.0.1",8888);){
            PrintWriter printWriter = new PrintWriter(socket.getOutputStream());
            Thread.sleep(5000);
            printWriter.println("服务端你好！");
            printWriter.flush();
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("客户端启动失败");
        }

    }
}
