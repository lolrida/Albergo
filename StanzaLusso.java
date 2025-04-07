public class StanzaLusso extends Stanza {
    private static final double PREZZO = 250.0; // Prezzo per notte per una stanza di lusso
    private static final String DESCRIZIONE_BASE = "Stanza di Lusso";

    public StanzaLusso(int numeroStanza) {
        super(numeroStanza); // Chiama il costruttore della superclasse Stanza
    }

    @Override
    public String getDescrizione() {
        return DESCRIZIONE_BASE + " " + getNumero() + " - Prezzo: $" + PREZZO;
    }

    @Override
    public boolean isOccupata() {
        return super.isOccupata(); // Usa lo stato di occupazione della superclasse
    }

    // Metodo per settare lo stato di occupazione (opzionale, se necessario)
    public void setOccupata(boolean occupata) {
        super.setOccupata(occupata);
    }

    // Getter per il prezzo (opzionale, se vuoi esporlo)
    public double getPrezzo() {
        return PREZZO;
    }
}