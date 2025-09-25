package lanchonete_jbfoodsMain;

import java.util.List;
import java.util.Scanner;
import pacoteLanchonete.cliente;
import pacoteLanchonete.pedidos;
import pacoteLanchoneteDAO.pedidosDao;

public class Lanchonete_JBFoods {

    public static void main(String[] args) {
        Scanner resp = new Scanner(System.in);
        pedidosDao pDao = new pedidosDao(); //adicionar pedidos
        pedidos p = new pedidos(); //armazenar esses cadasstros pDao

        cliente clientes = new cliente(); //adicionar cliente 

        String nome, endereco, tel, lancheEsp, nomeEsp, endEsp, obs, formaPag, lanche, bebida, selecionar, opc, recado, opc1;
        int quantidade;
        double valorTotal;

        System.out.println("Veja nosso cardapio: ");
        pDao.getCardapio(); //mostrar cardapio

        resp.nextLine();

        /*System.out.println("Deseja fazer um pedido? S/N");
        opc1= resp.nextLine();*/
        
        System.out.println("nome: ");
        nome = resp.nextLine();

        System.out.println("Telefone: ");
        tel = resp.nextLine();

        System.out.println("endereco: ");
        endereco = resp.nextLine();

        clientes.setNome(nome);
        clientes.setEndereco(endereco);
        clientes.setTelefone(tel);

        pDao.cadastrarCliente(clientes); //cadastrar cliente

        System.out.println("selecionar: Lanche ou Bebida");
        selecionar = resp.next();

        if (selecionar.equalsIgnoreCase("lanche")) {

            System.out.println("selecine o lanche: ");
            lanche = resp.nextLine();

            System.out.println("quantidade: ");
            quantidade = resp.nextInt();

            valorTotal = quantidade * 9.00;

            System.out.println("valor total: " + valorTotal);

            System.out.println("Obs: ");
            obs = resp.nextLine();

            System.out.println("forma de pagamento: ");
            formaPag = resp.nextLine();

            p.setObservacoes(obs);
            p.setFormaPagamento(formaPag);
            p.setValorTotal(valorTotal);
            p.setQuantidade(quantidade);

            pDao.cadastrarPedido(p);

        } else if (selecionar.equalsIgnoreCase("bebida")) { //bebida
            System.out.println("selecine a bebida: ");
            lanche = resp.nextLine();

            System.out.println("quantidade: ");
            quantidade = resp.nextInt();

            valorTotal = quantidade * 9.00;

            System.out.println("valor total: " + valorTotal);

            p.setValorTotal(valorTotal);

            System.out.println("Obs: ");
            obs = resp.nextLine();

            System.out.println("forma de pagamento: ");
            formaPag = resp.nextLine();

            /*p.setObservacoes(obs);
            p.setFormaPagamento(formaPag);
            p.setValorTotal(valorTotal);
            p.setQuantidade(quantidade);*/

            pDao.cadastrarPedido(p);
        }

        System.out.println("Fazer Pedido (F) ou Finalizar Pedido(P)");
        opc = resp.nextLine();

        if (opc.equalsIgnoreCase("p")) {
            System.out.println("nome da pesssoa especial: ");
            nomeEsp = resp.nextLine();

            System.out.println("endereco dela: ");
            endEsp = resp.nextLine();

            System.out.println("lanche: ");
            lancheEsp = resp.nextLine();

            System.out.println("recado: ");
            recado = resp.nextLine();

            p.setNome_recado(nomeEsp);
            p.setEnd_recado(endEsp);
            p.setLancheEsp(lancheEsp);
            p.setEnd_recado(recado);
            
            pDao.cadastrarPedido(p);
            pDao.cadastrarPedidoEsp(p);

            

        } else if (opc.equalsIgnoreCase("f")) {
            pDao.getExibirC(clientes);
            pDao.getExibirP(p);
            pDao.getExibirEsp();
        }

        /*clientes.setEndereco("rua");
        clientes.setNome("mara");
        clientes.setTelefone("1111-0000");

        pDao.getExibirC(clientes); //exibir

        p.setObservacoes("");
        p.setFormaPagamento("pix");*/
        pDao.cadastrarPedido(p); //cadastrar pedido: 

        pDao.getExibirP(p);
    }
}
