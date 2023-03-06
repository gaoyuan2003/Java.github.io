package JAVA基础深化和提高.容器;

public class Generic<T> {
    private T flag;

    public void setFlag(T flag){
        this.flag = flag;
    }

    public T getFlag(){
        return this.flag;
    }
}
