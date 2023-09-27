package pilarespoo;

public abstract class Veiculo {
    private String chassi;

    public String getChassi() {
        return chassi;
    }
    public void setChassi(String chassi) {
        this.chassi = chassi;
    }
    public abstract void ligar(); // neste trecho dizemos que todo método que 
    // utilizar da classe veiculo terá de ter um método ligar.
    
}
