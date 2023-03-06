package JAVA基础深化和提高.容器;

public interface IGeneric<T> {
    //泛型接口的使用
    /**
     * public interface 接口名<泛型标识符号>{}
     * public interface 接口名<泛型标识符号,泛型标识符号>{}
     */
    T getName(T name);
}
