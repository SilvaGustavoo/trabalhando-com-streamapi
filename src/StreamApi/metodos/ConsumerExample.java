package StreamApi.metodos;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {


    public static void main(String[] args) {
        
            
        List<Integer> list_numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        // Consumer é uma interface que recebe argumentos mas não retorna resultados
        Consumer<Integer> imprimirNumeroPar = numero -> {
            if (numero % 2 == 0) {
                System.out.println("Número par: " + numero);
            }
        };

        // list_numbers.stream().forEach(imprimirNumeroPar);
        list_numbers.forEach(numero -> {
            if(numero % 2 == 0) System.out.println(numero + "");
        });


    }

}
