package keyword;

class FinalTestA {
    /**
     * @description: 声明常量
     */
    private final String INFO = "ccccc";
    public final void print() {
        //INFO="bbb";
        System.out.println("A");
    }
}

/*class B extends FinalTestA {
    public void print() { // 错误，不能被重写。
        System.out.println("尚硅谷");
    }
}*/