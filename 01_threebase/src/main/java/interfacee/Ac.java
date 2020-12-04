package interfacee;
/**
 * @description:
 * @author tiantun
 * @date 2020/12/4
 * @version 1.0
 */
public interface Ac {
    double PI = 3.14;

/** 
 * 方法做的事情和实现的功能是:
 * @description:   
 * @param: null 
 * @return:  
 * @author admin
 * @date: 2020/12/4 16:24
 */ 
     default void method() {
        System.out.println("北京");

    }
/** 
 * 方法做的事情和实现的功能是:
 * @description:   
 * @param: null 
 * @return:  
 * @author tiantun
 * @date: 2020/12/4
 */ 
     static String method1() {
        return "上海";
    }

    /** 
     * 方法做的事情和实现的功能是:
     * @description:
     * @param: null 
     * @return:  
     * @author tiantun
     * @date: 2020/12/4
     */ 
     static void method2() {
        System.out.println("hello lambda !");
    }
}