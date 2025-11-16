import java.util.Scanner;

public class App6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Donner une chaine de caractere : ");
        String ch = sc.nextLine();
        String code = "";

        if (ch.length() <= 30) {
            System.out.println("Chaine correcte");
            // Encoder en decalant les lettres de 3 crans
            for (int i = 0; i < ch.length(); i++) {
                char c = ch.charAt(i);
                if (Character.isLetter(c)) {
                    char base = Character.isLowerCase(c) ? 'a' : 'A';
                    code += (char) ((c - base + 3) % 26 + base);
                } else {
                    code += c;
                }
            }
            System.out.println("Chaine codee : " + code);
        } else {
            System.out.println("Chaine incorrecte : longueur depasse 30 caracteres");
        }

        sc.close();
    }
}
