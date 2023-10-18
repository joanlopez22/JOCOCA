import java.util.Scanner;

public class jococa {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        // Aquest programa és un joc de l'oca molt senzill. Els passos que segueix són els següents:
        // Le he fet sense bucle for i esta mal optimitzat per la poca implementacio de metodes de programacio en Java
        // Pas 1: Demanar el nom dels 4 jugadors

        System.out.println("Benvingut al joc de l'oca!");
        System.out.println("Vols jugar? ");
        String resposta = x.nextLine();
        if (resposta.equals("no" )|| resposta.equals("No")|| resposta.equals("NO")) {
            System.out.println("Adéu!");
            System.exit(0);
        }else if (resposta.equals("si" )|| resposta.equals("Si")|| resposta.equals("SI")) {
            System.out.println("Comencem!");
        }else{
            System.out.println("No t'entenc");
            System.exit(0);
        }
        //DECLARACION CASILLAS
        int oca = 5;
        int puente = 6;
        int oca2 = 9;
        //Creo solo dos ocas ya que si no deberia de hacer un array
        int puente2 = 12;
        int fondo = 19;
        int dados = 26;
        int pozos = 31;
        int laberinto = 42;
        int carcel = 52;
        int muerte = 58;

        //Simulo el joc amb dos jugadors y creo variables pertinents
        String[] noms = new String[2];
        System.out.print("Introdueix el nom del jugador 1: ");
        noms[0] = x.nextLine();
        System.out.print(noms[0]);
        System.out.print("Introdueix el nom del jugador 2:  ");
        noms[1] = x.nextLine();
        int posicionjugador1 = 0;
        int posicionjugador2 = 0;
        System.out.print("Benvolguts" + noms[0] +" y "+ noms[1] + "\n");

        // Pas 2: Expliquem torn
        System.out.print("És el torn del jugador" + noms[0] +  "\n");

        // Pas 3: Llançar els daus i donar la suma
        System.out.print("Escriu tiro per tirar els daus");
        String tirar = x.nextLine();
        if (tirar.equals("tiro" )|| tirar.equals("Tiro")|| tirar.equals("TIRO")) {
            
            int dau1 = (int) (Math.random() * 6) + 1;
            int dau2 = (int) (Math.random() * 6) + 1;
            int posicion = dau1 + dau2;
            System.out.print("Has tret un " + dau1 + " i un " + dau2 + " per tant avances " + posicion + " caselles" + "\n");
            // Pas 4: Comprovar posicio
            posicionjugador1 += posicion;
            //OCA
            if (posicionjugador1 == oca || posicionjugador1 == oca2 ) {
                System.out.print("De oca en oca y tiro porque me toca" + "\n");
                if (posicionjugador1 == oca) {
                    posicionjugador1 = oca2;
                    System.out.print("Ahora estas en la poscion: " + posicionjugador1 + "\n");
                    } else {
                        posicionjugador1 = posicionjugador1 + posicion;
                        System.out.print("Ahora estàs a la casella " + posicionjugador1 + "\n");
                    }
            }
            //PONT
            if (posicionjugador1 == puente || posicionjugador1 == puente2) {
                System.out.print("De puente en puente porque me lleva la corriente" + "\n");
                if (posicionjugador1 == puente) {
                    posicionjugador1 = puente2;
                    System.out.print("Ahora estas en la poscion: " + posicionjugador1 + "\n");

                } else if (posicionjugador1 == puente) {
                    posicionjugador1 = puente2;
                    System.out.print("Ahora estas en la poscion: " + posicionjugador1 + "\n");
                    System.out.print("No podras tirar porque esto es una simulacion de un turno" + "\n");
                }
            }
            //FONDO
            if (posicionjugador1 == fondo) {
                System.out.print("Un turno sin jugar" + "\n");
                posicionjugador1 = posicionjugador1 + posicion;
                System.out.print("Ahora estas en la poscion: " + posicionjugador1 + "\n");
            }
            
            //DADOS
            if (posicionjugador1 == dados) {
                System.out.print("Tira los dados otra vez" + "\n");
                posicionjugador1 = posicionjugador1 + posicion;
                System.out.print("Ahora estas en la poscion: " + posicionjugador1 + "\n");
            }
            //POZOS
            if (posicionjugador1 == pozos) {
                System.out.print("Caiste en un pozo" + "\n");
                posicionjugador1 = posicionjugador1 - 6;
                System.out.print("Ahora estas en la poscion: " + posicionjugador1 + "\n");
            }
            //LABERINTO
            if (posicionjugador1 == laberinto) {
                System.out.print("Estas en el laberinto" + "\n");
                posicionjugador1 = posicionjugador1 - 11;
                System.out.print("Ahora estas en la poscion: " + posicionjugador1 + "\n");
            }
            //CARCEL
            if (posicionjugador1 == carcel) {
                System.out.print("Estas en la carcel" + "\n");
                posicionjugador1 = posicionjugador1 - 19;
                System.out.print("Ahora estas en la poscion: " + posicionjugador1 + "\n");
            }
            //MUERTE
            if (posicionjugador1 == muerte) {
                System.out.print("Estas muerto" + "\n");
                posicionjugador1 = 0;
                System.out.print("Ahora estas en la poscion: " + posicionjugador1 + "\n");
            }

        }
        else {
            System.out.print("No t'entenc" + "\n");
            System.exit(0);
        }

        //TORN JUGADOR 2        
        
        // Pas 2: Expliquem torn
        System.out.print("És el torn del jugador " + noms[1] +  "\n");

        // Pas 3: Llançar els daus i donar la suma
        System.out.print("Escriu tiro per tirar els daus");
        String tirar2 = x.nextLine();
        if (tirar2.equals("tiro" )|| tirar2.equals("Tiro")|| tirar2.equals("TIRO")) {
            
            int dau1 = (int) (Math.random() * 6) + 1;
            int dau2 = (int) (Math.random() * 6) + 1;
            int posicion = dau1 + dau2;
            System.out.print("Has tret un " + dau1 + " i un " + dau2 + " per tant avances " + posicion + " caselles" + "\n");
            // Pas 4: Comprovar posicio
            posicionjugador2 += posicion;
            //OCA
            if (posicionjugador2 == oca || posicionjugador2 == oca2 ) {
                System.out.print("De oca en oca y tiro porque me toca" + "\n");
                if (posicionjugador2 == oca) {
                    posicionjugador2 = oca2;
                    System.out.print("Ahora estas en la poscion: " + posicionjugador2 + "\n");
                    } else {
                        posicionjugador2 = posicionjugador2 + posicion;
                        System.out.print("Ahora estàs a la casella " + posicionjugador2 + "\n");
                    }
            }
            //PONT
            if (posicionjugador2 == puente || posicionjugador2 == puente2) {
                System.out.print("De puente en puente porque me lleva la corriente" + "\n");
                if (posicionjugador2 == puente) {
                    posicionjugador2 = puente2;
                    System.out.print("Ahora estas en la poscion: " + posicionjugador2 + "\n");

                } else if (posicionjugador2 == puente) {
                    posicionjugador2 = puente2;
                    System.out.print("Ahora estas en la poscion: " + posicionjugador2 + "\n");
                    System.out.print("No podras tirar porque esto es una simulacion de un turno" + "\n");
                }
            }
            //FONDO
            if (posicionjugador2 == fondo) {
                System.out.print("Un turno sin jugar" + "\n");
                posicionjugador2 = posicionjugador2 + posicion;
                System.out.print("Ahora estas en la poscion: " + posicionjugador2 + "\n");
            }
            
            //DADOS
            if (posicionjugador2 == dados) {
                System.out.print("Tira los dados otra vez" + "\n");
                posicionjugador2 = posicionjugador2 + posicion;
                System.out.print("Ahora estas en la poscion: " + posicionjugador2 + "\n");
            }
            //POZOS
            if (posicionjugador2 == pozos) {
                System.out.print("Caiste en un pozo" + "\n");
                posicionjugador2 = posicionjugador2 - 6;
                System.out.print("Ahora estas en la poscion: " + posicionjugador2 + "\n");
            }
            //LABERINTO
            if (posicionjugador2 == laberinto) {
                System.out.print("Estas en el laberinto" + "\n");
                posicionjugador2 = posicionjugador2 - 11;
                System.out.print("Ahora estas en la poscion: " + posicionjugador2 + "\n");
            }
            //CARCEL
            if (posicionjugador2 == carcel) {
                System.out.print("Estas en la carcel" + "\n");
                posicionjugador2 = posicionjugador2 - 19;
                System.out.print("Ahora estas en la poscion: " + posicionjugador2 + "\n");
            }
            //MUERTE
            if (posicionjugador2 == muerte) {
                System.out.print("Estas muerto" + "\n");
                posicionjugador2 = 0;
                System.out.print("Ahora estas en la poscion: " + posicionjugador2 + "\n");
            }

        }
        else {
            System.out.print("No t'entenc" + "\n");
            System.exit(0);
        }
    }
}
