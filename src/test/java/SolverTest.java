import com.cypaubr.jmath.analysis.Function;
import com.cypaubr.jmath.analysis.LinearFunction;
import com.cypaubr.jmath.analysis.Polynomial2Function;
import com.cypaubr.jmath.analysis.Solver;
import org.junit.*;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.instanceOf;

/**
 * Test class for Solver
 * @author Cyprien A.
 * @version 1.0
 */
public class SolverTest {

    private Function functionLinear,functionPolynomial;
    private Solver solverLinear,solverPolynomial;

    @Before
    public void initialize(){
        this.functionLinear = new LinearFunction(2,-3);
        this.functionPolynomial = new Polynomial2Function(3,1,-2);
        this.solverLinear = new Solver(functionLinear);
        this.solverPolynomial = new Solver(functionPolynomial);
    }

    @Test
    public void getterCastTest(){

    }

}
