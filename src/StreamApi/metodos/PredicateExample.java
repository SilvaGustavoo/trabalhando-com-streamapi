package StreamApi.metodos;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class PredicateExample {
    
    public static void main(String[] args) {
        
        // Cria uma lista de string
        List<String> list_strings = Arrays.asList("Java", "Javascript", "Python", "MySQL");

        // Cria uma lista de numeros
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // Predicate personalizado
        Predicate<String> contemCincoLetras = (str) -> str.length() > 5;

        // Exibi as strings com mais de 5 letras usando um predicate personalizado
        list_strings.stream().filter(contemCincoLetras).forEach(System.out::println);

        // Exibi as strings com mais de 5 letras usando um predicate editado no stream.
        list_strings.stream().filter(str -> str.length() > 5).forEach(System.out::println);

        numbers.stream().filter(num -> num % 2 == 0).forEach(System.out::println);



    }
}

