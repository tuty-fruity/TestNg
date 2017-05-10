package com.sample.testng;

import com.sample.testng.App;
import org.testng.Assert;
import org.testng.annotations.*;

public class AppTest {

    App app;

    @BeforeClass
    public void setUp() {
        /*
        System.out.println("Test is starting");
        app = new App();
        */
    }

    @Test
    public void testSayHello() {
        //Assert.assertEquals("Hello World", app.sayHello());
    }
}
