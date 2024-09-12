package OperaçõesBasicasList;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompra {
    private List<Item> item = new ArrayList<>();

    public CarrinhoDeCompra(){
        this.item = new ArrayList<>();
    }
    public void adicionarItem(String nome, double preco, int quantidade){
        item.add(new Item(nome,preco,quantidade));
    }
    public void removerItens(String nome){
        List<Item> removerItem = new ArrayList<>();
        for(Item i : item){
            if(i.getNome().equalsIgnoreCase(nome)){
               removerItem.add(i);
            }
        }
        item.removeAll(removerItem);
    }
    public double calcularValorTotal(){
        double total = 0d;
        if(!item.isEmpty()){
            for(Item item1 : item){
                double valorItem  = item1.getPreco() * item1.getQuantidade();
                total += valorItem;
            }
            return total;
        }else{
            throw new RuntimeException("A lista está vazia");
        }

    }
    public void exibirItem(){
        System.out.println(item);
    }

    public static void main(String[] args) {
        CarrinhoDeCompra cc = new CarrinhoDeCompra();
        cc.adicionarItem("Arroz", 25.00,25);
        System.out.println("Os itens no carrinho: ");
        cc.exibirItem();

        cc.removerItens("Arroz");
        System.out.println("O item foi removido");
        cc.exibirItem();


     }
}
