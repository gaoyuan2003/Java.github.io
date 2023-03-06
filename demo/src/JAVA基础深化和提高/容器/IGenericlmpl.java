package JAVA基础深化和提高.容器;

//这是一个实现IGeneric接口的实现类
public class IGenericlmpl implements IGeneric<String>{
    //在实现接口时传递具体数据类型

    @Override
    public String getName(String name) {
        return name;
    }
}
