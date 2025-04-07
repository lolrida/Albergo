public class StanzaLusso extends Stanza {
    private static final double PREZZO = 250.0;
    private static final String DESCRIZIONE_BASE = "Stanza di Lusso";

    public StanzaLusso(int numeroStanza) {
        super(numeroStanza);
    }

    @Override
    public String getDescrizione() {
        return DESCRIZIONE_BASE + " " + getNumero() + " - Prezzo: $" + PREZZO;
    }

    @Override
    public boolean isOccupata() {
        return super.isOccupata();
    }

    public void setOccupata(boolean occupata) {
        super.setOccupata(occupata);
    }

    public double getPrezzo() {
        return PREZZO;
    }
}