package JAVA基础深化和提高.容器;

public class MethodGeneric {
    /**
     * 无返回值方法
     * public <泛型标识符号> void getName(泛型标识符号 name){}
     * 有返回值方法
     * public <泛型标识符号> 泛型标识符号 getName(泛型标识符 name){}
     * 无返回值静态方法
     * public static <泛型标识符号> void setName(泛型标识符号 name){}
     * 有返回值静态方法
     * public static <泛型标识符号> 泛型标识符号 getName(泛型标识符 name){}
     */

    public <T> void setName(T name){
        System.out.println(name);
    }

    public <T> T getAge(T age){
        return age;
    }

    public static <T> void setFlag(T flag){
        System.out.println(flag);
    }

    public static <T> T getFlag(T flag){
        return flag;
    }
    public <T> void method(T ... args){
        for(T t:args){
            System.out.println(t);
        }
    }
}
