import java.util.Scanner;

public class uri1070 {
  public static void main(String[] args) {

    var sc = new Scanner(System.in);

    int numero = sc.nextInt();
    int i;

    for (i = 0; i < 6; i++) {
      if (numero % 2 != 0) {
        System.out.printf("%d%n", numero);
        numero = numero + 1;
      } else {
        numero = numero + 1;
        i = i - 1;
      }
    }

    sc.close();

  }

}
