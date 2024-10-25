package StreamApi.metodos;
import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {
    
    public static void main(String[] args) {
        
        List<Integer> list_numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        BinaryOperator<Integer> soma = (num1, num2) -> num1 + num2;

        System.out.println(list_numbers.stream().reduce(0, soma));

        System.out.println("\n" + list_numbers.stream().reduce(0, (num1, num2) -> num1 + num2));

        // Exibi na tela o maior numero
        System.out.println(list_numbers.stream().reduce(list_numbers.get(1), (num1, num2) -> num1 > num2 ? num1 : num2));

        // Exibi na tela o menor numero
        System.out.println(list_numbers.stream().reduce(list_numbers.get(1), (num1, num2) -> num1 < num2 ? num1 : num2));
    }
}
