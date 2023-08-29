import static org.junit.Assert.assertEquals;
import org.junit.Test;
import classes.exercise04.Complex;

public class ComplexTest {
    @Test
    public void Angulo(){
        Complex complex = new Complex(1,-1);
        System.out.println(complex.getArgument());

    }
    @Test
    public void testaString(){
        Complex complex = new Complex(1,-1);
        complex.toString();
        System.out.println(complex.toString());
    }
    @Test
    public void testaAritmeticos(){
        Complex complex = new Complex(1,-1);
        complex.getDivisao(2);
        complex.getMult(5);
        complex.getAdc(4);
        complex.getSub(2);
    }
}
