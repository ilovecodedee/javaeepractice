package interfacee;

interface Filial {// 孝顺的
/** 
 * 方法做的事情和实现的功能是:
 * @description:   
 * @param: null 
 * @return:  
 * @author tiantun
 * @date: 2020/12/4
 */ 
    default void help() {
        System.out.println("老妈，我来救你了");
    }
}

interface Spoony {// 痴情的
/** 
 * 方法做的事情和实现的功能是:
 * @description:   
 * @param: null 
 * @return:  
 * @author tiantun
 * @date: 2020/12/4
 */ 
    default void help() {
        System.out.println("媳妇，别怕，我来了");
    }
}

class Man implements Filial, Spoony {
    @Override
    public void help() {
        System.out.println("我该怎么办呢？");
        Filial.super.help();
        Spoony.super.help();
    }
}