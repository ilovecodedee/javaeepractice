package innerclass;

class Outerr {
    private int s;

    public class InnerA {
        public void mb() {
            System.out.println("外部类中的s："+s);
            s = 100;
            System.out.println("在内部类Inner中s=" + s);
        }
    }

    public void ma() {
        InnerA i = new InnerA();

        i.mb();
    }
}

