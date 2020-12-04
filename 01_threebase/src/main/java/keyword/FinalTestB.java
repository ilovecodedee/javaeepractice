package keyword;
/**
 * @author Tiantun
 * @date 2020/12/4
 */
public final class FinalTestB {
    public static int totalNumber = 5;
    public final int ID;

    public FinalTestB() {
        // 可在构造器中给final修饰的“变量”赋值
        ID = ++totalNumber;
    }

    public static void main(String[] args) {
        FinalTestB t = new FinalTestB();
        System.out.println(t.ID);
        final int i = 10;
        final int j;

        j = 20;
        System.out.println(i + "  " + j);
        //J = 30;   // 非法

        Other o = new Other();
        new Something().addOne(o);
    }
}

//class C extends FinalTestB{}


class Something {
    public int addOnee(final int x) {
        //return ++x;
        return x + 1;
    }

    public void addOne(final Other o) {
        // o = new Other();
        o.i++;
        System.out.println(o.i);
    }
}

class Other {
    public int i;
}