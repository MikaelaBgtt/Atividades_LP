
import static org.junit.Assert.assertEquals;
import org.junit.Test;

import classes.exercise02.Invoice;


public class InvoiceTest {
    @Test
    public void Main(){
        Invoice invoice = new Invoice(32,"Mouse",10,40.0);
        invoice.getInvoiceAmount();
    }
    @Test
    public void testaNegativo(){
        Invoice invoice = new Invoice(32,"Mouse",-5,40.0);
        assertEquals(0, invoice.getQuantidadeItem());
       
    }
}
