import java.util.Scanner;

public class uri1180 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int num = sc.nextInt();
    int[] mat = new int[num];
    int menor = 0, posicao = 0;

    for (int i = 0; i < num; i++) {
      mat[i] = sc.nextInt();
    }

    for (int i = 0; i < num; i++) {

      if (i == 0) {
        menor = mat[i];
        posicao = i;
      } else if (mat[i] <= menor) {
        menor = mat[i];
        posicao = i;
      }
    }

    System.out.println("Menor valor: " + menor);
    System.out.println("Posicao: " + posicao);

    sc.close();

  }

}
