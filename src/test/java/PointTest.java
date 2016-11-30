import com.cypaubr.jmath.geometry.analytical.Point;
import org.junit.*;

import static junit.framework.TestCase.assertEquals;

/**
 * Test class for Point
 * @author Cyprien A.
 * @version 1.0
 */
public class PointTest {

    private Point point;

    @Before
    public void initialize(){
        point = new Point(5.0,10.0);
    }

    @Test
    public void instanciationTest1(){
        assertEquals("getX() should return 5.0",5.0,point.getX());
        assertEquals("getY() should return 10.0",10.0,point.getY());
    }
}
