import java.util.Scanner;
public class App3 {
    public static void main(String[] args) throws Exception {
       Scanner sc = new Scanner(System.in);
       int jour ; int moin; int an;
       System.out.println("Saisie le jour: ");
       jour = sc.nextInt();
       while (jour <1 || jour>31){
       jour = sc.nextInt();
       System.out.println("Saisie un jour valide: ");
    }
    System.out.println("Saisie le moin: ");
    moin =sc.nextInt();
    while (moin <1 || moin>12){
        moin = sc.nextInt();
        System.out.println("Saisie un moin valide: ");
    }
    System.out.println("Saisie l'annee: ");
    an= sc.nextInt();
    switch (moin){
        case 1: case 3: 
        case 5: case 7: 
        case 8: case 12:
        jour =31;
        break;
        case 4: case 6:
        case 9: case 11:
        jour=30;
        break;
        case 2 :
        if ((an%4==0 && an%100!=0) || (an%400==0)){ 
            jour=29;}
        else{ 
            jour=28;
        }
        break;
                
            }
            System.out.println("Date: "+jour+"/"+moin+"/"+an);
            
        }
} 

    

