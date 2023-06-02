package 数据库编程;

import java.io.InputStream;
import java.util.Properties;

public class PropertiesTest {
    public static void main(String[] args) throws Exception {
        //实例化Properties对象
        Properties prop = new Properties();
        InputStream is = PropertiesTest.class.getClassLoader().getResourceAsStream("test.properties");
        prop.load(is);
        String key1 = prop.getProperty("key1");
        String key2 = prop.getProperty("key2");
        String key3 = prop.getProperty("key3");
        System.out.println(key1+" "+key2+" "+key3);
    }
}
