package domain;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private List<Produto> itens = new ArrayList<>();

    public void adicionarProduto(Produto p){
        itens.add(p);
        System.out.println(p.getTipoProduto()+" adicionado ao pedido.");
    }

    public double calcularTotal(){
        double total = 0;
        for (Produto p : itens) {
            total += p.getPreco();
        }
        return total;
    }

    public List<Produto> getItens() {
        return itens;
    }

    public void setItens(List<Produto> itens) {
        this.itens = itens;
    }
}
