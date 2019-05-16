public class Time {
    public static long tempInicial;
    public static long tempFinal;

    public static void comecar() {
        tempInicial = System.currentTimeMillis();
    }

    public static void parar(String nome) {
        tempFinal = System.currentTimeMillis();
        long dif = (tempFinal - tempInicial);
        System.out.println(String.format("Tempo de execução do " + nome + ": %02d segundos  e %02d milisegundos",
                dif / 1000, dif % 1000));
    }
}
