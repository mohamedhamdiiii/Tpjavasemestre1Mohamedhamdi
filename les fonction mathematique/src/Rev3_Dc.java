import java.util.Scanner;

public class Rev3_Dc {

    public static String SaisrnomPrenom(Scanner sc) {
        String nomPrenom;
        do {
            System.out.print("Entre le nom et prenom séparé par '_' : ");
            nomPrenom = sc.nextLine().trim();
            if (!nomPrenom.contains("_") || nomPrenom.isBlank()) {
                System.err.println("vous devez séparé le nom et le prenom avec '_'");
            }
        } while (!nomPrenom.contains("_") || nomPrenom.isBlank());
        return nomPrenom;
    }

    public static String saisrDate(Scanner sc) {
        String jour, moin, annee;
        do {
            System.out.print("Entre le jour 2 chiffre : ");
            jour = sc.nextLine().trim();
            if (jour.length() != 2) System.err.println("Le jour doit être sur 2 chiffres (ex: 01)");
        } while (jour.length() != 2);

        do {
            System.out.print("Entre le mois 2 chiffre : ");
            moin = sc.nextLine().trim();
            if (moin.length() != 2) System.err.println("Le mois doit être sur 2 chiffres (ex: 01)");
        } while (moin.length() != 2);

        do {
            System.out.print("Entre l'annee 4 chiffre : ");
            annee = sc.nextLine().trim();
            if (annee.length() != 4) System.err.println("L'année doit être sur 4 chiffres (ex: 2000)");
        } while (annee.length() != 4);

        return jour + moin + annee;
    }

    public static String genereNumeroCompte(String nomPrenom, String dateNaiss) {
        return "000" + nomPrenom + dateNaiss;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("== Saise les cordonner client ==");
        String nomPrenom = SaisrnomPrenom(sc);
        String dateNaiss = saisrDate(sc);
        String numeroCompt = genereNumeroCompte(nomPrenom, dateNaiss);
        System.out.println("Numéro de compte genere " + numeroCompt);
        sc.close();
    }

}

