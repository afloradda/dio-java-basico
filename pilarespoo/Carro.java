package pilarespoo;

public class Carro extends Veiculo{

    public void ligar(){
        confereCambio();
        confereCombustivel();
        System.out.println("CARRO LIGADO");
    }
    private void confereCombustivel(){
        System.out.println("Conferindo combustivel");
    }
    private void confereCambio(){
        System.out.println("Conferindo cambio em P");
    }
}

/*
 * Exemplo de Encapsulamento e Herença
 */