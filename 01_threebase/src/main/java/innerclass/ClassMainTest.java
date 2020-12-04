package innerclass;
/**
 * @author Tiantun
 * @date 2020/12/4
 */
public  class ClassMainTest {
    public static void main(String[] args) {
        //1成员内部类的使用
        //1.1在自己内部使用
        Outerr o = new Outerr();

        o.ma();
        //1.2返回到外部使用
        Outer a = new Outer();
        Outer.InnerB b = a.new InnerB();
        b.mb(333);
        //局部内部类的使用
        LocalClass localClass = new LocalClass();
        localClass.testD();
        //匿名内部类
        new OuterC().callInner(new AbC() {
            //接口是不能new但此处比较特殊是子类对象实现接口，只不过没有为对象取名
            @Override
            public void fun1() {
                System.out.println(this.getClass());
                System.out.println("implement for fun1 ");
            }
        });// 两步写成一步了

        //内部类练习
        Test t = new Test();
        Test.Inner r = t.new Inner();
        System.out.println(r.a);
    }
}
