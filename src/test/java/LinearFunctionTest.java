import com.cypaubr.jmath.analysis.LinearFunction;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Test class for linear functions
 * @author Cyprien A.
 * @version 1.0
 */
public class LinearFunctionTest {
    private LinearFunction f;

    @Before
    public void initialize(){
        f = new LinearFunction(2,3);
    }

    @Test
    public void InstanciationTest(){
        assertEquals("Should return 2.0",2.0,f.getA());
        assertEquals("Should return 3.0", 3.0, f.getB());
    }

    @Test
    public void ImageCalculationTest(){
        assertEquals("Should return 3.0", 3.0, f.image(0));
        assertEquals("Should return 5.0", 5.0, f.image(1));
        assertEquals("Should return -3.0", -3.0, f.image(-3));
    }
}
