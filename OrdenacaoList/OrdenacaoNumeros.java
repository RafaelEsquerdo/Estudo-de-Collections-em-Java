package OrdenacaoList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
    private List<Integer> numeroList;

    public OrdenacaoNumeros(){
        this.numeroList = new ArrayList<>();
    }
    public void adicionarNumero(int numero){
        this.numeroList.add(numero);
    }
    public List<Integer> ordenarAscedente(){
        List<Integer> ordenacaoAscedente = new ArrayList<>(numeroList);
        if(!ordenacaoAscedente.isEmpty()){
            Collections.sort(ordenacaoAscedente);
            return  ordenacaoAscedente;
        }else{
            throw  new RuntimeException("A lista está vazia");
        }
    }
    public List<Integer> ordenacaoDescedente(){
        List<Integer> numeroDescedente = new ArrayList<>(numeroList);
        if(!numeroDescedente.isEmpty()){
            numeroDescedente.sort(Collections.reverseOrder());//Para colocar em ordem inversa.
            return numeroDescedente;
        }else{
            throw new RuntimeException("A lista está vazian");
        }
    }
    public void exibirNumeros(){
        if(!numeroList.isEmpty()){
            System.out.println(this.numeroList);
        }else{
            System.out.println(" A lista está vazia");
        }
    }
    public static void main(String[] args) {
        // Criando uma instância da classe OrdenacaoNumeros
        OrdenacaoNumeros numeros = new OrdenacaoNumeros();

        // Adicionando números à lista
        numeros.adicionarNumero(2);
        numeros.adicionarNumero(5);
        numeros.adicionarNumero(4);
        numeros.adicionarNumero(1);
        numeros.adicionarNumero(99);

        // Exibindo a lista de números adicionados
        numeros.exibirNumeros();

        // Ordenando e exibindo em ordem ascendente
        System.out.println(numeros.ordenarAscedente());
        // Exibindo a lista
        numeros.exibirNumeros();

        // Ordenando e exibindo em ordem descendente
        System.out.println(numeros.ordenacaoDescedente());

        // Exibindo a lista
        numeros.exibirNumeros();
    }
}
