import java.util.Scanner;
public class App2 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int x ;
        System.out.println("Saisie un nombre: ");
        x = sc.nextInt();
        while(x<1){
            System.out.println("Saisie un nombre positif: ");
            x = sc.nextInt();
        }
        int f=1;
        for(int i=1;i<=x;i++){
            f=f*i;
        }
        sc.close();
        System.out.println("Factorielle de "+x+" est: "+f);

         
     }
    
}
