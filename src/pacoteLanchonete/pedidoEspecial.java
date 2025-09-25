
package pacoteLanchonete;

public class pedidoEspecial {
    String nome_Esp, end_Esp, lanche_Esp, recado;
    
    public pedidoEspecial(){
        
    }

    public pedidoEspecial(String nome_Esp, String end_Esp, String lanche_Esp, String recado) {
        this.nome_Esp = nome_Esp;
        this.end_Esp = end_Esp;
        this.lanche_Esp = lanche_Esp;
        this.recado = recado;
    }

    public String getNome_Esp() {
        return nome_Esp;
    }

    public void setNome_Esp(String nome_Esp) {
        this.nome_Esp = nome_Esp;
    }

    public String getEnd_Esp() {
        return end_Esp;
    }

    public void setEnd_Esp(String end_Esp) {
        this.end_Esp = end_Esp;
    }

    public String getLanche_Esp() {
        return lanche_Esp;
    }

    public void setLanche_Esp(String lanche_Esp) {
        this.lanche_Esp = lanche_Esp;
    }

    public String getRecado() {
        return recado;
    }

    public void setRecado(String recado) {
        this.recado = recado;
    }
    
    
}
