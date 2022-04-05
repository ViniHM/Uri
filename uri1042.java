import java.util.Scanner;

public class uri1042 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int maior = 0, menor = 0, meio = 0;
    int x = sc.nextInt();
    int y = sc.nextInt();
    int z = sc.nextInt();

    if (x > y && x > z && y > z) {
      maior = x;
      menor = z;
      meio = y;

    } else if (x > y && x > z && z > y) {
      maior = x;
      menor = y;
      meio = z;

    } else if (y > x && y > z && z > x) {
      maior = y;
      menor = x;
      meio = z;

    } else if (y > x && y > z && x > z) {
      maior = y;
      menor = z;
      meio = x;

    } else if (z > x && z > y && y > x) {
      maior = z;
      menor = x;
      meio = y;

    } else if (z > x && z > y && x > y) {
      maior = z;
      menor = y;
      meio = x;
    }

    System.out.printf("%d%n%d%n%d%n", menor, meio, maior);
    System.out.println();
    System.out.printf("%d%n%d%n%d%n", x, y, z);

    sc.close();
  }
}
