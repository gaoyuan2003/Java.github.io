package JAVA基础深化和提高.网络编程;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class TwoWaySocketServer {
    public static void main(String[] args) {
        System.out.println("服务端开启，等待监听...");
        try(ServerSocket serverSocket = new ServerSocket(8888);
            Socket socket = serverSocket.accept();
            Scanner scanner = new Scanner(System.in);
            PrintWriter pw = new PrintWriter(socket.getOutputStream());
            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()))
        ){
            System.out.println("服务器端连接成功");
            while(true){
                String str = br.readLine();
                System.out.println("客户端说："+str);
                if("exit".equals(str) || "quit".equals(str)){
                    break;
                }
                String keyInput = scanner.nextLine();
                pw.println(keyInput);
                pw.flush();
            }

        }catch(Exception e){
            e.printStackTrace();
            System.out.println("服务端异常退出");
        }
    }
}
