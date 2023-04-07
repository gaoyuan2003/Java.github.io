IO流的操作体系

1.InputStream/OutputStream 字节流的抽象类
2.Reader/Writer 字节流的抽象类
3.FileInputStream/FileOutputStream 节点流：以字节为单位直接操作“文件 ”
4.ByteArrayInputStream/ByteArrayOutputStream 节点流：以字节为单位直接操作“字节数组对象”
5.ObjectInputStream/ObjectOutputStream 处理流：以字节为单位直接操作“对象”
6.DataInputStream/DataOutputStream 处理流：以字节为单位直接操作“基本数据类型与字符串类型”
7.FileWriter/FileReader 节点流：以字符为单位直接操作“文本文件”（注意：只能读写文本文件）
8.BufferedReader/BufferedWriter 处理流：将Reader/Writer对象进行包装，增加缓存功能，提高读写效率
9.BufferedInputStream/BufferedOutputStream 处理流：将InputStream/OutputStream对象进行包装，增加缓存功能，提高读写效率
10.InputStreamReader/OutputStreamWriter 处理流：将字节流对象转化成字节流对象
11.PrintStream 处理流：将OutputStream进行包装，可以方便地输出字符，更加灵活

总结
1.按流的方向分类：
	输入流：数据源到程序（InputStream，Reader读进来）
	输出流：程序到目的地（OutputStream，Writer写进去）
2.按流的处理数据单元分类：
	字节流：按照字节读取数据（InputStream，OutputStream）
	字符流：按照字符读取数据（Reader，Writer）
3.按流的功能分类：
	节点流：可以直接从数据源或目的地读写数据
	处理流：不直接连接到数据源或目的地，是处理流的流，通过对其他流的处理提高程序的性能
4.IO的四个基本抽象类：
	InputStream，OutputStream，Reader，Writer
5.InputStream的实现类：
	FileInputStream
	BufferedInputStream
	DataInputStream
	ObjectInputStream
6.OutputStream的实现类：
	FileOutputStream
	BufferedOutputStream
	DataOutputStream
	ObjectOutputStream
7.Reader的实现类：
	FileReader
	BufferedReader
	InputStreamReader
8.Writer的实现类：
	FileWriter
	BufferedWriter
	OutputStreamWriter
	PrintWriter
9.把Java对象转换为字节序列的过程称为对象的序列化
10.把字节序列恢复为Java对象的过程称为对象的反序列化

```java
import java.io.*;
public class TestI01 {
 public static void main(String[] args) {
 try {
 //创建输入流
 FileInputStream fis = new
FileInputStream("d:/a.txt"); // 文件内容是：abc
 //一个字节一个字节的读取数据
 int s1 = fis.read(); // 打印输入字符a对应的ascii码值97
 int s2 = fis.read(); // 打印输入字符b对应的ascii码值98
 int s3 = fis.read(); // 打印输入字符c 对应的ascii码值99
 int s4 = fis.read(); // 由于文件内容已经读取完毕，返回-1
 System.out.println(s1);
 System.out.println(s2);
 System.out.println(s3);
 System.out.println(s4);
 // 流对象使用完，必须关闭！不然，总占用系统资源，最终会造成系统崩溃！
 fis.close();
  } catch (Exception e) {
 	e.printStackTrace();
   }
  }
 }
```
```java
import java.io.*;
public class Test2 {
 public static void main(String[] args) {
 FileInputStream fis = null;
 try {
 	 fis = new FileInputStream("d:/a.txt"); // 内容是：abc
 	 StringBuilder sb = new
StringBuilder();
 int temp = 0;//当temp等于-1时，表示已经到了文件结尾，停止读取
 while ((temp = fis.read()) !=-1) {
 sb.append((char) temp);
 }
 System.out.println(sb);
 } catch (Exception e) {
 e.printStackTrace();
 } finally {
 try {
 //这种写法，保证了即使遇到异常情况，也会关闭流对象。
 if (fis != null) {
 fis.close();
 }
 } catch (IOException e) {
 e.printStackTrace();
 }
 }
 }
 }
```