package CarParts;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class GearBoxTest {
    Gearbox gearbox;

    @Before
    public void setUp() {
        gearbox = new Gearbox("10023");
    }

    @Test
    public void hasPartNum() {
        Assert.assertEquals("10023", gearbox.getPartNum());
    }
}
