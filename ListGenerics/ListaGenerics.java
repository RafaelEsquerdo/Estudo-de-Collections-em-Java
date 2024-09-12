package ListGenerics;

import java.util.ArrayList;
import java.util.List;

public class ListaGenerics {
    public static void main(String[] args) {
        //Exemplo de Lista sem o uso do Generics
        List ListaSemGenerics = new ArrayList<>();
        ListaSemGenerics.add("Elemento 1");
        ListaSemGenerics.add(10);//Permite a adição de qualquer tipo de objeto

        //Exemplo de Lista com o uso do Generics
        List <String> listaGenerics = new ArrayList<>();
        listaGenerics.add("Elemento 1");
        listaGenerics.add("Elemento 2");

        //Iterando sobre a lista como generics
        for (String elemento : listaGenerics){ 
            System.out.println(elemento);
        }
        //Iterando sobre a lista sem Generics ( necessario o uso de casting)
            for (Object elemento : ListaSemGenerics){
                String stg = (String) elemento;
                System.out.println(stg);
            }
    }

}
