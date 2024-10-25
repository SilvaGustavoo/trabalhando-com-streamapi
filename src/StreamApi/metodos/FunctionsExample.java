package StreamApi.metodos;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionsExample {
    

    public static void main(String[] args) {
        // Cria uma lista de numeros inteiros
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // Criado uma função personalizada para dobrar numeros
        Function<Integer, Integer> dobrar = numero -> numero * 2;

        // Implementa a função dobrar e transforma em uma lista
        numbers.stream().map(dobrar).toList();

        // Cria a função dobrar dentro do map e transforma em uma lista
        numbers.stream().map((number) -> number * 2).toList();



    } 
}
