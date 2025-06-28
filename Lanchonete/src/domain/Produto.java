package domain;

public class Produto {
    private Categoria categoria;
    private Object tipoProduto;
    private double preco;
    private int codigo;

    public Produto(Categoria categoria, double preco, int codigo,Object tipoProduto) {
        this.categoria = categoria;
        this.preco = preco;
        this.codigo = codigo;
        this.tipoProduto = tipoProduto;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "categoria=" + categoria +
                ", tipoProduto=" + tipoProduto +
                ", preco=" + preco +
                ", codigo=" + codigo +
                '}';
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Object getTipoProduto() {
        return tipoProduto;
    }

    public void setTipoProduto(Object tipoProduto) {
        this.tipoProduto = tipoProduto;
    }
}
