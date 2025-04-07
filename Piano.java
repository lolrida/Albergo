public class Piano {
    private int numeroPiano;
    private Stanza[] stanze;

    public Piano(int numeroPiano, int numeroStanze) {
        this.numeroPiano = numeroPiano;
        this.stanze = new Stanza[numeroStanze];

        for (int i = 0; i < numeroStanze; i++) {
            int numeroStanza = numeroPiano * 100 + i + 1;
            stanze[i] = new StanzaStandard(numeroStanza);
        }
    }

    public void mostraStanze() {
        for (Stanza stanza : stanze) {
            System.out.println(stanza.getDescrizione() + " - " + (stanza.isOccupata() ? "Occupata" : "Libera"));
        }
    }
}
