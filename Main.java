public class Main {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Utilizzo: java Main <numeroPiani> <stanzePerPiano>");
            return;
        }

        int numeroPiani = Integer.parseInt(args[0]);
        int stanzePerPiano = Integer.parseInt(args[1]);

        Albergo albergo = new Albergo(numeroPiani, stanzePerPiano);
        albergo.mostraAlbergo();
    }
}
