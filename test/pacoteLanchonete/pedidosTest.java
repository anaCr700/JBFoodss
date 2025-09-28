package pacoteLanchonete;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class pedidosTest {
    
    public pedidosTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    
    @Test
    public void testCalcular() {
        double valor = 4.00;
          int quantidade= 3;
          
        pedidos p = new pedidos();
        p.setQuantidade(3);
        
      
        assertEquals(p.getQuantidade(),quantidade); //validacao
       p.calcular(valor);
    }
    
}
