import java.util.Scanner;

public class uri1094 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int totalExp = sc.nextInt();
    int cobaias, totalCobai = 0, totalRato = 0, totalCoelho = 0, totalSapo = 0;
    float perceCoelho = 0, perceRato = 0, perceSapo = 0;
    String inciAnim;

    for (int i = 1; i <= totalExp; i++) {

      cobaias = sc.nextInt();
      inciAnim = sc.next();
      totalCobai = totalCobai + cobaias;

      if (inciAnim.equals("C")) {
        totalCoelho = totalCoelho + cobaias;

      } else if (inciAnim.equals("R")) {
        totalRato = totalRato + cobaias;

      } else if (inciAnim.equals("S")) {
        totalSapo = totalSapo + cobaias;
      }

    }

    perceCoelho = (float) ((100.0 * totalCoelho) / totalCobai);
    perceRato = (float) ((100.0 * totalRato) / totalCobai);
    perceSapo = (float) ((100.0 * totalSapo) / totalCobai);

    System.out.printf("Total: %d cobaias%n", totalCobai);
    System.out.printf("Total de coelhos: %d%n", totalCoelho);
    System.out.printf("Total de ratos: %d%n", totalRato);
    System.out.printf("Total de sapos: %d%n", totalSapo);
    System.out.printf("Percentual de coelhos: %.2f %%%n", perceCoelho);
    System.out.printf("Percentual de ratos: %.2f %%%n", perceRato);
    System.out.printf("Percentual de sapos: %.2f %%%n", perceSapo);

    sc.close();

  }

}
