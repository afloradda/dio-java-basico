package UML;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    // Implementação dos métodos da interface ReprodutorMusical
    @Override
    public void tocarMusica(String musica) {
        // TODO 

    }

    @Override
    public void pausarMusica() {
        // TODO 
    }

    @Override
    public void adicionarMusica() {
        // TODO 
        throw new UnsupportedOperationException("Unimplemented method 'adicionarMusica'");
    }

    @Override
    public void selecionarMusica() {
        // TODO 
        throw new UnsupportedOperationException("Unimplemented method 'selecionarMusica'");
    }

    //APARELHO TELEFÔNICO
     @Override
    public void ligar(String numero) {
        // TODO 
        throw new UnsupportedOperationException("Unimplemented method 'ligar'");
    }

    @Override
    public void atender() {
        // TODO 
        throw new UnsupportedOperationException("Unimplemented method 'atender'");
    }

    @Override
    public void iniciarCorreioVoz(String numero) {
        // TODO 
        throw new UnsupportedOperationException("Unimplemented method 'iniciarCorreioVoz'");
    }

    @Override
    public void encerrarChamada() {
        // TODO 
    }

    @Override
    public void enviarMensagem(String numero, String mensagem) {
        // TODO 
    }

    @Override
    public void receberMensagem(String mensagem) {
        // TODO 
    }

    //

    @Override
    public void exibirPagina(String Link) {
        // TODO 
        throw new UnsupportedOperationException("Unimplemented method 'exibirPagina'");
    }

    @Override
    public void adicionarNovaAba(String Link) {
        // TODO 
        throw new UnsupportedOperationException("Unimplemented method 'adicionarNovaAba'");
    }

    @Override
    public void atualizarPagina() {
        // TODO 
        throw new UnsupportedOperationException("Unimplemented method 'atualizarPagina'");
    }



}
