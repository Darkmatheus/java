package test;

import dominio.Arroz;
import dominio.Produto;
import dominio.Tomate;
import service.ProdutoService;

import java.util.ArrayList;

public class ProdutoTest1 {
    public static void main(String[] args) {

        ArrayList<Produto> list = new ArrayList<>();


        Tomate tomate1 = new Tomate("Tomate americano");
        tomate1.setDataValidade("25/05/2300");

        Arroz arroz1 = new Arroz("Arroz branco");
        arroz1.setPeso(15.0);

        Produto outro = new Produto("Detergente");

        list.add(arroz1);
        list.add(tomate1);
        list.add(outro);

        ProdutoService produtoService = new ProdutoService();
        produtoService.processarProdutos(list);

    }
}
