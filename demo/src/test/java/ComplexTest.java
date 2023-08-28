import static org.junit.Assert.assertEquals;
import org.junit.Test;
import classes.exercise04.Complex;

public class ComplexTest {
    @Test
    public void Angulo(){
        Complex complex = new Complex(1,Math.sqrt(3));
        System.out.println(complex.getArgument());

    }
}
