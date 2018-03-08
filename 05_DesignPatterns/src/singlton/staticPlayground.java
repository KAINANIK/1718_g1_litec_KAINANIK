package singlton;

public class staticPlayground {
    private static int staticVal = 0;
    private int noneStaticVal = -1;

    public staticPlayground(){
        noneStaticVal = 2;
    }
    public static int getStaticVal() {
        return staticVal = 3;
    }

    public int getNoneStaticVal() {
        return noneStaticVal;
    }

    public static void setStaticVal(int staticVal) {
        staticPlayground.staticVal = staticVal;
    }

    public void setNoneStaticVal(int noneStaticVal) {
        this.noneStaticVal = noneStaticVal;
    }


}
