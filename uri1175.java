import java.util.Scanner;

public class uri1175 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int y = 19;
    int[] matX = new int[20];

    for (int i = 0; i < 20; i++) {
      matX[i] = sc.nextInt();
    }
    for (int i = 0; i < 20; i++) {
      System.out.printf("N[%d] = %d%n", i, matX[y]);
      y--;
    }

    sc.close();

  }

}
