import java.util.Scanner;

public class Imparpar {
    public static void main (String [] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        System.out.println ("Digtte um número inteiro: ");
        numero = entrada.nextInt();

        if ((numero % 2) == 0) {
            System.out.println ("O número " + numero + " é par");
        }
        else {
            System.out.println("O número " + numero + " é impar");
        }
        entrada.close();
    }
}
