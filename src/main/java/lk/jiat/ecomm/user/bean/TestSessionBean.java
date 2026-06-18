package lk.jiat.ecomm.user.bean;

import jakarta.ejb.Stateless;
import lk.jiat.ecomm.user.remote.TestRemote;

@Stateless
public class TestSessionBean implements TestRemote {

   public TestSessionBean(){
        System.out.println("TestSessionBean created " + this);
    }

    @Override
    public void test() {
        System.out.println("Test Session Bean");
    }

}
