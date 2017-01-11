import com.cypaubr.jmath.matrix.IntMatrix;
import org.junit.*;

import static org.junit.Assert.assertEquals;

/**
 * Test class for integer matrix
 * @author Cyprien A.
 * @version 1.0
 */
public class IntMatrixTest {

    private IntMatrix matrix;
    private int tab[][] = {
            {1,2,3},
            {4,5,6}
    };

    @Before
    public void initialize(){
        matrix = new IntMatrix(tab);
    }

    @Test
    public void InstanciationTest1(){
        //TODO
    }

    @Test
    public void LengthTest(){
        assertEquals("Should return 6",6,matrix.length());
    }

    @Test
    public void RowLengthTest(){
        assertEquals("Should return 3",3,matrix.rowLength());
    }

    @Test
    public void ColumnLengthTest(){
        assertEquals("Should return 2",2,matrix.columnLength());
    }
}
