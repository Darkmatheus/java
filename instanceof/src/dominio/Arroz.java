package dominio;

public class Arroz extends Produto{
    private double peso;

    public Arroz(String nome) {
        super(nome);
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
