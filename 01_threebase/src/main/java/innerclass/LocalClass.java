package innerclass;
/**
 * @author Tiantun
 * @date 2020/12/4
 */
public class LocalClass {
    public void testD() {
        /**
         * 内部类做的事情和实现的功能是:
         * @description:
         * @param:
         * @return: void
         * @author tiantun
         * @date: 2020/12/4
         */
        class JbneiBn {
            public String fun3() {
                return "我是局部内部类";
            }
        }
        System.out.println(new JbneiBn().fun3());
    }

    //代码块中也可以声明
    static {
        class JbneiBnn {
            public String fun3() {
                return "我是局部内部类";
            }
        }

    }
}
