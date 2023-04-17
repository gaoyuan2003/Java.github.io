package JAVA基础深化和提高.网络编程;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class OneWaySocketClient {
    public static void main(String[] args) {
        try(Socket socket = new Socket("127.0.0.1",8888);
            Scanner scanner = new Scanner(System.in);
            PrintWriter pw =  new PrintWriter(socket.getOutputStream());
            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()))
        ){
            System.out.println("客户端连接成功");
            while (true){
                String str = scanner.nextLine();
                pw.println(str);
                pw.flush();
                if("exit".equals(str) || "quit".equals(str)){
                    break;
                }
                String serverInput = br.readLine();
                System.out.println("服务端返回的："+serverInput);
            }
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("客户端启动失败");
        }
    }
}
