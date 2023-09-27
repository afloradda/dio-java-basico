package pilarespoo;

public class Autodromo {
    public static void main(String[] args) {
        Carro jeep = new Carro();
        jeep.setChassi("1234A");
        jeep.ligar();

        Moto z400 = new Moto();
        z400.setChassi("5678B");
        z400.ligar();
    }
}
