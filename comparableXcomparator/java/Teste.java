package comparableXcomparator.java;

import java.util.Comparator;

//Nao por abstract
class  Pessoa     implements  Comparable<Pessoa> {
      //Atribuindo variaveis
      private String nome;
      private int idade;
      private double peso;
       //Criando o construtor
      public  Pessoa ( String nome , int idade, double peso){
          this.nome = nome;
          this.idade = idade;
          this.peso = peso;

      }



    //Ordernar pessoa por nome
      public int compareTo(Pessoa p){
          return this.nome.compareTo(p.nome);
          //Irá retornar ordenado por nome
      }

      //Criando o método Get
      public String getNome(){
          return nome;
      }
      public int getIdade(){
          return   idade;

      }
      public double getPeso(){
          return peso;
      }



abstract class CompararNome implements Comparator<Pessoa>{
    @Override
    public int compare(Pessoa p1 , Pessoa p2){
            return p1.getNome().compareTo(p2.getNome());
    }

}
static class CompararIdade implements  Comparator<Pessoa>{
          @Override
    public int compare (Pessoa p1, Pessoa p2){
       return Integer.compare(p1.getIdade(),p2.getIdade());
    }
}
static class CompararPeso implements Comparator<Pessoa>{
          @Override
    public int compare(Pessoa p1 , Pessoa p2){
        return Double.compare(p1.getPeso(), p2.getPeso());
    }



}
}





