package innerclass;
/**
 * @author Tiantun
 * @date 2020/12/4
 */
public class Outer {
    private int s = 111;

    public class InnerB {
        private int s = 222;

        public void mb(int s) {
            System.out.println(s); // 局部变量s
            System.out.println(this.s); // 内部类对象的属性s
            System.out.println(Outer.this.s); // 外部类对象属性s } }

        }
    }


}