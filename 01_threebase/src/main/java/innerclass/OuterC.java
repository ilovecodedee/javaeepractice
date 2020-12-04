package innerclass;

interface AbC {
    /** 
     * 方法做的事情和实现的功能是:
     * @description:   
     * @param: null 
     * @return:  
     * @author tiantun
     * @date: 2020/12/4
     */ 
  void fun1();
}

public class OuterC {
    public void callInner(AbC a) {
        a.fun1();
    }
}