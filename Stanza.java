abstract class Stanza {
    protected int numero;
    protected boolean occupata;

    public Stanza(int numero) {
        this.numero = numero;
        this.occupata = false;
    }

    public int getNumero() {
        return numero;
    }

    public boolean isOccupata() {
        return occupata;
    }

    public void occupa() {
        occupata = true;
    }

    public void libera() {
        occupata = false;
    }

    public void setOccupata(boolean occupata) {
        this.occupata = occupata;
    }

    public abstract String getDescrizione();
}