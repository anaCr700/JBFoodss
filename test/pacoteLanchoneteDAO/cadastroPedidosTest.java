package pacoteLanchoneteDAO;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import pacoteLanchonete.cliente;
import pacoteLanchonete.pedidoEspecial;
import pacoteLanchonete.pedidos;

public class cadastroPedidosTest {
    private cliente c;
    private pedidos p;
    private cadastroPedidos cPe;
    private exibicao ex;
    
    public cadastroPedidosTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
         p = new pedidos();
        c = new cliente();
        cPe = new cadastroPedidos();
        ex = new exibicao();
    }
    
    @After
    public void tearDown() {
    }

   
    @Test
    public void testCadastrarCliente() {
        String nome = "luiza";
        String tel = "2222-999";
        String endereco = "rua m, n32";

        c.setNome(nome);
        c.setTelefone(tel);
        c.setEndereco(endereco);

        cPe.cadastrarCliente(c);
        ex.getExibirC(c);

        assertNotNull(cPe);
        assertNotNull(ex);
    }
    
}
