package service;

import dominio.Arroz;
import dominio.Produto;
import dominio.Tomate;

import java.util.ArrayList;
import java.util.List;

public class ProdutoService {

    public void processarProdutos(List<Produto> produtos){

        for (Produto p : produtos) {
            System.out.println("Produto: "+p.getNome());
            if (p instanceof Tomate tomate){
                //Tomate tomate = (Tomate) p; ( forma antiga )
                if (tomate.getDataValidade().equals("25/05/2300")){
                    System.out.println("Tomate com validade proxima");

                }
            }
            if (p instanceof Arroz arroz){
                //Arroz arroz = (Arroz) p; ( forma antiga )
                if (arroz.getPeso() > 10.0){
                    System.out.println("Desconto aplicado");

                }
            }
        }
    }

}
