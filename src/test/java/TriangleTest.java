import com.cypaubr.jmath.analytical.Point;
import com.cypaubr.jmath.trigonometry.Triangle;
import org.junit.*;

import static java.lang.Math.sqrt;
import static junit.framework.TestCase.assertEquals;

/**
 * Test class for Triangle class
 * @author Cyprien A.
 * @version 1.0
 */
public class TriangleTest {

    private Triangle triangle,trianglePoint;
    private Point A,B,C;

    @Before
    public void initialize(){
        triangle = new Triangle(1.0,2.0,3.0);
        A = new Point(0.0,0.0);
        B = new Point(2.0,0.0);
        C = new Point(5.0,5.0);
        trianglePoint = new Triangle(A,B,C);
    }

    /**
     * Test for the main Triangle constructor
     */
    @Test
    public void instanciationTest(){
        assertEquals("getA() should return 1.0",1.0,triangle.getA());
        assertEquals("getB() should return 2.0",2.0,triangle.getB());
        assertEquals("getC() should return 3.0",3.0,triangle.getC());
    }

    /**
     * Test for the Point Triangle constructor
     */
    @Test
    public void instanciationPointTest(){
        //testing points
        assertEquals("getPointA() should return Point(0.0,0.0)", A, trianglePoint.getPointA());
        assertEquals("getPointB() should return Point(2.0,0.0)", B, trianglePoint.getPointB());
        assertEquals("getPointC() should return Point(5.0,5.0)", C , trianglePoint.getPointC());
        //testing generated length
        assertEquals("Calculated a side should be 2.0",2.0,trianglePoint.getA());
        assertEquals("Calculated b side should be sqrt(34)",sqrt(34),trianglePoint.getB());
        assertEquals("Calculated c side should be sqrt(50)",sqrt(50),trianglePoint.getC());
    }
}
