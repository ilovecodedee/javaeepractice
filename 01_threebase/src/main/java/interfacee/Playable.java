package interfacee;

interface Playable {
    /** 
     * 方法做的事情和实现的功能是:
     * @description:   
     * @param: null 
     * @return:  
     * @author tiantun
     * @date: 2020/12/4
     */ 
    void play();
}

interface Bounceable {
    /** 
     * 方法做的事情和实现的功能是:
     * @description:   
     * @param: null 
     * @return:  
     * @author tiantun
     * @date: 2020/12/4
     */ 
    void play();
}

interface Rollable extends Playable,
        Bounceable {
    Ball BA = new Ball("PingPang");
}

class Ball implements Rollable {
    private String name;

    public String getName() {
        return name;
    }

    public Ball(String name) {
        this.name = name;
    }

    @Override
    public void play() {
       // ball = new Ball("Football");
        System.out.println(BA.getName());

    }
}