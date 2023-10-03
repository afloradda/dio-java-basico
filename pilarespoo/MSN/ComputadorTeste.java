package pilarespoo.MSN;

public class ComputadorTeste {
    public static void main(String[] args) {
        System.out.println("MSN");
        MSNMenssenger msn = new MSNMenssenger();
         msn.enviarMensagem();
         msn.receberMensagem();
        System.out.println(" ");
        System.out.println("FACEBOOK");
        FacebookMessenger fcb = new FacebookMessenger();
         fcb.enviarMensagem();
         fcb.receberMensagem();
    }
}
