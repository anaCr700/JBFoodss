package pacoteLanchoneteDAO;

import java.util.ArrayList;
import java.util.List;
import pacoteLanchonete.cardapio;
import pacoteLanchonete.cliente;
import pacoteLanchonete.pedidoEspecial;
import pacoteLanchonete.pedidos;

public class cadastroPedidos {

    public cadastroPedidos() {
    }

    public void cadastrarCliente(cliente c) {

        try {
            c.getNome();
            c.getTelefone();
            c.getEndereco();

        } catch (Exception e) {
            System.out.println("erro ao cadastrar os dados do cliente: " + e.getMessage());
        }
    }

    public void cadastrarPedido(pedidos p) {
        try {

            p.getQuantidade();
            p.getObservacoes();
            p.getValorTotal();
            p.getFormaPagamento();
        } catch (Exception e) {
            System.out.println("erro ao casdatrar o pedido: " + e.getMessage());
        }
    }

    public void cadastrarPedidoEsp(pedidoEspecial pes) {
        try {

            pes.getNome_Esp();
            pes.getEnd_Esp();
            pes.getLanche_Esp();
            pes.getRecado();

            System.out.println("pedido especial cadastrados com sucesso!");

        } catch (Exception e) {
            System.out.println("erro ao casdatrar os dados da pessoa especial: " + e.getMessage());
        }
    }
}
