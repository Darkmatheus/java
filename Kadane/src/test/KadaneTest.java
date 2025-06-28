package test;

import static domain.MaiorSomaSubarray.encontrarMaiorSoma;

public class KadaneTest {
    public static void main(String[] args) {

        int[] arr1 = {1, -2, 3, 4, -5}; // 7
        int[] arr2 = {-3, -1, -5}; // - 1
        int[] arr3 = {-2, -1, 3, 4, -1, 2, 1, -5, 4}; // 8
        // Começa com -2
        // → -2 + (-1) = -3, melhor começar do -1
        // → -1 + 3 = 2, melhor começar do 3 → 3
        // → 3 + 4 = 7
        // → 7 + (-1) = 6 (segue)
        // → 6 + 2 = 8
        // → 8 + 1 = 9 (maior até aqui)
        // → 9 + (-5) = 4 (segue mas não melhora)
        // → 4 + 4 = 8 (não supera 9)

        System.out.println("Maior soma do subarray 1: " + encontrarMaiorSoma(arr1));
        System.out.println("Maior soma do subarray 2: " + encontrarMaiorSoma(arr2));
        System.out.println("Maior soma do subarray 3: " + encontrarMaiorSoma(arr3));

    }
}
