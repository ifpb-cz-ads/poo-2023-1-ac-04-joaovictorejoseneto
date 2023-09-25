public class Lampada {
    private float preco;
    private int potencia;
    private String cor;
    private String marca;

    public Lampada(float preco, int potencia, String cor, String marca) {
        this.preco = preco;
        this.potencia = potencia;
        this.cor = cor;
        this.marca = marca;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
