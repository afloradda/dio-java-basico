package UML;

public interface AparelhoTelefonico {
    void ligar(String numero);
    void atender();
    void iniciarCorreioVoz(String numero);
    void encerrarChamada();
    void enviarMensagem(String numero, String mensagem);
    void receberMensagem(String mensagem);
}
