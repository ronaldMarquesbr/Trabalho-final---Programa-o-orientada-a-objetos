import java.util.ArrayList;

public class ListaManager <T> {
    ArrayList<T> itens = new ArrayList<T>();

    public ArrayList<T> obterItens() {
        return itens;
    }

    public void adicionar(T item) {
        itens.add(item);
    }

    public void remover(int itemIndex) {
        itens.remove(itemIndex);
    }

    public T obter(int itemIndex) { return itens.get(itemIndex); }

}
