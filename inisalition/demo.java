import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b;
        a=7;
        b=18;
        System.out.println("a=" +a+" b=" +b);
        a+=b;
         System.out.println("a=" +a+" b=" +b);
        b-=8;
         System.out.println("a=" +a+" b=" +b);
        a*=2;
         System.out.println("a=" +a+" b=" +b);
        a/=b;
        System.out.println("a=" +a+" b=" +b);
        a%=2;
        sc.close();
        

    }
}
