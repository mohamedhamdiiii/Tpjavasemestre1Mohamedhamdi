import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] n = new int[10];
        for (int i = 0; i < 10; i++) {
            n[i] = lectureN(sc);
        }
        System.out.println("les entiers pairs sont:");
        for (int nb : n) {
            if (EstPaire(nb)) {
                System.out.println(nb);
            }
        }
    }

    public static int lectureN(Scanner sc) {
        int value;
        do {
            System.out.print("donner votre entier positif: ");
            value = sc.nextInt();
        } while (value <= 0);
        return value;
    }

    public static boolean EstPaire(int x) {
        return x % 2 == 0;
    }
}
