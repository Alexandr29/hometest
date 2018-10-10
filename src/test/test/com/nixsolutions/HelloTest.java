package test.com.nixsolutions;

import main.com.nixsolutions.Hello;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class HelloTest {
    Hello hello;
    @Before public void setUp() throws Exception {
        hello = new Hello();
    }

    @After public void tearDown() throws Exception {

    }

    @Test public void print() {
        String s = hello.print("John");
        Assert.assertEquals("str","Hello John",s);
    }
}