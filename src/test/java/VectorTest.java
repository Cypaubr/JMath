import com.cypaubr.jmath.geometry.analytical.Point;
import com.cypaubr.jmath.geometry.analytical.Vector;
import org.junit.*;

import static java.lang.Math.sqrt;
import static junit.framework.TestCase.assertEquals;

/**
 * Test class for Vector class
 * @author Cyprien A.
 * @version 1.0
 */
public class VectorTest {

    private Vector vector, vectorCoordinates, vectorPoints;
    private Point A,B;

    @Before
    public void initialize(){
        vector = new Vector(25.0);
        vectorCoordinates = new Vector(2,4);
        A = new Point(1,2);
        B = new Point(2,4);
        vectorPoints = new Vector(A,B);
    }

    /**
     * Test for simple constructor
     */
    @Test
    public void testInstanciation(){
        assertEquals("getNorm should return 25.0",25.0,vector.getNorm());
    }

    /**
     * Test for coordinates constructor
     */
    @Test
    public void testCooridnatesInstanciation(){
        assertEquals("getNorm should return sqrt(20)",sqrt(20),vectorCoordinates.getNorm());
    }

    /**
     * Test for Points constructor
     */
    @Test
    public void testPointsInstanciation(){
        assertEquals("getX sould return 1.0",1.0,vectorPoints.getX());
        assertEquals("getY should return 2.0",2.0,vectorPoints.getY());
        assertEquals("getNorm should return sqrt(5)",sqrt(5),vectorPoints.getNorm());
    }
}
