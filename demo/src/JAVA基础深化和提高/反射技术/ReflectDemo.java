package JAVA基础深化和提高.反射技术;

import java.lang.reflect.Method;

class Reflect{
    public void method1(){
        System.out.println("Method1....");
    }
    public void method2(){
        System.out.println("Method2....");
    }
    public void method3(){
        System.out.println("Method3....");
    }
}

public class ReflectDemo {
    public static void main(String[] args) throws Exception{
        Reflect reflect = new Reflect();
        if(args != null && args.length > 0){
            Class clazz = reflect.getClass();
            Method[] methods = clazz.getMethods();
            for(String str : args){
                for(int i = 0;i<methods.length;i++){
                    if(str.equalsIgnoreCase(methods[i].getName())){
                        methods[i].invoke(reflect);
                        break;
                    }
                }
            }
        }else{
            reflect.method1();
            reflect.method2();
            reflect.method3();
        }
    }
}
