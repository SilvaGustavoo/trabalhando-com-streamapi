package StreamApi.atividades;

import java.util.Arrays;
import java.util.List;

public class Desafio06 {
    
    public static void main(String[] args) {
        
        // Utilize a Stream API para verificar se a lista contém algum número maior que 10 e exiba o resultado no console.


        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);


        List<Integer> maiorQueDez = numeros.stream().filter(num -> num > 10).toList();

        System.out.println("Existe algum número maior que 10? " + (!maiorQueDez.isEmpty()));

        // Se existir, exiba os números maiores que 10
        if (!maiorQueDez.isEmpty()) {
            System.out.println("Números maiores que 10:");
            maiorQueDez.forEach(System.out::println);
        }
    }
}
