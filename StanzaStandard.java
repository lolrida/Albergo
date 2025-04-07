public class StanzaStandard extends Stanza {
    private static final double PREZZO = 75.0;
    private static final String TIPO = "Standard";

    public StanzaStandard(int numeroStanza) {
        super(numeroStanza);
    }

    @Override
    public String getDescrizione() {
        return "Stanza " + TIPO + " " + getNumero() + " - Prezzo: $" + PREZZO;
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