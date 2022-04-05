import java.util.Scanner;

public class uri1173 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int[] mat;
    mat = new int[10];

    int num = sc.nextInt();

    for (int i = 0; i < 10; i++) {
      mat[i] = num;
      num = num + num;
    }

    for (int i = 0; i < 10; i++) {
      System.out.printf("N[%d] = %d%n", i, mat[i]);
    }

    sc.close();

  }

}
