package pilarespoo.MSN;

public class ServicoMensagemInstantanea {

    public void enviarMensagem(){
        validarConectadoInternet();
        System.out.println("Enviando mensagem");
        salvarHistoricoMensagem();
    }
    public void receberMensagem(){
        System.out.println("Mensagem recebida");
    }

    private void validarConectadoInternet(){
        System.out.println("Conectando..");
    }
    private void salvarHistoricoMensagem(){
        System.out.println("Salvo no histórico..");
    }
}
