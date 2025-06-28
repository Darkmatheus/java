package dominio;

public class Tomate extends Produto{
    private String dataValidade;

    public Tomate(String nome) {
        super(nome);
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }
}
