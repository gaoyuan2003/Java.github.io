package JAVA基础深化和提高.函数式编程;

@FunctionalInterface
interface NoReturnNoParam{
    void method();
}

@FunctionalInterface
interface NoReturnOneParam{
    void method(int a);
}

@FunctionalInterface
interface NoReturnMultiParam{
    void method(int a,int b);
}

@FunctionalInterface
interface ReturnNoParam{
    int method();
}

@FunctionalInterface
interface ReturnOneParam{
    int method(int a);
}

@FunctionalInterface
interface ReturnMultiParam{
    int method(int a,int b);
}


public class Test {
    public static void main(String[] args) {
        NoReturnNoParam noReturnNoParam = () -> System.out.println("NoReturnNoParam");
        noReturnNoParam.method();

        NoReturnOneParam noReturnOneParam = a -> System.out.println("NoReturnOneParam "+a);
        noReturnOneParam.method(10);

        NoReturnMultiParam noReturnMultiParam = (a,b) -> {
            System.out.println("NoReturnMultiParam");
            System.out.println("NoReturnMultiParam "+a+" "+b);
        };
        noReturnMultiParam.method(10,20);

        ReturnNoParam returnNoParam = () -> 10+10;
        System.out.println(returnNoParam.method());

        ReturnOneParam returnOneParam = a -> a;
        System.out.println(returnOneParam.method(23));

        ReturnMultiParam returnMultiParam = (a,b) -> a+b;
        System.out.println(returnMultiParam.method(1,2));
    }
}
