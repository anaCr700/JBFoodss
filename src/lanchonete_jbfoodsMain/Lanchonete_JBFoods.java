package lanchonete_jbfoodsMain;

import java.util.Scanner;
import pacoteLanchonete.cliente;
import pacoteLanchonete.pedidoEspecial;
import pacoteLanchonete.pedidos;
import pacoteLanchoneteDAO.cadastroPedidos;
import pacoteLanchoneteDAO.exibicao;

public class Lanchonete_JBFoods {

    public static void main(String[] args) {
        Scanner resp = new Scanner(System.in);

        cadastroPedidos cPedido = new cadastroPedidos(); //armazenar esses cadasstros pDao
        exibicao ex = new exibicao();
        pedidos p = new pedidos(); //add pedidos
        pedidoEspecial pes = new pedidoEspecial();
        cliente clientes = new cliente(); //add cliente 

        String nome, endereco, tel, lancheEsp, nomeEsp, endEsp, obs, formaPag, lanche, bebida, selecionar, opc, recado, opc1, opc2;
        int quantidade;
        double valorTotal;

        System.out.println("Veja nosso cardapio: ");
        ex.getCardapio(); //mostrar cardapio

        System.out.println("\n");

        System.out.print("nome: ");
        nome = resp.nextLine();

        System.out.print("Telefone: ");
        tel = resp.nextLine();

        System.out.print("endereco: ");
        endereco = resp.nextLine();

        clientes.setNome(nome);
        clientes.setEndereco(endereco);
        clientes.setTelefone(tel);

        cPedido.cadastrarCliente(clientes); //cadastrar cliente

        System.out.println("selecionar: Lanche ou Bebida");
        selecionar = resp.next();

        if (selecionar.equalsIgnoreCase("lanche")) {

            System.out.print("selecine o lanche: ");
            lanche = resp.nextLine();

            resp.nextLine();

            System.out.print("quantidade: ");
            quantidade = resp.nextInt();

            valorTotal = quantidade * 9.00;

            System.out.println("valor total: " + valorTotal);
            resp.nextLine();

            System.out.print("Obs: ");
            obs = resp.nextLine();

            System.out.print("forma de pagamento: ");
            formaPag = resp.nextLine();

            p.setObservacoes(obs);
            p.setFormaPagamento(formaPag);
            p.setValorTotal(valorTotal);
            p.setQuantidade(quantidade);
            p.setLanche(lanche);

            cPedido.cadastrarPedido(p);

        }

        System.out.println("Deseja pedir uma bebida de acompanhamento? S/N");
        opc2 = resp.nextLine();

        if (selecionar.equalsIgnoreCase("bebida") || opc2.equalsIgnoreCase("s")) { //bebida
            System.out.print("selecine a bebida: ");
            bebida = resp.nextLine();

            System.out.print("quantidade: ");
            quantidade = resp.nextInt();

            valorTotal = quantidade * 9.00;

            System.out.println("valor total: " + valorTotal);
            resp.nextLine();

            System.out.print("Obs: ");
            obs = resp.nextLine();

            System.out.print("forma de pagamento: ");
            formaPag = resp.nextLine();

            p.setObservacoes(obs);
            p.setFormaPagamento(formaPag);
            p.setValorTotal(valorTotal);
            p.setQuantidade(quantidade);
            p.setBebida(bebida);

            cPedido.cadastrarPedido(p);
        }

        System.out.print("Fazer Pedido especial (F) ou Finalizar Pedido(P)");
        opc = resp.nextLine();

        if (opc.equalsIgnoreCase("f")) {
            System.out.println("nome da pesssoa especial: ");
            nomeEsp = resp.nextLine();

            System.out.println("endereco dela: ");
            endEsp = resp.nextLine();

            System.out.println("lanche: ");
            lancheEsp = resp.nextLine();

            System.out.println("recado: ");
            recado = resp.nextLine();

            pes.setNome_Esp(nomeEsp);
            pes.setEnd_Esp(endEsp);
            pes.setLanche_Esp(lancheEsp);
            pes.setRecado(recado);

            cPedido.cadastrarPedido(p);
            cPedido.cadastrarPedidoEsp(pes);

        } else if (opc.equalsIgnoreCase("p")) {
            ex.getCardapio();
            ex.getExibirC(clientes);
            ex.getExibirP(p);
            ex.getExibirEsp();
        }

        /*clientes.setEndereco("rua");
        clientes.setNome("mara");
        clientes.setTelefone("1111-0000");

        pDao.getExibirC(clientes); //exibir

        p.setObservacoes("");
        p.setFormaPagamento("pix");*/
    }
}
