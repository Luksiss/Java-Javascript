import java.util.Scanner; // Import necessário para utilizar a classe Scanner
 import java.util.Random;  // Import necessário para utilizar a classe Random

public class AdivRandom {
 public static void main (String [] args) {

  Scanner entrada= new Scanner(System.in);

  Random rand = new Random();
  int palpite, num = 0;
  num = rand.nextInt(10) + 1;
  System.out.println("Digite seu palpite:");
  palpite = entrada.nextInt();
  if(palpite == num) {
   System.out.println("Você acertou! o número era " + num);
  }
  else {
   if(palpite < num) {
    System.out.println("Seu palpite está  abaixo! o número era " + num);
   } else {
    System.out.println("Seu palpite está a cima. O número era " + num);
   }
  }
  entrada.close();
 }
}