import java.util.Scanner;

public class uri1164 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int teste = sc.nextInt();
    int numero;

    for (int t = 1; t <= teste; t++) {
      numero = sc.nextInt();
      int somaDivi = 0;

      for (int i = 1; i < numero; i++) {

        if (numero % i == 0) {

          somaDivi = somaDivi + i;
        }
      }

      if (somaDivi == numero) {
        System.out.println(numero + " eh perfeito");
      } else {
        System.out.println(numero + " nao eh perfeito");
      }
    }

    sc.close();

  }

}
