package JAVA基础深化和提高.网络编程;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

class Msg extends Thread{
    private Socket socket;
    public Msg(Socket socket){
        this.socket = socket;
    }

    @Override
    public void run() {
        this.msg();
    }

    private void  msg(){
        try(BufferedReader br = new BufferedReader(new InputStreamReader(this.socket.getInputStream()));
            PrintWriter pw = new PrintWriter(this.socket.getOutputStream())){
            while (true){
                pw.println(br.readLine()+" [ok]");
                pw.flush();
            }
        }catch (Exception e){
            e.printStackTrace();
            System.out.println(this.socket.getInetAddress()+" 断开连接");
        }
    }
}

public class EchoServer {
    public static void main(String[] args) {
        try(ServerSocket serverSocket = new ServerSocket(8888)){
            System.out.println("服务端启动");
            while (true){
                Socket socket = serverSocket.accept();
                new Msg(socket).start();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
