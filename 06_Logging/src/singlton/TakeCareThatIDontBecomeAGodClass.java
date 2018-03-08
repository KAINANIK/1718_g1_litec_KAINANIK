package singlton;

public class TakeCareThatIDontBecomeAGodClass {
    private static TakeCareThatIDontBecomeAGodClass ourInstance = new TakeCareThatIDontBecomeAGodClass();


    private int  val;
    private String myInfo;

    public static TakeCareThatIDontBecomeAGodClass getInstance() {
        return ourInstance;
    }

    private TakeCareThatIDontBecomeAGodClass() {

        val = 0;
        myInfo= "No Info";

    }
    public int getVal() {
        return val;
    }

    public String getMyInfo() {
        return myInfo;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public void setMyInfo(String myInfo) {
        this.myInfo = myInfo;
    }

}
