package 数据库编程;

import java.io.*;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class BlobTest {
    public void insertMovie(String moviename, InputStream is){
        Connection connection = null;
        PreparedStatement ps = null;

        try{
            connection = JdbcUtils.getConnection();
            ps = connection.prepareStatement("insert into movie values(DEFAULT,?,?)");
            ps.setString(1,moviename);
            ps.setBlob(2,is);
            ps.executeUpdate();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            JdbcUtils.closeResource(ps,connection);
        }
    }

    public void selectMovieById(int movieid){
        Connection connection = null;
        PreparedStatement ps = null;
        ResultSet resultSet = null;
        try{
            connection = JdbcUtils.getConnection();
            ps = connection.prepareStatement("select * from movie where movieid=?");
            ps.setInt(1,movieid);
            resultSet = ps.executeQuery();
            while(resultSet.next()){
                int id = resultSet.getInt("movieid");
                String name = resultSet.getString("moviename");
                System.out.println(id+" "+name);
                Blob poster = resultSet.getBlob("poster");
                InputStream is = poster.getBinaryStream();
                OutputStream os = new FileOutputStream(id+"_"+name+".jpg");
                byte[] buff = new byte[1024];
                int len;
                while((len = is.read(buff)) != -1){
                    os.write(buff,0,len);
                }
                os.flush();
                is.close();
                os.close();
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            JdbcUtils.closeResource(resultSet,ps,connection);
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        BlobTest blobTest = new BlobTest();
//        InputStream is = new FileInputStream(new File("C:/Users/GAOYUAN/Pictures/Nitro/Nitro_Wallpaper_01_3840x2400.jpg"));
//        blobTest.insertMovie("战狼",is);
        blobTest.selectMovieById(1);
    }
}
