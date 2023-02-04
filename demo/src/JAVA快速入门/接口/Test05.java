package 接口;

/**
 * 接口的多继承
 */
public class Test05 implements c{
    @Override
    public void testa() {

    }

    @Override
    public void testb() {

    }

    @Override
    public void testc() {

    }
}
interface a{
    void testa();
}
interface b{
    void testb();
}
interface c extends a,b{
    void testc();
}