public class ExemploForEach {
    public static void main(String[] args) {
        String alunos[] = {"FELIPE", "JONAS", "JOÃO"};

        for(String aluno : alunos){
            System.out.println("Nome do aluno é: " + aluno);
        }
    }
}

/*
 * Enquanto existir conteudo dentro da String alunos[] o elemento alunos
 * irá percorrer e printar a seguinte mensagem.
 */