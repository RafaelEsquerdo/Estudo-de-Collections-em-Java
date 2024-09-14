package OrdenacaoList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {
    private List<Pessoa> pessoaslist;

    public OrdenacaoPessoa(){
        this.pessoaslist = new ArrayList<>();
    }
    public void adicionarPessoa(String nome, int idade, double altura){
        pessoaslist.add(new Pessoa(nome, idade, altura));
    }
    //Comparable
    public List<Pessoa> ordenarPorIdade(){
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaslist);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }
    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> pessoaPorAltura = new ArrayList<>(pessoaslist);
        if(!pessoaPorAltura.isEmpty()){
            Collections.sort(pessoaPorAltura, new ComparatorPorAltura());
            return pessoaPorAltura;
        }
        else{
            throw new RuntimeException(" ");
        }

    }

    public static void main(String[] args) {
     OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();
     ordenacaoPessoa.adicionarPessoa("Rafael", 21,1.69);
     ordenacaoPessoa.adicionarPessoa("Gabriel", 25,1.80);
     ordenacaoPessoa.adicionarPessoa("Anna", 18,1.57);
     ordenacaoPessoa.adicionarPessoa("Gabriella", 15,1.70);

        System.out.println(ordenacaoPessoa.pessoaslist);
        System.out.println("   ");
        System.out.println("Ordenando por idade"+ordenacaoPessoa.ordenarPorIdade());
        System.out.println("   ");
       System.out.println("Ordenando por altura"+ordenacaoPessoa.ordenarPorAltura());
    }


}


