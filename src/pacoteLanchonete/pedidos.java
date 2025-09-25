
package pacoteLanchonete;

public class pedidos {
    int quantidade;
    String observacoes, formaPagamento, outro;
    double valorTotal;
    private pedidoEspecial objPedidoEspecial;
    private cliente objCliente;
    
    public pedidos(){
        
    }

    public pedidos(int quantidade, String observacoes, String formaPagamento, String outro, double valorTotal) {
        this.quantidade = quantidade;
        this.observacoes = observacoes;
        this.outro = outro;
        this.valorTotal = valorTotal;
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

    public String getOutro() {
        return outro;
    }

    public void setOutro(String outro) {
        this.outro = outro;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
    
    
}
