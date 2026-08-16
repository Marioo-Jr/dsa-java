import util.Assert;

/* 06 — Linked List | Teoria: Singly Linked List
 * Lição de referência: NeetCode DSA for Beginners → "Singly Linked List"
 *
 * IDEIA: uma lista ligada guarda cada elemento em um nó separado, que aponta
 * para o próximo. Ao contrário de um array, não precisa de espaço contíguo
 * na memória — inserir/remover no início é O(1), mas acessar por índice é
 * O(n) porque é preciso percorrer nó a nó a partir da cabeça.
 *
 * Implementar do zero (com nó próprio, não util.ListNode) é o que faz a
 * diferença entre "decorar que get(i) é O(n)" e sentir por que é O(n).
 *
 * ANTES DE CODAR, escreva aqui sua ideia em 3 linhas:
 *   1.
 *   2.
 *   3.
 */
public class MinhaLinkedList {

    private static class No {
        int valor;
        No proximo;
        No(int valor) { this.valor = valor; }
    }

    private No cabeca;
    private No cauda;
    private int tamanho;

    public int size() {
        return tamanho;
    }

    // TODO: insere no início da lista. Lembre de atualizar cauda se a lista
    // estava vazia.
    public void addFirst(int valor) {
        throw new UnsupportedOperationException("TODO");
    }

    // TODO: insere no fim da lista. Lembre de atualizar cabeca se a lista
    // estava vazia.
    public void addLast(int valor) {
        throw new UnsupportedOperationException("TODO");
    }

    // TODO: retorna o valor no índice dado, percorrendo a partir da cabeça.
    // Lance IndexOutOfBoundsException se índice inválido.
    public int get(int indice) {
        throw new UnsupportedOperationException("TODO");
    }

    // TODO: remove o nó no índice dado. Cuidado com os casos de borda:
    // remover a cabeça, remover a cauda, lista com um elemento só.
    public void remove(int indice) {
        throw new UnsupportedOperationException("TODO");
    }

    public static void main(String[] args) {
        MinhaLinkedList lista = new MinhaLinkedList();
        Assert.equals(0, lista.size(), "começa vazia");

        lista.addLast(1);
        lista.addLast(2);
        lista.addLast(3);
        Assert.equals(3, lista.size(), "tamanho após 3 addLast");
        Assert.equals(1, lista.get(0), "get(0)");
        Assert.equals(3, lista.get(2), "get(2)");

        lista.addFirst(0);
        Assert.equals(0, lista.get(0), "get(0) após addFirst");
        Assert.equals(4, lista.size(), "tamanho após addFirst");

        lista.remove(0); // remove a cabeça
        Assert.equals(1, lista.get(0), "get(0) após remover cabeça");

        lista.remove(lista.size() - 1); // remove a cauda
        Assert.equals(2, lista.get(lista.size() - 1), "get(última) após remover cauda");
        Assert.equals(2, lista.size(), "tamanho final");

        Assert.resumo();
    }
}
