
package pacoteLanchonete;

public class pedidos {
    int quantidade;
    String observacoes, nome_recado, end_recado, recado, lancheEsp, formaPagamento, outro;
    double valorTotal;
    
    public pedidos(){
        
    }

    public pedidos(int quantidade, String observacoes, String nome_recado, String end_recado, String recado, String lancheEsp, String formaPagamento, String outro, double valorTotal) {
        this.quantidade = quantidade;
        this.observacoes = observacoes;
        this.nome_recado = nome_recado;
        this.end_recado = end_recado;
        this.recado = recado;
        this.lancheEsp = lancheEsp;
        this.formaPagamento = formaPagamento;
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

    public String getNome_recado() {
        return nome_recado;
    }

    public void setNome_recado(String nome_recado) {
        this.nome_recado = nome_recado;
    }

    public String getEnd_recado() {
        return end_recado;
    }

    public void setEnd_recado(String end_recado) {
        this.end_recado = end_recado;
    }

    public String getRecado() {
        return recado;
    }

    public void setRecado(String recado) {
        this.recado = recado;
    }

    public String getLancheEsp() {
        return lancheEsp;
    }

    public void setLancheEsp(String lancheEsp) {
        this.lancheEsp = lancheEsp;
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
