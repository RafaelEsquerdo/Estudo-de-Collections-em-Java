## Collections Framework API
    Uma collection é uma estrutura de dados que serve para agrupar muitos
    elementos em uma única unidade; estes elementos precisam ser objetos.
    -   
    Não aceita tipo primitivo so tipos complexo e objetos
    -
    Uma collection pode ter coleções homogeneas e heterogeneas, mais normalmente
     é usado a homogeneas.
    -
    O nucleo principal das coleções é formado pelas interfaces. Essa intefaces permitem
    manipular a coleção independetemente de nível de detalhes que eçeas representam
    -   
    Temos 4 grandes tipos de coleções:ListGenerics (lista), Set( Conjunto), Queue(fila)
    Map (mapa). A partir dessas interfaces, temos muitas subclasses concretas qye implementam várias 
    formas diferentes de se trabalhar com cada coleção

## Generics Type
    Um tipo génerico é uma classe genérica ou uma inteface que é parametrizada em 
    relação a tipos
    -
     O simbolo <> é chamado de "diamond operator" foi um recurso introduzido no java com o contexto de tipos
    genericos para infrir automaticamente o tipo base no contexto
    -
    Para atualizar uma classe para usar generics, voce cria uma declaração de tipo 
    genérico alterando o codigo. Ex: public class Box para public class Box<T>
    Isso Introduz a variavel de tipo T, que pode set usada em qualquer lugar dentro de classe.
    
    public class Box<T> {
    // T representa "Type" (tipo)
    private T t;

         public void set(T t) { this.t = t; }
        public T get() { return t; }
    }

    Os nomes de parâmetros de tipo mais comumente usados são:
    E - Elemento (usado extensivamente pelo Java Collections Framework)
    K - Chave
    N - Número
    T - Tipo
    V - Valor
    S, U, V, etc. - 2º, 3º, 4º tipos
    Vantagens simples de usar generics nas interfaces Collection em Java:

    1)Segurança do tipo de dados: O uso de generics garante que apenas objetos de um tipo específico possam ser adicionados
    à coleção, evitando erros de tipo e garantindo que você esteja lidando com os dados corretos.
    
    2)Código mais legível: Ao usar generics, você pode especificar o tipo de dados esperado ou retornado pela coleção, o que torna o código mais fácil de entender e ler.
    
    3)Detecta erros mais cedo: O compilador verifica se você está usando os tipos corretos durante a compilação, ajudando a identificar erros de tipo antes mesmo de executar o programa.
    
    4)Reutilização de código: Com generics, você pode criar classes e métodos genéricos que funcionam com diferentes tipos de coleções, evitando a necessidade de duplicar código para cada tipo específico.
    
    5)Melhor desempenho: O uso de generics pode melhorar o desempenho, pois evita a necessidade de conversões de tipo desnecessárias e permite que o compilador otimize o código com base no tipo especificado.

## Comparable x Comparator
    **Comparable** 
    Interface que define a operação de comparação de próprio objeto com outro, usado para definir a ordem natural 
    dos elementos de uma coleção. Poder ser usado caso os objetos que serão adicionados no coleção ja  implementam a interface(Integer,Double,String , etc)


    °Fornece uma únca sequencia de ordenação.
    °Em outras palavras podemos ordenar a coleção com base em um único elemento,com id,nome e preço;
    °Afeta a classe original, ou seja, a classe atual é modificada
    °Fornece o método - compareTo() - para ordenar elementos.
    °Está presente no pacote java.lang
    °Podemos ordenar os elementos da lista do tipo Comparable usando o método ** Collections.sort(ListGenerics). ** 
    
    **Comparator**
    Interface que define a operação de comparaçã entre dois objetos por um objeto externo.É utilizado quando os objetos
    a serem adicionados não podem ser modificados para aceitarem a inteface Comparable.
    
    
    - Fornece o método - compare() - para ordenar elementos.
    - Fornece múltiplas sequencias de ordenação. Em outras palavras, podemos ordenar a coleção com base em multiplos elementos
    com id, nome, preço, etc.
    - Não afeta a classe original, ou seja, a classe atual não é modificado.
    -Um comparator está presente no pacote java.util
    - Podemos ordener os elementos do lista do tipo comparator usando o método Collections.sort(ListGenerics,Comparator).
    

    **Collections**
    Collections é uma classe utilitaria do java ára operação comuns em coleções
    
    - Ela fornece métodos para odernação, busca, manipulação e sicronização  de coleções
    -O método ** sort() ** é usado para ordenar uma lista em ordem ascendente
    -O método ** sort() ** em conjunto com ** Collections.reverseOrder() ** permite ordenar em ordem descendente.

## ListInterface
    ° A interface ListInterface é uma coleção ordenada que permite a inclusão de elementos duplicados.
    ° É um dos tipos de coleção mais utilizados em Java, e as classes de implementação comuns são ArrayList e LinkedList.
    ° A ListGenerics se assemelha a uma matriz com comprimento dinâmico, permitindo adicionar ou remover elementos.
    ° A interface ListGenerics fornece métodos úteis para adicionar elementos em posições específicas, remover ou substituir elementos 
    com base no índice e obter sublistas usando índices.
    ° A classe Collections fornece algoritmos úteis para manipulação de ListGenerics, como ordenação (sort), embaralhamento (shuffle), 
    reversão (reverse) e busca binária (binarySearch).

