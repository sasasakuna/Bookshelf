package com.thoughtworks.bs;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by hjli on 7/24/14.
 */
public class HelloWorldControllerTest {

    @Test
    public void shold_retun_hello(){
        HelloWorldController helloWorldController = new HelloWorldController();
        assertThat(helloWorldController.sayHello(),is("hello"));

    }

}
