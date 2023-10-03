package pilarespoo.MSN;

public class ComputadorTeste {
    public static void main(String[] args) {
        ServicoMensagemInstantanea smi = null;

        String appEscolhido = "msn";

        if(appEscolhido.equals("msn"))
            smi = new MSNMenssenger();
        else if(appEscolhido.equals("fbm"))
            smi = new FacebookMessenger();
        else if (appEscolhido.equals("tlg"))
            smi = new TelegramMessenger();        

        smi.enviarMensagem();
        smi.receberMensagem();
    }
}
