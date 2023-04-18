package CarParts;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PetrolEngineTest {
    PetrolEngine engine;

    @Before
    public void setUp() {
        engine = new PetrolEngine("10023");
    }

    @Test
    public void hasPartNum() {
        Assert.assertEquals("10023", engine.getPartNum());
    }
}
