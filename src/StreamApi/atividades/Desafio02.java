package StreamApi.atividades;

import java.util.Arrays;
import java.util.List;

public class Desafio02 {
    
    public static void main(String[] args) {

        // Utilizando a Stream API, realize a soma dos números pares da lista e exiba o resultado no console.


        
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Metodo 1: Utilizando Predicate e o Reduce com BinaryOperator
        System.out.println(numeros.stream()
        .filter(num -> num % 2 == 0)
        .reduce(0, (Integer num, Integer num2) -> num += num2));

        // Metodo 2: Utilizando apenas o Reduce e BinaryOperator 
        System.out.println(numeros.stream()
        .reduce(0, (Integer num, Integer num2) -> num2 % 2 == 0 ? num += num2 : num));
    }
}
