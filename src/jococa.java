import java.util.Scanner;

public class jococa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Aquest programa és un joc de l'oca molt senzill. Els passos que segueix són els següents:
        // Le he fet sense bucle for i esta mal optimitzat per la poca implementacio de metodes de programacio en Java
        // Pas 1: Demanar el nom dels 4 jugadors
        String[] noms = new String[4];

        System.out.print("Introdueix el nom del jugador 1: ");
        noms[0] = scanner.nextLine();

        System.out.print("Introdueix el nom del jugador 2: ");
        noms[1] = scanner.nextLine();

        System.out.print("Introdueix el nom del jugador 3: ");
        noms[2] = scanner.nextLine();

        System.out.print("Introdueix el nom del jugador 4: ");
        noms[3] = scanner.nextLine();

        // Pas 2: Demanar l'entrada del torn
        System.out.print("És el torn del jugador (introdueix el seu nom): ");
        String jugadorEnTorn = scanner.nextLine();

        // Pas 3: Llançar els daus i donar la suma
        int dau1 = (int) (Math.random() * 6) + 1;
        int dau2 = (int) (Math.random() * 6) + 1;
        int sumaDaus = dau1 + dau2;
        System.out.println("El jugador " + jugadorEnTorn + " ha llançat els daus i ha obtingut " + dau1 + " i " + dau2 + ". La suma és " + sumaDaus + ".");

        // Pas 4: Mostrar el missatge de casella
        System.out.println("El jugador " + jugadorEnTorn + " es troba a la casella 1. Avança " + sumaDaus + " caselles.");
        
        // Això seria el final d'un torn. Si desitges continuar el joc, simplement repeteix aquests passos per a cada torn addicional.
    }
}
