import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        /*System.out.println("Processo Seletivo");
        analisarCandidato(1900.0);
        analisarCandidato(2200.0);
        analisarCandidato(2000.0);

        selecaoCandidatos();

        imprimirSelecionados();
        */
        String [] candidatos = {"ANA", "CAIO", "ELIANA", "MICHELE", "LUCIANO"};
        for(String candidato : candidatos){
            entrandoEmContato(candidato);
        }

        
        
    }

    //método auxiliar
    static boolean atender(){
        return new Random().nextInt(3)==1;
    }

    static void entrandoEmContato(String candidato){
        int tentativasRealizadas = 1;
        boolean continuaTentando = true;
        boolean atendeu = false;
        do{
            atendeu = atender();
            continuaTentando = !atendeu;
            if(continuaTentando)
                tentativasRealizadas++;
            else
                System.out.println("CONTATO REALIZADO COM SUCESSO");
        }while(continuaTentando && tentativasRealizadas<3);

        if (atendeu) 
            System.out.println("CONSEGUIMOS CONTATO COM " + candidato + " NA " + tentativasRealizadas + " TENTATIVA.");
        else
            System.out.println("NÃO CONSEGUIMOS CONTATO COM O CANDIDATO " + candidato + " NUMERO MAXIMO DE TENTATIVAS.");
    }

    static void imprimirSelecionados(){
        String [] candidatos = {"ANA", "CAIO", "ELIANA", "MICHELE", "LUCIANO"};
        System.out.println("imprimindo lista de candidatos informando o indice do elemento.");

        for(int indice=0; indice < candidatos.length; indice++){
            System.out.println("O candidato de número " + (indice+1) + " é " + candidatos[indice]);
        }

        System.out.println("Forma abreviada de intera;ão for each");

        for(String candidato : candidatos){
            System.out.println("O candidato selecionado foi " + candidato);
        }

    }

    static void selecaoCandidatos(){
        String [] candidatos = {"ANA", "CAIO", "ELIANA", "MICHELE", "LUCIANO", "THIAGO", "ELISA", "STHEFANI"};
        
        int candidatosSelecionados = 0;
        int candidatosAtual = 0;
        double salarioBase = 2000.0;
        while(candidatosSelecionados < 5 && candidatosAtual < candidatos.length){
            String candidato = candidatos[candidatosAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " solicitou este valor de salário: " + salarioPretendido);
            if(salarioBase >= salarioPretendido){
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga.");
                candidatosSelecionados++;
            }
            candidatosAtual++;
        }
    }

    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO");
        }else if (salarioBase==salarioPretendido)
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
        else{    
            System.out.println("AGUARDAR O RESULTADO DOS DEMAIS CANDIDATOS");
        }    
            
    }
}