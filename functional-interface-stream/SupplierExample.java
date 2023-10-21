import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SupplierExample {
    public static void main(String[] args) {
        // Usar Supplier com expressão lambdapara fornecer uma saudação personalizada.
        Supplier<String> saudacoes = () -> "Olá, seja bem-vinde!";

        // Usar Supplier para obter uma lista com 5 saudações
        List<String> listaSaudacoes = Stream.generate(saudacoes)
            .limit(5)
            .collect(Collectors.toList());

        // Imprimir as saudações geradas
        listaSaudacoes.forEach(s -> System.out.println(s)); // Lambda
        listaSaudacoes.forEach(System.out::println); // Method References
        
    }
}
