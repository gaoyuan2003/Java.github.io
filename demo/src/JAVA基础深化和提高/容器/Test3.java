package JAVA基础深化和提高.容器;

public class Test3 {
    public static void main(String[] args) {
        MethodGeneric methodGeneric = new MethodGeneric();
        methodGeneric.setName("youxi");
        Integer age = methodGeneric.getAge(123);
        System.out.println(age);

        MethodGeneric methodGeneric1 = new MethodGeneric();
        methodGeneric1.setFlag("9090");
        Integer flag1 = MethodGeneric.getFlag(67);
        System.out.println(flag1);

        MethodGeneric methodGeneric2 = new MethodGeneric();
        String[] arr = new String[]{"a","b","c"};
        Integer[] arr2 = new Integer[]{1,2,3,4};
        methodGeneric2.method(arr);
        methodGeneric2.method(arr2);
    }
}
