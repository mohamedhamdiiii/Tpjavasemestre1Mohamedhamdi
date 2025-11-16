import java.util.Scanner;

public class Rev2_Dc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        demanderTaille(sc);
        String phrase = saisirPhrase(sc);
        String phraseModifiee = modifierPhrase(phrase);
        System.out.println("Phrase modifiée : " + phraseModifiee);
        sc.close();
    }

    public static void demanderTaille(Scanner sc) {
        System.out.println("Choisissez la taille de la phrase :");
        System.out.println("1. Grande (taille > 70)");
        System.out.println("2. Petite (taille < 50)");
        int choix;
        do {
            System.out.print("Votre choix (1 ou 2) : ");
            choix = sc.nextInt();
        } while (choix != 1 && choix != 2);
    }

    public static String saisirPhrase(Scanner sc) {
        String phrase;
        do {
            System.out.print("Saisissez une phrase : ");
            sc.nextLine(); // Consommer la ligne restante
            phrase = sc.nextLine();
        } while (phrase.isBlank() || phrase.isEmpty() || phrase.indexOf(" ") == -1);
        return phrase;
    }

    public static String modifierPhrase(String phrase) {
        StringBuffer sb = new StringBuffer(phrase);
        // Mettre la première lettre en majuscule
        if (sb.length() > 0) {
            char firstChar = sb.charAt(0);
            sb.setCharAt(0, Character.toUpperCase(firstChar));
        }
        // Remplacer chaque espace par '@'
        int index = sb.indexOf(" ");
        while (index != -1) {
            sb.setCharAt(index, '@');
            index = sb.indexOf(" ", index + 1);
        }
        return sb.toString();
    }
}
