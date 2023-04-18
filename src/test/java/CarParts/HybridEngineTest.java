package CarParts;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class HybridEngineTest {
    HybridEngine electricMotor;

    @Before
    public void setUp() {
        electricMotor = new HybridEngine("10023");
    }

    @Test
    public void hasPartNum() {
        Assert.assertEquals("10023", electricMotor.getPartNum());
    }
}
