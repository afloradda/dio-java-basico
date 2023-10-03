package pilarespoo.MSN;

public abstract class ServicoMensagemInstantanea{

    public abstract void enviarMensagem();
    public abstract void receberMensagem();

    /*
     * A Abstração parte do conceito de como cada
     * herdeiro da classe vai interpretar para o seu proprio
     * programa.
     */
}

/*
 * tornando o 'ServicoMensagemInstantanea' uma classe abstrata
 * determinamos que todos os filhos que herdarem devem ter os seguintes métodos
 * e implimentarem suas diferentes formas de execução
 */