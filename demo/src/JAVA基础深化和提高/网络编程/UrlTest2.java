package JAVA基础深化和提高.网络编程;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class UrlTest2  {
    public static void main(String[] args) throws Exception{
        URL url = new URL("https://www.itbaizhan.com/");
        try(BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()))){
            StringBuilder sb = new StringBuilder();
            String temp = "";
            while((temp = br.readLine()) != null){
                sb.append(temp);
            }
            System.out.println(sb);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
