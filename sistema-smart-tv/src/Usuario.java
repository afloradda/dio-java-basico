public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        System.out.println("TV Ligada ? " + smartTv.ligada);
        System.out.println("Canal Atual: " + smartTv.canal);
        System.out.println("Volume Atual: " + smartTv.volume);

        smartTv.ligar();

        System.out.println("Novo status --> Tv Ligada ? " + smartTv.ligada);

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();

        System.out.println("Novo status --> Volume atual: " + smartTv.volume);

        smartTv.mudarDeCanal(4);
    }
}
