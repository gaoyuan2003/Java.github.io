package JAVA基础深化和提高.网络编程;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class TwoWaySocketClient {
    public static void main(String[] args) {
        try(Socket socket = new Socket("127.0.0.1",8888);
            Scanner scanner = new Scanner(System.in);
            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter pw = new PrintWriter(socket.getOutputStream())
        ){
            System.out.println("客户端连接成功");
            while (true){
                String keyInput = scanner.nextLine();
                pw.println(keyInput);
                pw.flush();
                if("exit".equals(keyInput) || "quit".equals(keyInput)){
                    break;
                }
                String str = br.readLine();
                System.out.println("服务端说："+str);
            }

        }catch (Exception e){
            e.printStackTrace();
            System.out.println("客户端异常退出");
        }
    }
}
