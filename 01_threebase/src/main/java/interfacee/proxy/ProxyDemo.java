package interfacee.proxy;

import interfacee.Ac;

interface Network {
    /** 
     * 方法做的事情和实现的功能是:
     * @description:   
     * @param: null 
     * @return:  
     * @author tiantun
     * @date: 2020/12/4
     */ 
     void browse();
}


/**
 * @description: 被代理类 静态代理实例
 * @author Tiantun
 * @date 2020/12/4
 */
class RealServer implements Network {
    @Override
    public void browse() {
        System.out.println("真实服务器上网浏览信息");
    }
}

/**
 * @author Tiantun
 * @date 2020/12/4
 */
class ProxyServer implements Network {
    private Network network;

    public ProxyServer(Network network) {
        this.network = network;
    }

    public void check() {
        System.out.println("检查网络连接等操作");
    }

    @Override
    public void browse() {
        check();
        network.browse();
    }
}
/**
 * @author Tiantun
 * @date 2020/12/4
 */
public class ProxyDemo {
    public static void main(String[] args) {
        Network net = new ProxyServer(new
                RealServer());
        net.browse();
        Ac.method2();
        System.out.println(Ac.method1());
    }
}