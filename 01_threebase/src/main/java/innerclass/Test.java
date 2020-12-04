package innerclass;
/**
 * @author Tiantun
 * @date 2020/12/4
 */
public class Test {
    public Test() {
        Inner s1 = new Inner();
        s1.a = 10;
        Inner s2 = new Inner();
        s2.a = 20;
        Test.Inner s3 = new Test.Inner();
        System.out.println(s3.a);
    }

    class Inner {
        public int a = 5;
    }


}