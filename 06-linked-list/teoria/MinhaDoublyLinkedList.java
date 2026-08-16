import util.Assert;

/* 06 — Linked List | Teoria: Doubly Linked List
 * Lição de referência: NeetCode DSA for Beginners → "Doubly Linked List"
 *
 * IDEIA: cada nó guarda referência para o próximo E o anterior. Isso permite
 * addLast/removeLast em O(1) sem precisar percorrer a lista (ao contrário da
 * lista simples, onde remover o último exige achar o penúltimo). É a base
 * de estruturas como LRU Cache.
 *
 * ANTES DE CODAR, escreva aqui sua ideia em 3 linhas:
 *   1.
 *   2.
 *   3.
 */
public class MinhaDoublyLinkedList {

    private static class No {
        int valor;
        No anterior;
        No proximo;
        No(int valor) { this.valor = valor; }
    }

    private No cabeca;
    private No cauda;
    private int tamanho;

    public int size() {
        return tamanho;
    }

    // TODO: insere no início. Atualize os links do nó novo e do antigo
    // primeiro nó (se existir). Se a lista estava vazia, cabeca == cauda.
    public void addFirst(int valor) {
        throw new UnsupportedOperationException("TODO");
    }

    // TODO: insere no fim. Simétrico ao addFirst.
    public void addLast(int valor) {
        throw new UnsupportedOperationException("TODO");
    }

    // TODO: remove e retorna o primeiro valor. Lance
    // IllegalStateException se a lista estiver vazia.
    public int removeFirst() {
        throw new UnsupportedOperationException("TODO");
    }

    // TODO: remove e retorna o último valor. Lance
    // IllegalStateException se a lista estiver vazia.
    public int removeLast() {
        throw new UnsupportedOperationException("TODO");
    }

    public static void main(String[] args) {
        MinhaDoublyLinkedList lista = new MinhaDoublyLinkedList();
        Assert.equals(0, lista.size(), "começa vazia");

        lista.addLast(1);
        lista.addLast(2);
        lista.addFirst(0);
        // lista: 0, 1, 2
        Assert.equals(3, lista.size(), "tamanho após inserções");

        Assert.equals(0, lista.removeFirst(), "removeFirst retorna 0");
        Assert.equals(2, lista.removeLast(), "removeLast retorna 2");
        Assert.equals(1, lista.size(), "sobra só o elemento do meio");

        Assert.equals(1, lista.removeLast(), "removeLast do último elemento");
        Assert.equals(0, lista.size(), "lista vazia de novo");

        lista.addFirst(42);
        Assert.equals(42, lista.removeFirst(), "addFirst/removeFirst em lista vazia");

        Assert.resumo();
    }
}
