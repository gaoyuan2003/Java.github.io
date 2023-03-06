package JAVA基础深化和提高.容器;

public class IGenericlmpl2<T> implements IGeneric<T> {
    //实现类在实现接口时仍然使用泛型作为数据类型
    @Override
    public T getName(T name) {
        return name;
    }
}
