import java.util.Scanner;
public class Exercice_3 {
// Méthode principale
public static void main(String[] args) {
int n = lectureN();
int somme = calculeSomme(n);
System.out.println("La somme des " + n + " premiers carrés est : " +
somme);
}
// Méthode pour lire un entier strictement positif
public static int lectureN() {
Scanner sc = new Scanner(System.in);
int n;
do {
System.out.print("Donner un entier strictement positif : ");
n = sc.nextInt();
} while (n <= 0);
return n;
}
// Méthode pour calculer la somme des n premiers carrés
public static int calculeSomme(int n) {
int somme = 0;
for (int i = 1; i <= n; i++) {
somme += i * i;
}
return somme;
}
}