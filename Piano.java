public class Piano {
    private int numeroPiano;
    Stanza[] stanze;
    private static final int last_lux_floor = 1;

    public Piano(int numeroPiano, int numeroStanze, int totalePiani) {
        this.numeroPiano = numeroPiano;
        this.stanze = new Stanza[numeroStanze];

        boolean isLuxuryFloor = (numeroPiano > (totalePiani - last_lux_floor));

        for (int i = 0; i < numeroStanze; i++) {
            int numeroStanza = numeroPiano * 100 + i + 1;
            if (isLuxuryFloor) {
                stanze[i] = new StanzaLusso(numeroStanza);
            } else {
                stanze[i] = new StanzaStandard(numeroStanza);
            }
        }
    }

    public void mostraStanze() {
        for (Stanza stanza : stanze) {
            System.out.println(stanza.getDescrizione() + " - " + (stanza.isOccupata() ? "Occupata" : "Libera"));
        }
    }

    public int getNumeroPiano() {
        return numeroPiano;
    }
}