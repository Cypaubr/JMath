import com.cypaubr.jmath.geometry.analytical.Vector;
import org.junit.*;

import static junit.framework.TestCase.assertEquals;

/**
 * Test class for Vector class
 * @author Cyprien A.
 * @version 1.0
 */
public class VectorTest {

    private Vector vector;

    @Before
    public void initialize(){
        vector = new Vector(25.0);
    }

    /**
     * Test for simple constructor
     */
    @Test
    public void testInstanciation(){
        assertEquals("getNorm should return 25.0",25.0,vector.getNorm());
    }
}
