import java.util.Scanner;
public class Exercice_6 {
        public static int FACT(int n){
            if (n == 0 || n == 1){
                return 1;
            } else {
                return n * FACT(n - 1);
            }
        }
        public static void main(String[]args){
            Scanner sc = new Scanner(System.in);
            System.out.println("donner un entier Positive : ");
            int n = sc.nextInt();
            int r = FACT(n);
            System.out.println("La factorielle de "+ n + "est "+ r);



        }
    }
