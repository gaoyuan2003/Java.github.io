package JAVA基础深化和提高.常用类;

public class TestStringBufferAndBuilder {
    public static void main(String[] args) {
        /**StringBuilder**/
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<7;i++){
            sb.append((char)('a'+i));
        }
        System.out.println(sb.toString());
        sb.append(",I can sing my abc!");
        System.out.println(sb.toString());

        /**StringBuffer**/
        StringBuffer sb2 = new StringBuffer("北京尚学堂");
        sb2.insert(0,"爱").insert(0,"我");
        System.out.println(sb2.toString());
        sb2.delete(0,2);
        System.out.println(sb2);
        sb2.deleteCharAt(0).deleteCharAt(0);
        System.out.println(sb2);
        System.out.println(sb2.charAt(2));
        System.out.println(sb2.reverse());
        //StringBuffer 线程安全，做线程同步检查，效率低
        //StringBuilder 线程不安全，不做线程同步检查，因此效率高。建议使用
    }
}
