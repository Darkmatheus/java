package domain;

public class MaiorSomaSubarray {
    public static int encontrarMaiorSoma(int[] arr) {


        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("O array nao pode ser vazio");
        }

        int maiorSoma = arr[0];
        int somaAtual = arr[0];

        for (int i = 1; i < arr.length; i++) {
            somaAtual = Math.max(arr[i], somaAtual + arr[i]);
            maiorSoma = Math.max(maiorSoma, somaAtual);
        }
        return maiorSoma;
    }
}