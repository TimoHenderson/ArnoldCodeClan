package CarParts;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class WheelsTest {
    Wheels wheels;

    @Before
    public void setUp() {
        wheels = new Wheels("10023");
    }

    @Test
    public void hasPartNum() {
        Assert.assertEquals("10023", wheels.getPartNum());
    }
}
