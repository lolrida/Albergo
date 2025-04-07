public class StanzaStandard extends Stanza{
    public StanzaStandard(int numero) {
        super(numero);
    }

    @Override
    public String getDescrizione() {
        return "Stanza Standard n." + numero;
    }
}
