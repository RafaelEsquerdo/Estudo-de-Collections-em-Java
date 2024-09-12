package comparableXcomparator.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
    List<Pessoa> pessoas = new ArrayList<>();
    pessoas.add(new Pessoa("Rafael", 21, 100.00));
    pessoas.add(new Pessoa("Luan", 25, 60.00));
    pessoas.add(new Pessoa("Arthur", 12, 80.00));

    System.out.println("Ordenando por  nome usando comparable");
    Collections.sort(pessoas);
    for(Pessoa pessoa : pessoas){
        System.out.println(pessoa.getNome()+ " - " + pessoa.getIdade()+ " - " + pessoa.getPeso());
    }
        System.out.println( );
    System.out.println("Ordenando por idade usando Comparator");
    Collections.sort(pessoas, new Pessoa.CompararIdade());
    for(Pessoa p : pessoas){
        System.out.println(p.getNome()+" - " + p.getIdade()+" - "+ p.getPeso());
    }
        System.out.println( );
        System.out.println("Ordenando por peso usando o Comparator: ");
        Collections.sort(pessoas,new Pessoa.CompararPeso());
        for (Pessoa p : pessoas)
        System.out.println(p.getNome()+" - " + p.getIdade()+" - "+ p.getPeso());
    }

}

