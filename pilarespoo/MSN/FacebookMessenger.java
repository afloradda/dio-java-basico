package pilarespoo.MSN;

public class FacebookMessenger extends ServicoMensagemInstantanea{

    public void enviarMensagem(){
        System.out.println("Enviando mensagem pelo Facebook Messenger.");
    }
    public void receberMensagem(){
        System.out.println("Recebendo mensagem pelo Facebook Messenger.");
    }

    //reaproveitamento de código seguindo o que é passado
    //pelo ServicoMensagemInstantanea.
}


