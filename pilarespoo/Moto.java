package pilarespoo;

public class Moto extends Veiculo{
    String chassi;

    @Override
    public void ligar(){
        System.out.println("MOTO LIGANDO");
    }

    public String getChassi() {
        return chassi;
    }
    public void setChassi(String chassi) {
        this.chassi = chassi;
    }
}
