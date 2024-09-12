package comparableXcomparator.java;

import java.util.*;

// Usando o Comparable para ordenar
class Livro  implements Comparable<Livro> {
    private String titulo;
    private String autor;
    private int ano;

    //construtor
    public Livro (String titulo, String autor, int ano){
      this.titulo = titulo;
      this.autor = autor;
      this.ano = ano;
    }
    //Ordenando livros por ano
      public int compareTo(Livro l){
      return  titulo.compareTo(l.titulo);
      //Ira retorna os livros ordenados nos anos
      }

      // Criando os métodos get and set para acessar os dados privados
    public String getTitulo(){
      return titulo;
   }
    public String getAutor(){
      return autor;
    }
    public int getAno(){
      return ano;
    }

    // Classe para comparar livro por autor
 static class CompararAutor implements Comparator<Livro>{
        @Override
        public int compare(Livro l1 , Livro l2){
            return l1.getAutor().compareTo(l2.getAutor());
        }
}

    // Classe para comparar Livro por ano
    static class CompararAno implements Comparator<Livro> {
        @Override
        public int compare(Livro l1, Livro l2) {
            if (l1.getAno() < l2.getAno())
                return -1;
            if (l1.getAno() > l2.getAno())
                return 1;
            else
                return 0;
        }
    }

    static class CompararAnoAutorTitulo implements Comparator<Livro> {
        @Override
        public int compare(Livro l1, Livro l2) {
            int ano = Integer.compare(l1.getAno(), l2.getAno());
            if (ano != 0)
                return ano;
            int autor = l1.getAutor().compareTo(l2.getAutor());
            if (autor != 0)
                return autor;
            return l1.getTitulo().compareTo(l2.getTitulo());
        }
    }

    public static void main(String[] args) {
         List <Livro> livros = new ArrayList<>();
         livros.add(new Livro("Senhor dos Aneis", "J.R.R. Tolkien" , 1954));
         livros.add(new Livro("O Auquimista ", "Paulo Coelho" , 2017));
         livros.add(new Livro("Admirável mundo novo", "Aldous Huxley" , 1932));

         //Ordenando por titulo ( Comparable)
        System.out.println("Ordenado por titulos usando o Comparable: ");
        Collections.sort(livros);
        for(Livro livro : livros){
            System.out.println(livro.getTitulo()+" - " + livro.getAutor()+ " - " + livro.getAno());
        }
        System.out.println( );
        // Ordenando por autor usando o Comparator
        System.out.println(" Ordenado por autor usando comparator: ");
        Collections.sort(livros, new CompararAutor());
        for( Livro livro : livros){
                System.out.println(livro.getTitulo()+" - " + livro.getAutor()+ " - " + livro.getAno());
        }
        System.out.println( );

        //Ordenando por  ano usando o Comparator
        System.out.println("Ordenado por ano usando o Comparator: ");
        Collections.sort(livros, new CompararAno());
        for(Livro livro : livros){
            System.out.println(livro.getTitulo()+" - " + livro.getAutor()+ " - " + livro.getAno());
        }
        System.out.println( );
        //Ordenando por ano , autor e livro ( usando o comparator)
        System.out.println("\nOrdenando por ano, autor e título (Comparator):");
        Collections.sort(livros, new CompararAnoAutorTitulo());
        for (Livro livro : livros) {
            System.out.println(livro.getTitulo() + " - " + livro.getAutor() + " - " + livro.getAno());
        }



    }

  }
  /*
  * Nessa aula aprendir sobre o uso de comparable e comparator, mostrando suas difrença e peculiaridades
  * Para melhor entendimento copiei de forma didatica para entender como ocorre o funionamento dos dois atributos
  *
  * */
