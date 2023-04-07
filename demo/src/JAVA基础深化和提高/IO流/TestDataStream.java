package JAVA基础深化和提高.IO流;


import java.io.*;

public class TestDataStream {
    public static void main(String[] args) {
        try(DataOutputStream dos = new DataOutputStream(new FileOutputStream("e:/data"));
            DataInputStream dis = new DataInputStream(new FileInputStream("e:/data"))){
            dos.writeChar('a');
            dos.writeInt(19);
            dos.writeDouble(Math.random());
            dos.writeBoolean(true);
            dos.writeUTF("北京就是背景");
            dos.flush();

            System.out.println("char"+dis.readChar());
            System.out.println("int"+dis.readInt());
            System.out.println("double"+dis.readDouble());
            System.out.println("boolean"+dis.readBoolean());
            System.out.println("string"+dis.readUTF());

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
