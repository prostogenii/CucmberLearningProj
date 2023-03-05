package stepDefinations;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before("@MobileTest")
    public void beforevalidation(){
        System.out.println("Before mobile hook");
    }

    @After("@MobileTest")
    public void aftervalidation(){
        System.out.println("After mobile hook");
    }

}
