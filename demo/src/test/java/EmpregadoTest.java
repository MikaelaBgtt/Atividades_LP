import static org.junit.Assert.assertEquals;
import org.junit.Test;
import classes.exercise03.Empregado;

public class EmpregadoTest {
    @Test
    public void Anual(){
        Empregado empregado1 =  new Empregado("Sebastião","Sargadão",1800.0);
        Empregado empregado2 = new Empregado("Maria", "Valdineusa", 2000.0);
        empregado1.setSalario(empregado1.getSalario()*0.1+empregado1.getSalario());
        empregado2.setSalario(empregado2.getSalario()*0.1+empregado2.getSalario());
        assertEquals(1980.0, empregado1.getSalario(), 0.01);  // 0.01 é a margem de erro permitida
        assertEquals(2200.0, empregado2.getSalario(), 0.01);
        assertEquals(23760.0, empregado1.getSalario()*12,0.01);
        assertEquals(26400.0, empregado2.getSalario()*12,0.01);

    }

}
