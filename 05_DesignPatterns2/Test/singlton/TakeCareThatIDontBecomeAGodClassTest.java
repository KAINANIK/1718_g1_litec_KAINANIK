package singlton;

import org.junit.Test;

import static org.junit.Assert.*;

public class TakeCareThatIDontBecomeAGodClassTest {
    @Test
    public void getInstance() throws Exception {

   int val = TakeCareThatIDontBecomeAGodClass.getInstance().getVal();
   String Info = TakeCareThatIDontBecomeAGodClass.getInstance().getMyInfo();

   System.out.println("val=" + val);

   assertEquals(0, val);

    }

}