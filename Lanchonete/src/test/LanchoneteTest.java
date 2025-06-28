package test;

import domain.*;

import java.util.Scanner;

public class LanchoneteTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pedido pedido = new Pedido();

        Produto coca = new Produto(Categoria.BEBIDA, 5.0, 1, TipoBebida.COCA_COLA);
        Produto agua = new Produto(Categoria.BEBIDA, 3.5, 2, TipoBebida.AGUA);
        Produto suco = new Produto(Categoria.BEBIDA, 6.0, 3, TipoBebida.SUCO_NATURAL);

        Produto pizza = new Produto(Categoria.LANCHE, 20.0, 5, TipoLanche.PIZZA);
        Produto hamburguer = new Produto(Categoria.LANCHE, 16.0, 6, TipoLanche.HAMBURGUER);
        Produto churrasco = new Produto(Categoria.LANCHE, 30.0, 7, TipoLanche.CHURRASCO);

        Produto bolo = new Produto(Categoria.SOBREMESA, 7.0, 9, TipoSobremesa.BOLO);
        Produto sorvete = new Produto(Categoria.SOBREMESA, 5.5, 10, TipoSobremesa.SORVETE);
        Produto milkshake = new Produto(Categoria.SOBREMESA, 8.0, 11, TipoSobremesa.MILKSHAKE);


        System.out.println("--- BEM - VINDO À NOSSA LANCHONETE! ---");
        System.out.println("--- FAÇA SEU PEDIDO DE ACORDO COM O CÓDIGO DOS PRODUTOS. ---");
        System.out.println("--- 1°, ESCOLHA SEU LANCHE:");
        System.out.println("--- PIZZA   CÓD: 5");
        System.out.println("--- HAMBURGUER   CÓD: 6");
        System.out.println("--- CHURRASCO   CÓD: 7");

        int lancheEscolhido;
        while(true){
            lancheEscolhido = scanner.nextInt();
            switch (lancheEscolhido) {
            case 5:
                pedido.adicionarProduto(pizza);
                break;
            case 6:
                pedido.adicionarProduto(hamburguer);
                break;
            case 7:
                pedido.adicionarProduto(churrasco);
                break;
            default:
                System.out.println("--- CODIGO ERRADO, INSIRA NOVAMENTE. ---");
                continue;
        }
        break;
        }
        System.out.println("--- 2°, ESCOLHA SUA BEBIDA: ---");
        System.out.println("--- COCA-COLA   CÓD: 1");
        System.out.println("--- ÁGUA   CÓD: 2");
        System.out.println("--- SUCO   CÓD: 3");
        int bebidaEscolhida;
        while(true){
            bebidaEscolhida = scanner.nextInt();
            switch (bebidaEscolhida) {
            case 1:
                pedido.adicionarProduto(coca);
                break;
            case 2:
                pedido.adicionarProduto(agua);
                break;
            case 3:
                pedido.adicionarProduto(suco);
                break;
            default:
                System.out.println("--- CODIGO ERRADO, INSIRA NOVAMENTE. ---");

                continue;
        }
        break;
        }
        System.out.println("--- 3°, ESCOLHA SUA SOBREMESA: ---");
        System.out.println("--- BOLO   CÓD: 9");
        System.out.println("--- SORVETE   CÓD: 10");
        System.out.println("--- MILK-SHAKE   CÓD: 11");
        int sobremesaEscolhida;
        while(true){
            sobremesaEscolhida = scanner.nextInt();
        switch (sobremesaEscolhida) {
            case 9:
                pedido.adicionarProduto(bolo);
                break;
            case 10:
                pedido.adicionarProduto(sorvete);
                break;
            case 11:
                pedido.adicionarProduto(milkshake);
                break;
            default:
                System.out.println("--- CODIGO ERRADO, INSIRA NOVAMENTE. ---");

                continue;
        }
        break;
        }

        System.out.println("--- RELATÓRIO DE PEDIDO: ---");
        for (Produto p : pedido.getItens()) {
            System.out.println(p.getTipoProduto());
        }
        
        System.out.println("--- SUA CONTA DEU NO TOTAL DE:  ---");
        System.out.println(pedido.calcularTotal());

    }
}