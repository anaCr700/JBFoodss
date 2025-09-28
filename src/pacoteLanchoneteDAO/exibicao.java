package pacoteLanchoneteDAO;

import java.util.ArrayList;
import java.util.List;
import pacoteLanchonete.cardapio;
import pacoteLanchonete.cliente;
import pacoteLanchonete.pedidoEspecial;
import pacoteLanchonete.pedidos;

public class exibicao {

    public List<cardapio> getCardapio() {

        try {
            List<cardapio> lista = new ArrayList<>();

            cardapio c = new cardapio();

            for (int i = 0; i < 1; i++) {
                c.setLanche("lanches");
                c.setDescricaoL("descricaoL");
                c.setPreçoL(9.00);
                c.setBebidas("bebidas");
                c.setPreçoB(9.00);

                lista.add(c);

                System.out.println("Veja nossos Lanches: " + "\n =================");
                System.out.println("lanche| " + c.getLanche() + "\n" + "descrição| " + c.getDescricaoL() + "\n"
                        + "preço do lanche| " + c.getPreçoL() + "\n" + "bebidas| " + c.getBebidas() + "\n" + "preços| " + c.getPreçoB());
            }
            return lista;
        } catch (Exception e) {
            System.out.println("erro ao exibir o cardapio: " + e.getMessage());
        }
        return null;
    }

    public List<cliente> getExibirC(cliente c) {
        try {
            List<cliente> lista = new ArrayList<>();

            for (int i = 0; i < 2; i++) {
                c.getNome();
                c.getTelefone();
                c.getEndereco();

                lista.add(c);

                System.out.println("==================== DADOS DO CLIENTE: ========================");
                System.out.println("nome: " + c.getNome() + "\n" + "tel: " + c.getTelefone() + "\n " + "endereço:" + c.getEndereco());
                System.out.println("================================================================");

                return lista;
            }
        } catch (Exception e) {
            System.out.println("erro ao exibir o cardapio: " + e.getMessage());
        }
        return null;
    }

    public List<pedidos> getExibirP(pedidos p) {
        try {
            List<pedidos> listaP = new ArrayList<>();

            for (int i = 0; i < 1; i++) {
                p.getQuantidade();
                p.getObservacoes();
                p.getValorTotal();
                p.getFormaPagamento();
                p.getLanche();
                p.getBebida();
                listaP.add(p);

                System.out.println("=============PEDIDO: ===========");
                System.out.println("Pedido: ");
                System.out.println("quantidade: " + p.getQuantidade() + "\n " + " valor total: " + p.getValorTotal() + "\n observação: " + p.getObservacoes() + "\n forma de pagamento: " + p.getFormaPagamento() + "\n lanche: " + p.getLanche() + "\n bebida: " + p.getBebida());
                System.out.println("=================================");

                return listaP;
            }
        } catch (Exception e) {
            System.out.println("erro ao exibir o cardapio: " + e.getMessage());
        }
        return null;
    }

    public List<pedidoEspecial> getExibirEsp() {
        try {
            List<pedidoEspecial> listaEP = new ArrayList<>();

            for (int i = 0; i < 2; i++) {

                pedidoEspecial p = new pedidoEspecial();

                p.getNome_Esp();
                p.getEnd_Esp();
                p.getLanche_Esp();
                p.getRecado();

                listaEP.add(p);
                System.out.println("================= PEDIDO ESPECIAL: ==================");

                return listaEP;
            }

        } catch (Exception e) {
            System.out.println("erro ao exibir o cardapio: " + e.getMessage());

        }
        return null;
    }
}
