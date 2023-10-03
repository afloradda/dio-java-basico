package pilarespoo.MSN;

public class MSNMenssenger extends ServicoMensagemInstantanea{

    public void enviarMensagem(){
        validarConectadoInternet();
        System.out.println("ENVIANDO MENSAGEM: pelo MSN Messenger");
        salvarHistoricoMensagem();
    }
    public void receberMensagem(){
        System.out.println("NOVA MENSAGEM: pelo MSN Messenger");
    }

    // inicialmente tinhamos esses métodos como public
    private void validarConectadoInternet(){
        System.out.println("CONECTANDO...");
    }
    private void salvarHistoricoMensagem(){
        System.out.println("SALVANDO...");
    }
    // mas pensando no pilar do encapsulamento levamos em conta que
    // o usuário não deve fazer os processos de verificação.

}
