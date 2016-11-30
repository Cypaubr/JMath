import com.cypaubr.jmath.trigonometry.Triangle;
import org.junit.*;

import static junit.framework.TestCase.assertEquals;

public class TriangleTest {

    private Triangle triangle;

    @Before
    public void initialize(){
        triangle = new Triangle(1.0,2.0,3.0);
    }

    @Test
    public void instanciationTest1(){
        assertEquals("getA() should return 1.0",1.0,triangle.getA());
        assertEquals("getB() should return 2.0",2.0,triangle.getB());
        assertEquals("getC() should return 3.0",3.0,triangle.getC());
    }
}
