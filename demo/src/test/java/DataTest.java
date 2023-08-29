import org.junit.Test;
import static org.junit.Assert.assertEquals;
import classes.exercise05.Data;

public class DataTest {
    @Test
    public void testData() {
        Data data = new Data(31,8,2023);
        
        assertEquals("31/8/2023",data.toString());
        assertEquals("1/9/2023", data.avancarDia());
    }

     @Test
     public void testFalhaDiaInvalido() {
        Data data = new Data(0,8,2023);
        
     }
}
