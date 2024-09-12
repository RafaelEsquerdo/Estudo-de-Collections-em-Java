package Pesquisalist;

import OperaçõesBasicasList.CarrinhoDeCompra;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivro {
    //Criando  u lista de objetos do tipo livro
    private List<Livro> livroList;
    public CatalogoLivro(){
        this.livroList = new ArrayList<>();
    }
    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        livroList.add(new Livro(titulo,autor,anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> livrosporAutor = new ArrayList<>();
        if(!livroList.isEmpty()){
            for(Livro l : livroList){
                if(l.getAutor().equalsIgnoreCase(autor)){
                    livrosporAutor.add(l);
                }
            }
        }
        return livrosporAutor;
    }
    public List<Livro>pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> livrosporIntervalodeAnos = new ArrayList<>();
        if(!livroList.isEmpty()){
            for(Livro l : livroList){
                if(l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal){
                    livrosporIntervalodeAnos.add(l);
                }
            }
        }
        return livrosporIntervalodeAnos;
    }
    public  Livro pesquisarPorTitulo(String titulo){
        Livro livroPorTitulo = null;
        if(!livroList.isEmpty()){
            for(Livro l : livroList){
                if(l.getTitulo().equalsIgnoreCase(titulo)){
                    livroPorTitulo = l;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }

    public static void main(String[] args) {
        CatalogoLivro catalogoLivro = new CatalogoLivro();
        catalogoLivro.adicionarLivro("Senhor dos Aneis","J.R.R. Tolkien",1935  );
        catalogoLivro.adicionarLivro("Harry Potter","JK.Rowling",1997  );
        catalogoLivro.adicionarLivro("Game Of Thrones","George R.R.Martin",1996  );
        catalogoLivro.adicionarLivro("Livro 4","Autor 4",2001);
        System.out.println(catalogoLivro.pesquisarPorAutor("Autor 4"));
        System.out.println();
        System.out.println(catalogoLivro.pesquisarPorIntervaloAnos(1937,2001));
        System.out.println();
        System.out.println(catalogoLivro.pesquisarPorTitulo("Senhor Dos Aneis"));
    }

}
