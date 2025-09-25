package pacoteLanchonete;

public class cardapio {

    private String lanche, descricaoL, bebidas, decricaoB;
    private double preçoL, preçoB;

    public cardapio(String lanche, String descricaoL, String bebidas, String decricaoB, double preçoL, double preçoB) {
        this.lanche = lanche;
        this.descricaoL = descricaoL;
        this.bebidas = bebidas;
        this.decricaoB = decricaoB;
        this.preçoL = preçoL;
        this.preçoB = preçoB;
    }

    public cardapio() {

    }

    public String getLanche() {
        return lanche;
    }

    public void setLanche(String lanche) {
        this.lanche = lanche;
    }

    public String getDescricaoL() {
        return descricaoL;
    }

    public void setDescricaoL(String descricaoL) {
        this.descricaoL = descricaoL;
    }

    public String getBebidas() {
        return bebidas;
    }

    public void setBebidas(String bebidas) {
        this.bebidas = bebidas;
    }

    public String getDecricaoB() {
        return decricaoB;
    }

    public void setDecricaoB(String decricaoB) {
        this.decricaoB = decricaoB;
    }

    public double getPreçoL() {
        return preçoL;
    }

    public void setPreçoL(double preçoL) {
        this.preçoL = preçoL;
    }

    public double getPreçoB() {
        return preçoB;
    }

    public void setPreçoB(double preçoB) {
        this.preçoB = preçoB;
    }
}