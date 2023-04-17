package JAVA基础深化和提高.网络编程;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

class ClientSend extends Thread{
    private Socket socket;
    public ClientSend(Socket socket){
        this.socket = socket;
    }

    @Override
    public void run() {
        this.sendMsg();
    }

    private void sendMsg(){
        try(
                Scanner scanner = new Scanner(System.in);
                PrintWriter pw = new PrintWriter(socket.getOutputStream())){
            while(true){
                String msg = scanner.nextLine();
                pw.println(msg);
                pw.flush();
                if ("exit".equals(msg)){
                    System.out.println("客户端断开连接");
                    break;
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

class ClientReceive extends Thread{
    private Socket socket;
    public ClientReceive(Socket socket){
        this.socket = socket;
    }
    private void clientReceive(){
        try(BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()))){
            while (true){
                String str = br.readLine();
                if ("exit".equals(str)){
                    break;
                }
                System.out.println("服务端："+str);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    @Override
    public void run() {
        this.clientReceive();
    }
}

public class ChatSocketClient {
    public static void main(String[] args) {
        try{
            Socket socket = new Socket("127.0.0.1",8888);
            System.out.println("客户端连接成功");
            new ClientSend(socket).start();
            new ClientReceive(socket).start();
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("客户端异常退出");
        }
    }
}
