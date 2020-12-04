package keyword;


/**
 * @author Tiantun
 * @date 2020/12/4
 */
public class StaticClass {
    public static void main(String[] args) {
     int a=Personp.total;
        System.out.println(a);
        System.out.println("total = " + Personp.total);
        System.out.println("total = " + Personp.total);


    }
}


class Personp {
    public static int total;
    static {
        total = 100;
        System.out.println("in static block!");
    } }
