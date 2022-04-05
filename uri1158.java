import java.util.Scanner;

public class uri1158 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int inicio, seqImpar, soma;

    int teste = sc.nextInt();

    for (int i = 0; i < teste; i++) {

      inicio = sc.nextInt();
      seqImpar = sc.nextInt();
      soma = 0;

      for (int w = 1; w <= seqImpar; w++) {

        if (inicio % 2 != 0) {
          soma = soma + inicio;
          inicio++;
        } else {
          inicio++;
          w--;
        }

      }
      System.out.println(soma);

    }

    sc.close();

  }

}
