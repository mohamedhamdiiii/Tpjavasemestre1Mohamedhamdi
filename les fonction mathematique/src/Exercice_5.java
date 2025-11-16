import java.util.Scanner;
public class Exercice_5 {
    public static float Puiss(int x, int n) {
        if (n == 0) {
            return 1;
        } else {
            return x * Puiss(x, n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Donner la base (entier positif) : ");
        int x = sc.nextInt();
        System.out.println("Donner l'exposant (entier positif) : ");
        int n = sc.nextInt();
        float r = Puiss(x, n);
        System.out.println("La puissance de " + x + " à la puissance " + n + " est " + r);
    }
}
