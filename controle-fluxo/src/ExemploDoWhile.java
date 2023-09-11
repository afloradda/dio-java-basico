import java.util.Random;
public class ExemploDoWhile {
    public static void main(String[] args) {
        System.out.println("Discando...");
        do{

            System.out.println("Telefone tocando");
        }while(tocando());

        System.out.println("Alô!!");
    }
    private static boolean tocando(){
        boolean atendeu = new Random().nextInt(3)==1;
        System.out.println("Atendeu? " + atendeu);

        return ! atendeu;
        // ! nega uma operação booleana portanto de 'atendeu' nega que esta tocando
    }
}

/*
 * 'do' ele permite que execute ao menos uma vez para que depois realiza a condição
 */