import java.util.Random;

public class Albergo {
    private Piano[] piani;
    private int totalePiani;

    public Albergo(int numeroPiani, int stanzePerPiano) {
        this.totalePiani = numeroPiani;
        this.piani = new Piano[numeroPiani];

        for (int i = 0; i < numeroPiani; i++) {
            piani[i] = new Piano(i + 1, stanzePerPiano, totalePiani);
        }
    }

    public void mostraAlbergo() {
        for (int i = 0; i < piani.length; i++) {
            System.out.println("Piano " + (i + 1));
            piani[i].mostraStanze();
            System.out.println();
        }
    }

    public int prenotaStanza(String tipo) {
        Random random = new Random();
        Stanza[] tutteStanze = getAllRooms();

        java.util.ArrayList<Stanza> stanzeDisponibili = new java.util.ArrayList<>();
        for (Stanza stanza : tutteStanze) {
            if (!stanza.isOccupata() && 
                (tipo.equals("Standard") && stanza instanceof StanzaStandard || 
                 tipo.equals("Luxury") && stanza instanceof StanzaLusso)) {
                stanzeDisponibili.add(stanza);
            }
        }

        if (stanzeDisponibili.isEmpty()) {
            return -1;
        }

        int index = random.nextInt(stanzeDisponibili.size());
        Stanza stanzaScelta = stanzeDisponibili.get(index);
        stanzaScelta.setOccupata(true);
        return stanzaScelta.getNumero();
    }

    public boolean liberaStanza(int numeroStanza) {
        Stanza[] tutteStanze = getAllRooms();
        for (Stanza stanza : tutteStanze) {
            if (stanza.getNumero() == numeroStanza && stanza.isOccupata()) {
                stanza.setOccupata(false);
                return true;
            }
        }
        return false;
    }

    private Stanza[] getAllRooms() {
        java.util.ArrayList<Stanza> allRooms = new java.util.ArrayList<>();
        for (Piano piano : piani) {
            for (Stanza stanza : piano.stanze) {
                allRooms.add(stanza);
            }
        }
        return allRooms.toArray(new Stanza[0]);
    }

    public int getTotalePiani() {
        return totalePiani;
    }
}