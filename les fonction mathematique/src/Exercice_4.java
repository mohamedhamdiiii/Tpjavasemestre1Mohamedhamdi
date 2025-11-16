public class Exercice_4 {
    public static void main(String[]args){
        System.out.println("Les un Nombre ArmStrong est < a 1000");
        for (int i=0;i< 1000 ; i++){
            if (isArmStrong(i)){
                System.out.println(i);
            }
        }
    }
    public static boolean isArmStrong(int n){
        int original =n;
        int sum=0;
        while (n !=0){
            int num= n %10;
            sum += Math.pow(num,3);
            n /=10;
        }
        return sum == original;
    }
}
