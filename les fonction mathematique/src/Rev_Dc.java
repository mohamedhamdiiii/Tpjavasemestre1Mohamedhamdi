public class Rev_Dc {
    public static void main(String[]args){
        String R1="bon courage";
        String R2="bon courage";
        StringBuffer R3=new StringBuffer(R1);
        StringBuffer R4=new StringBuffer(R2);
        R4 =R3;
        System.out.println("R1 contient " +R1);
        System.out.println("R1 = R2 ?" + (R1.equals(R2)));
        System.out.println("R3 = R4 ?" + (R3.equals(R4)));
        R1 = R1.replace('b', 'B');
        System.out.println("R1 devient : " + R1);
        System.out.println("R2 contient : " + R2);
        System.out.println("R3 contient : " + R3);
        System.out.println("R4 contient : " + R4);
        R3.setCharAt(0, 'B');
        R3.setCharAt(4, 'C');
        System.out.println("R3 devient : " + R3);
        System.out.println("R4 contient : " + R4);
        System.out.print("les deux chaines R1 et R2 pointent sur le meme objet? ");
        System.out.println(R1 == R2);
        System.out.print("les deux chaines R3 et R4 pointent sur le meme objet? ");
        System.out.println(R3 == R4);
        System.out.println("R1 = R2 ? " + (R1.equals(R2)));
        System.out.println("R3 = R4 ?" + (R3.equals(R4)));
        System.out.println("R2 = R4 ?" + (R2.equals(R4.toString())));
 }
 }
    

