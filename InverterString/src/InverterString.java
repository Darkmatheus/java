import java.util.Scanner;

public class InverterString {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String palavra = scanner.nextLine();
        String  invertida = "";


        for (int i = palavra.length() - 1; i >= 0; i--) {
            invertida += palavra.charAt(i);
        }
            // += não recomendado para strings
        System.out.println("Palavra invertida utilizando for:"+ invertida);

//          EXPLICANDO O FOR
//       String palavra = "Café";
//        System.out.println(palavra.length()); resultado: 4.
//
//        c = índice 0
//        a = índice 1
//        f = índice 2
//        é = índice 3  ← último índice = length - 1

        System.out.println("Inversao utilizando string builder");
        String inversaoBuilder = new StringBuilder(palavra).reverse().toString();
        System.out.println(inversaoBuilder);

        scanner.close();
    }
}
