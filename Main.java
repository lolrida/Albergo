import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        try {
            System.out.print("Inserisci il numero di piani dell'albergo: ");
            int numFloors = Integer.parseInt(scanner.nextLine());

            System.out.print("Inserisci il numero di stanze per piano: ");
            int roomsPerFloor = Integer.parseInt(scanner.nextLine());

            if (numFloors <= 0 || roomsPerFloor <= 0) {
                throw new IllegalArgumentException("I numeri devono essere positivi.");
            }

            Albergo albergo = new Albergo(numFloors, roomsPerFloor);
            int scelta;

            do {
                System.out.println("\nMenu:");
                System.out.println("1. Mostra tutte le stanze");
                System.out.println("2. Prenota una stanza Standard ");
                System.out.println("3. Prenota una stanza Luxury ");
                System.out.println("4. Libera una stanza (inserisci numero stanza)");
                System.out.println("0. Esci");
                System.out.print("Scelta: ");
                scelta = Integer.parseInt(scanner.nextLine());

                switch (scelta) {
                    case 1:
                        albergo.mostraAlbergo();
                        break;
                    case 2:
                        int standardRoom = albergo.prenotaStanza("Standard");
                        if (standardRoom != -1) {
                            System.out.println("Prenotata stanza Standard " + standardRoom);
                        } else {
                            System.out.println("Nessuna stanza Standard disponibile.");
                        }
                        break;
                    case 3:
                        int luxuryRoom = albergo.prenotaStanza("Luxury");
                        if (luxuryRoom != -1) {
                            System.out.println("Prenotata stanza Luxury " + luxuryRoom);
                        } else {
                            System.out.println("Nessuna stanza Luxury disponibile.");
                        }
                        break;
                    case 4:
                        System.out.print("Inserisci il numero della stanza da liberare: ");
                        int numeroStanzaDaLiberare = Integer.parseInt(scanner.nextLine());
                        boolean liberata = albergo.liberaStanza(numeroStanzaDaLiberare);
                        if (liberata) {
                            System.out.println("Stanza " + numeroStanzaDaLiberare + " liberata con successo.");
                        } else {
                            System.out.println("Stanza " + numeroStanzaDaLiberare + " non trovata o già libera.");
                        }
                        break;
                    case 0:
                        System.out.println("Arrivederci!");
                        break;
                    default:
                        System.out.println("Scelta non valida.");
                }
            } while (scelta != 0);

        } catch (NumberFormatException e) {
            System.out.println("Errore: Devi inserire numeri interi validi.");
        } catch (IllegalArgumentException e) {
            System.out.println("Errore: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}