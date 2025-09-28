package pacoteLanchonete;

public class pedidos {

    int quantidade;
    String observacoes, formaPagamento, lanche, bebida;
    double valorTotal;
    private pedidoEspecial objPedidoEspecial;
    private cliente objCliente;

    public pedidos() {

    }

    public pedidos(int quantidade, String observacoes, String formaPagamento, double valorTotal, String lanche, String bebida) {
        this.quantidade = quantidade;
        this.observacoes = observacoes;
        this.valorTotal = valorTotal;
        this.bebida = bebida;
        this.lanche = lanche;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public String getLanche() {
        return lanche;
    }

    public void setLanche(String lanche) {
        this.lanche = lanche;
    }

    public String getBebida() {
        return bebida;
    }

    public void setBebida(String bebida) {
        this.bebida = bebida;
    }

    public void calcular(double valor) {
        this.valorTotal = this.quantidade * valor;
        
        System.out.println("VALOR TOTAL: "+ this.valorTotal);
    }
   
}
