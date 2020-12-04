package interfacee;



interface Aa {
    /**
     * 定义常量X
     */
    int X = 0;
}

class B11 {
    int x = 1;
    public void testB(){
        System.out.println("你好我是testB");
    }
}

class Cc extends B11 implements Aa {
    public void pX() {
        //System.out.println(x);
    }

    public static void main(String[] args) {
        new Cc().pX();
    }
}