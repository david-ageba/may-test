package stepdefinitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hook {

    @Before
    public void initialiseTest()
    {
        System.out.println("starting Test and  Opening Browser");
    }

    @After
    public void TearDownTest()
    {

        System.out.println("End Test and Closing Browser");
    }
}
