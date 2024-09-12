package OperaçõesBasicasList;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    //Atributo
    private List <Tarefa> tarefaList = new ArrayList<>();

    public ListaTarefa() {
        this.tarefaList =  new ArrayList<>();
    }
    //adiciona tarefa
    public void adicionarTarefa( String descricao){
        tarefaList.add(new Tarefa(descricao));
    }
    //remove tarefa
    public void removerTarefa(String descricao){
        List<Tarefa>tarefasRemover = new ArrayList<>();
        for(Tarefa t: tarefaList){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                tarefasRemover.add(t);
            }
        }
        tarefaList.removeAll(tarefasRemover);
    }
    public int obterNumeroTotaldeTarefas(){
        return tarefaList.size();
    }
    public void obterDescricaoTarefas(){
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();
        System.out.println( "O numero de tarefas na lista é de: "+listaTarefa.obterNumeroTotaldeTarefas());
        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 2");
        listaTarefa.adicionarTarefa("Tarefa 1");
        System.out.println("O numero total de tarefas na lista é de: " + listaTarefa.obterNumeroTotaldeTarefas());

        listaTarefa.removerTarefa("Tarefa 1");
        System.out.println("O numero total de tarefas na lista é de: " + listaTarefa.obterNumeroTotaldeTarefas());
        listaTarefa.obterDescricaoTarefas();
    }
}
