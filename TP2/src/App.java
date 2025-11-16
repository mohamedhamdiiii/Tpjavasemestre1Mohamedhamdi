import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
       Scanner sc = new Scanner(System.in);
       int n ; int i;
       do{
        System.out.println("Saisie un nombre: ");
        n = sc.nextInt();
       }while(n<1 || n>10);
       System.out.println("Table de multiplication de "+n);
       for(i=1;i<=10;i++){
        System.out.println(n+" * "+i+" = "+(n*i));
       }
    sc.close();
    }
    
}
