public class ExemploBreakContinue {
    public static void main(String[] args) {
        for(int numero = 1; numero <= 5; numero++){
            if(numero==3)
                break;

            System.out.println(numero);
        }
/*
 * No primeiro exemplo temos o 'break'e com elea quebra do programa
 * ao chegar no número três.
 */
        for(int numero = 1; numero <= 5; numero++){
            if(numero==3)
                continue;

            System.out.println(numero);
        }
    }
}

/*
 * No segundo exemplo o programa segue até o limite do for
 * (Enquanto numero for menor ou igual a 5) apenas pulando o
 * print em tela do numero 3.
 */
