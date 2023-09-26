package estudoen1;

public enum EstadoBrasileiro{
    SAO_PAULO ("SP", "São Paulo"),
    /*
     * criando um objeto denomiado de 'SAO_PAULO' onde sua sigla e nome
     * já foram atribuidos e assim segue a criação dos demais.
     */
    RIO_JANEIRO ("RJ", "Rio de Janeiro"),
    PIAUI ("PI", "Piauí"),
    MARANHA ("MA", "Maranhão");

    private String nome;
    private String sigla;

    private EstadoBrasileiro(String sigla, String nome){
        this.sigla = sigla;
        this.nome = nome;
    }

    public String getSigla(){
        return sigla;
    }
    public String getNome(){
        return nome;
    }
    public String getNomeMaiusculo(){
        return nome.toUpperCase();
    }
}