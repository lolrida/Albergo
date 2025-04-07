public class StanzaStandard extends Stanza {
    private static final double PREZZO = 75.0; // Prezzo per notte per una stanza standard
    private static final String TIPO = "Standard";

    public StanzaStandard(int numeroStanza) {
        super(numeroStanza); // Chiama il costruttore della superclasse Stanza
    }

    @Override
    public String getDescrizione() {
        return "Stanza " + TIPO + " " + getNumero() + " - Prezzo: $" + PREZZO;
    }

    @Override
    public boolean isOccupata() {
        return super.isOccupata(); // Usa lo stato di occupazione della superclasse
    }

    // Metodo per settare lo stato di occupazione (opzionale)
    public void setOccupata(boolean occupata) {
        super.setOccupata(occupata);
    }

    // Getter per il prezzo (opzionale)
    public double getPrezzo() {
        return PREZZO;
    }
}