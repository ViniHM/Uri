import java.util.Scanner;

public class uri1174 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    float[] mat;
    mat = new float[100];

    for (int i = 0; i < 100; i++) {
      mat[i] = sc.nextFloat();
    }

    for (int i = 0; i < 100; i++) {
      if (mat[i] <= 10) {
        System.out.printf("A[%d] = %.1f%n", i, mat[i]);
      }
    }
    sc.close();

  }

}
