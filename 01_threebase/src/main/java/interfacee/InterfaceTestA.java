package interfacee;
/**
 * @author Tiantun
 * @date 2020/12/4
 */
public interface InterfaceTestA {
    /**
     * 方法做的事情和实现的功能是:
     * @description:
     * @param: null
     * @return:
     * @author tiantun
     * @date: 2020/12/4
     */
    void run();
}

class A1 implements InterfaceTestA{

    @Override
    public void run() {
        System.out.println("我在运动呀");
    }
}

class B1 {
    public static void main(String[] args) {
        InterfaceTestA test=new A1();
        test.run();
    }
}
