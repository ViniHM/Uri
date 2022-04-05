import java.util.Scanner;

public class uri1177 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int[] mat;
    mat = new int[1000];

    int numOfic = sc.nextInt();
    int num = 0;

    for (int i = 0; i < 1000; i++) {

      mat[i] = num;
      num++;

      if (num >= numOfic) {
        num = 0;
      }
    }

    for (int x = 0; x < 1000; x++) {
      System.out.printf("N[%d] = %d%n", x, mat[x]);
    }

    sc.close();

  }

}
