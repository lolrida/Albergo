public class Albergo {
    private Piano[] piani;

    public Albergo(int numeroPiani, int stanzePerPiano) {
        piani = new Piano[numeroPiani];

        for (int i = 0; i < numeroPiani; i++) {
            piani[i] = new Piano(i + 1, stanzePerPiano);
        }
    }

    public void mostraAlbergo() {
        for (int i = 0; i < piani.length; i++) {
            System.out.println("Piano " + (i + 1));
            piani[i].mostraStanze();
            System.out.println();
        }
    }
}
