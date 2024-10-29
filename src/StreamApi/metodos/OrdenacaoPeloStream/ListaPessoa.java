package StreamApi.metodos.OrdenacaoPeloStream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Function;

public class ListaPessoa {

    private List<Pessoa> lista_pessoa;
    private Set<Pessoa> set_pessoa;
    private Map<String, Pessoa> map_pessoa;



    public ListaPessoa() {
        this.lista_pessoa = new ArrayList<>();
        this.set_pessoa = new HashSet<>();
        this.map_pessoa = new HashMap<>();
    }

    public void addPessoaList (String nome, int idade) {
        lista_pessoa.add(new Pessoa(nome, idade));
    }

    public void addPessoaSet (String nome, int idade) {
        set_pessoa.add(new Pessoa(nome, idade));
    }

    public void addPessoaMap (String apelido,String nome, int idade) {
        map_pessoa.put(apelido, new Pessoa(nome, idade));
    }

    public List<Pessoa> OrdenarPorNomeList() {

        List<Pessoa> listaOrdenadaPorNome = new ArrayList<>(lista_pessoa);
        listaOrdenadaPorNome.sort(new ComparatorNome());

        // listaOrdenadaPorNome.sort(Comparator.comparing(Pessoa::getNome));

        return listaOrdenadaPorNome;

    }


    public Set<Pessoa> OrdenarPorNomeSet() {

        Set<Pessoa> listaOrdenadaPorNome = new TreeSet<>(new ComparatorNome());
        listaOrdenadaPorNome.addAll(lista_pessoa);

        return listaOrdenadaPorNome;

    }


    public Map<String, Pessoa> OrdenarPorNomeMap() {

        List<Map.Entry<String, Pessoa>> listaOrdenada = new ArrayList<>(map_pessoa.entrySet());

        listaOrdenada.sort((p1, p2) -> p1.getValue().getNome().compareTo(p2.getValue().getNome()));

        Map<String, Pessoa> listaOrdenadaPorNome = new LinkedHashMap<>();

        for (Map.Entry<String,Pessoa> entry : listaOrdenada) {
            listaOrdenadaPorNome.put(entry.getKey(), entry.getValue());
        }

        return listaOrdenadaPorNome;

    }





    public static void main(String[] args) throws Exception {
        
        ListaPessoa lp = new ListaPessoa();

        lp.addPessoaList("João", 25);
        lp.addPessoaList("Maria", 20);
        lp.addPessoaList("José", 35);
        lp.addPessoaList("Ana", 28);
        lp.addPessoaList("Luís", 22);
        lp.addPessoaList("Marcos", 27);
        lp.addPessoaList("Pedro", 30);

        lp.addPessoaSet("João", 25);
        lp.addPessoaSet("Maria", 20);
        lp.addPessoaSet("José", 35);
        lp.addPessoaSet("Ana", 28);
        lp.addPessoaSet("Luís", 22);
        lp.addPessoaSet("Marcos", 27);
        lp.addPessoaSet("Pedro", 30);

        lp.addPessoaMap("Santos", "João", 25);
        lp.addPessoaMap("Silva", "Maria", 20);
        lp.addPessoaMap("Souza", "José", 35);
        lp.addPessoaMap("Fernandes", "Ana", 28);
        lp.addPessoaMap("Barbosa", "Luís", 22);
        lp.addPessoaMap("Gomes", "Marcos", 27);
        lp.addPessoaMap("Lopes", "Pedro", 30);


        System.out.println("Exibir Pessoas List Organizadas Por Nome \n" + lp.OrdenarPorNomeList());

        System.out.println("\n \nExibir Pessoas Set Organizadas Por Nome \n" + lp.OrdenarPorNomeSet());

        System.out.println("\n \nExibir Pessoas Map Organizadas Por Nome \n" + lp.OrdenarPorNomeMap());



        
        



        


    }
}


class ComparatorNome implements Comparator<Pessoa> {

    @Override
    public int compare(Pessoa p1, Pessoa p2) {
        
        return p1.getNome().compareTo(p2.getNome());
    }

}