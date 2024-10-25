package StreamApi.metodos;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SuplierExample {
    
    public static void main(String[] args) {
        
        // Suplier já é um arrow function onde não recebe argumentos mas retorna valores

        Supplier<String> supplier = () -> "Oi, como você está";

        // Lista de strings gerada usando Supplier
        List<String> list = Stream.generate(supplier).limit(5).toList();

        // List de string utilizandoo supplier como arrow function
        list = Stream.generate(
            () -> { return "Oi, como você está"; }).limit(5).toList();


        list.forEach(n -> System.out.println(n));

    }
}
