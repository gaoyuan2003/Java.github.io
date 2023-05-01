package JAVA基础深化和提高.网络编程;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

class Send1 extends Thread{
    private Socket socket;
    private Scanner scanner;
    public Send1(Socket socket,Scanner scanner){
        this.scanner = scanner;
        this.socket = socket;
    }

    private void sendMsg(){
        try(
            PrintWriter pw = new PrintWriter(socket.getOutputStream())
        ){
            while (true){
                String str = scanner.nextLine();
                pw.println(str);
                pw.flush();
                if("exit".equals(str)){
                    System.out.println("断开连接");
                    break;
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        this.sendMsg();
    }
}

class Receive1 extends Thread{
    private Socket socket;
    public Receive1(Socket socket){
        this.socket = socket;
    }

    private void receiveMsg() {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()))) {
            while (true) {
                String str = br.readLine();
                System.out.println("对方说：" + str);
                if ("exit".equals(str)) {
                    System.out.println("断开连接");
                    break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        this.receiveMsg();
    }
}

public class GoodTcp {
    public static void main(String[] args) {
        ServerSocket serverSocket = null;
        Socket socket = null;
        try{
            Scanner scanner = new Scanner(System.in);
            System.out.println("请输入：server,<port> 或者：<ip>,<port>");
            String str = scanner.nextLine();
            String[] arr = str.split(",");
            if("server".equals(arr[0])){
                System.out.println("TCP Server Listen at "+arr[1]+"...");
                serverSocket = new ServerSocket(Integer.parseInt(arr[1]));
                socket = serverSocket.accept();
            }else{
                socket = new Socket(arr[0],Integer.parseInt(arr[1]));
                System.out.println("连接成功");
            }
            new Send1(socket,scanner).start();
            new Receive1(socket).start();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if(serverSocket != null){
                try{
                    serverSocket.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        }
    }
}
