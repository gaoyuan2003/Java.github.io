package JAVA基础深化和提高.网络编程;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

class Send extends Thread{
    private Socket socket;
    public Send(Socket socket){
        this.socket = socket;
    }

    @Override
    public void run() {
        this.sendMsg();
    }

    private void sendMsg(){
        try(Scanner scanner = new Scanner(System.in);
            PrintWriter pw = new PrintWriter(socket.getOutputStream())
        ){
            while (true){
                String str = scanner.nextLine();
                pw.println(str);
                pw.flush();
                if("exit".equals(str)){
                    System.out.println("服务器断开连接");
                    break;
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

class Receive extends Thread{
    private Socket socket;
    public Receive(Socket socket){
        this.socket = socket;
    }

    @Override
    public void run() {
        this.receiveMsg();
    }

    private void receiveMsg(){
        try(BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()))){
            while (true){
                String str = br.readLine();
                System.out.println("客户端："+str);
                if ("exit".equals(str)){
                    break;
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

public class ChatSocketServer {
    public static void main(String[] args) {
        try(ServerSocket serverSocket = new ServerSocket(8888)
        ){
            System.out.println("服务端启动，等待监听...");
            Socket socket = serverSocket.accept();
            System.out.println("服务端连接成功");
            new Send(socket).start();
            new Receive(socket).start();
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("服务端异常退出");
        }
    }
}
