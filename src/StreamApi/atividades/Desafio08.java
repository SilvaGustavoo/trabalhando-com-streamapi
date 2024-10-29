package StreamApi.atividades;

import java.util.Arrays;
import java.util.List;

public class Desafio08 {
    
    public static void main(String[] args) {
        
        // Utilizando a Stream API, realize a soma dos dígitos de todos os números da lista e exiba o resultado no console.


        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        double total = numeros.stream().reduce(0, (Integer a, Integer b) -> a += b);

        System.out.println(total);
    }
}
