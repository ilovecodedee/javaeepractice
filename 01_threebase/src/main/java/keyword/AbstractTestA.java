package keyword;

abstract class BaseA {
    /**
     *  抽象方法1
    * */
    abstract void m1();

    public void m2() {
        System.out.println("A类中定义的m2方法");
    }
}

class BaB extends BaseA {
    @Override
    void m1() {
        System.out.println("B类中定义的m1方法");
    }
}

/**
 * @author admin
 */
public class AbstractTestA {
    public static void main(String[] args) {
        BaseA a = new BaB();
        a.m1();
        a.m2();
    }
}