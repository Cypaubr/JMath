import com.cypaubr.jmath.PointPositionException;
import com.cypaubr.jmath.geometry.Square;
import com.cypaubr.jmath.geometry.analytical.Point;
import org.junit.*;

import static junit.framework.TestCase.assertEquals;

/**
 * Test class for Square
 * @author Cyprien A.
 * @version 1.0
 */
public class SquareTest {

    private Square square,squarePoint;
    private Point A,B,C,D;

    @Before
    public void initialize() throws PointPositionException {
        square = new Square(5.0);
        A = new Point(0,0);
        B = new Point(0,5);
        C = new Point(5,5);
        D = new Point(5,0);
        squarePoint = new Square(A,D,C,B);
    }

    /**
     * Test for main square instcanciation
     */
    @Test
    public void instanciationTest(){
        assertEquals("getSide should return 5",5.0,square.getSide());
    }

    /**
     * Test for square instanciation from Points
     */
    @Test
    public void instanciationPointTest(){
        assertEquals("getPointA should return Point(0,0)",A,squarePoint.getPointA());
        assertEquals("getPointB should return Point(5,0)",D,squarePoint.getPointB());
        assertEquals("getPointC should return Point(5,5)",C,squarePoint.getPointC());
        assertEquals("getPointD should return Point(0,5)",B,squarePoint.getPointD());
    }

    /**
     * Test for PoinPositionException applied to Squares
     * @throws PointPositionException
     */
    @Test(expected = PointPositionException.class)
    public void pointPositionExceptionTest() throws PointPositionException {
        Square squarePointFail = new Square(A,B,C,D);
    }

    /**
     * Test for square perimeter calculation
     */
    @Test
    public void perimeterTest(){
        assertEquals("getPerimeter should return 20",20.0,square.getPerimeter());
    }

    /**
     * Test for PlaceableInSpace interface implementation
     */
    @Test
    public void placeableInSpaceTest(){
        assertEquals("This square should not be placeable in space",false,square.isPlaceableInSpace());
        assertEquals("This square should be placeable in space",true,squarePoint.isPlaceableInSpace());
    }
}
