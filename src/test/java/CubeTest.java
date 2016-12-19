import com.cypaubr.jmath.geometry.Square;
import com.cypaubr.jmath.geometry.tridimensionnal.Cube;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Test class for cubes
 * @author Cyprien A.
 * @version 1.0
 */
public class CubeTest {

    private Cube cube, cubeSquare;
    private Square square;

    @Before
    public void initialize(){
        this.cube = new Cube(5);
        this.square = new Square(3);
        this.cubeSquare = new Cube(square);
    }

    /**
     * Test for instanciation with an edge
     */
    @Test
    public void simpleInstanciationTest(){
        assertEquals("Should return 5.0",5.0,cube.getEdge());
    }

    /**
     * Test for instanciation with a square
     */
    @Test
    public void squareInstanciationTest(){
        assertEquals("Should return 3.0",3.0,cubeSquare.getEdge());
        assertEquals("Should return 27.0", 27.0, cubeSquare.getVolume());
    }

    /**
     * Test for volume getter
     */
    @Test
    public void volumeTest(){
        assertEquals("Should return 125.0", 125.0, cube.getVolume());
    }
}
