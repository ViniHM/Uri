import java.util.Scanner;

public class uri1172 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int[] mat;
    mat = new int[10];

    for (int i = 0; i < 10; i++) {
      mat[i] = sc.nextInt();

      if (mat[i] <= 0) {
        mat[i] = 1;
      }
    }

    for (int i = 0; i < 10; i++) {
      System.out.printf("X[%d] = %d%n", i, mat[i]);
    }

    sc.close();
  }

}
