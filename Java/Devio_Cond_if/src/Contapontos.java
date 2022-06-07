import java.util.Scanner; // Import necessário para utilizar a classe

public class Contapontos {
    public static void main (String [] args) {
        Scanner entrada = new Scanner(System.in);
        int pontos = 0;
        System.out.println ("Digite o número de pontos do jogador: ");
        pontos = entrada.nextInt();

        if (pontos >= 1000) {
            System.out.println ("Você passou para a fase 2!");
        }

        System.out.println("proxima instrução");
        entrada.close();
    }
}
