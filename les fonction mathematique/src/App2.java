import java.util.Scanner;

public class App2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = lectureN(sc);
        int nb = compter(n);
        System.out.println("Le nombre de chiffres de " + n + " est: " + nb);
    }

    public static int lectureN(Scanner sc) {
        int value;
        do {
            System.out.print("donner votre entier positif: ");
            value = sc.nextInt();
        } while (value < 0);
        return value;
    }

    public static int compter(int x) {
        if (x == 0) {
            return 1;
        }
        int count = 0;
        while (x != 0) {
            x /= 10;
            count++;
        }
        return count;
    }
}
