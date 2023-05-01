package JAVA基础深化和提高.网络编程;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

//接受线程
class ChatReceive extends Thread{
    private Socket socket;
    public ChatReceive(Socket socket){
        this.socket = socket;
    }
    @Override
    public void run() {
        this.receiveMsg();
    }

    private void receiveMsg(){
        try(BufferedReader br = new BufferedReader(new InputStreamReader(this.socket.getInputStream()))){
            while(true){
                String msg = br.readLine();
                synchronized (""){
                    //把读取到的数据写入公共数据区
                    ChatRoomServer.buf = "["+this.socket.getInetAddress()+"] "+msg;
                    //唤醒发送消息的线程
                    "".notifyAll();
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

//发送线程
class ChatSend extends Thread{
    private Socket socket;
    public ChatSend(Socket socket){
        this.socket = socket;
    }
    @Override
    public void run() {
        this.sendMsg();
    }

    private void sendMsg(){
        try(PrintWriter pw = new PrintWriter(this.socket.getOutputStream())){
            while(true){
                synchronized (""){
                    //让发送消息的线程处于等待状态
                    "".wait();
                    //将公共数据区的消息发送给客户端
                    pw.println(ChatRoomServer.buf);
                    pw.flush();
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

public class ChatRoomServer {
    public static String buf;
    public static void main(String[] args) {
        System.out.println("Chat Server Version 1.0");
        System.out.println("Listen at 8888.....");
        try(ServerSocket serverSocket = new ServerSocket(8888);

        ){
            while(true){
                Socket socket = serverSocket.accept();
                System.out.println("连接到："+socket.getInetAddress());
                new ChatReceive(socket).start();
                new ChatSend(socket).start();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
