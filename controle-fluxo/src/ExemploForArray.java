public class ExemploForArray {
    public static void main(String[] args) {
       String alunos[] = {"FELIPE", "JONAS", "JOÃO"};
       
       for (int x=0; x<alunos.length; x++){
        System.out.println("O aluno no indice x = " + x + " é " + alunos[x]);
       }
    }
}

/*
 * usando o método length no segundo bloco determinamos que
 * enquanto x (começado em zero) for menor que o tamanho do array
 * fazemos x++.
 */

/*
 * assim intruimos x a percorrer o array e a cada execução printar em tela
 * o indice daquele elemento dentro do conjunto.
 */