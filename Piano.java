public class Piano {
    private int numeroPiano;
    Stanza[] stanze;
    private static final int LAST_LUXURY_FLOORS = 2; // Numero di ultimi piani con stanze di lusso

    public Piano(int numeroPiano, int numeroStanze, int totalePiani) {
        this.numeroPiano = numeroPiano;
        this.stanze = new Stanza[numeroStanze];

        // Determina se questo è uno degli ultimi piani
        boolean isLuxuryFloor = (numeroPiano > (totalePiani - LAST_LUXURY_FLOORS));

        // Crea stanze in base al tipo di piano
        for (int i = 0; i < numeroStanze; i++) {
            int numeroStanza = numeroPiano * 100 + i + 1; // Mantiene la tua logica di numerazione
            if (isLuxuryFloor) {
                stanze[i] = new StanzaLusso(numeroStanza); // Stanze di lusso negli ultimi piani
            } else {
                stanze[i] = new StanzaStandard(numeroStanza); // Stanze standard negli altri piani
            }
        }
    }

    public void mostraStanze() {
        for (Stanza stanza : stanze) {
            System.out.println(stanza.getDescrizione() + " - " + (stanza.isOccupata() ? "Occupata" : "Libera"));
        }
    }

    // Getter per il numero del piano (se necessario)
    public int getNumeroPiano() {
        return numeroPiano;
    }
}