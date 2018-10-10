package test.com.nixsolutions;

import junit.framework.Test;
import junit.framework.TestSuite;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)

public class Tester {
    public TestSuite testSuite(){
        TestSuite testSuite = new TestSuite();
        testSuite.addTest((Test) new HelloTest());
    return testSuite;
    }
}
