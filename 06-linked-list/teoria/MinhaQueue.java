import util.Assert;

/* 06 — Linked List | Teoria: Queues
 * Lição de referência: NeetCode DSA for Beginners → "Queues"
 *
 * IDEIA: uma fila (FIFO) implementada com lista ligada guarda ponteiros para
 * a cabeça (onde tira - dequeue) e a cauda (onde põe - enqueue). Isso dá
 * enqueue/dequeue O(1), sem o custo de deslocar elementos que um array
 * teria ao remover do início.
 *
 * ANTES DE CODAR, escreva aqui sua ideia em 3 linhas:
 *   1.
 *   2.
 *   3.
 */
public class MinhaQueue {

    private static class No {
        int valor;
        No proximo;
        No(int valor) { this.valor = valor; }
    }

    private No cabeca;
    private No cauda;
    private int tamanho;

    // TODO: insere no fim da fila.
    public void enqueue(int valor) {
        throw new UnsupportedOperationException("TODO");
    }

    // TODO: remove e retorna o elemento do início da fila. Lance
    // IllegalStateException se a fila estiver vazia.
    public int dequeue() {
        throw new UnsupportedOperationException("TODO");
    }

    // TODO: retorna (sem remover) o elemento do início da fila. Lance
    // IllegalStateException se a fila estiver vazia.
    public int peek() {
        throw new UnsupportedOperationException("TODO");
    }

    public boolean isEmpty() {
        return tamanho == 0;
    }

    public static void main(String[] args) {
        MinhaQueue fila = new MinhaQueue();
        Assert.isTrue(fila.isEmpty(), "começa vazia");

        fila.enqueue(1);
        fila.enqueue(2);
        fila.enqueue(3);
        Assert.isTrue(!fila.isEmpty(), "não vazia após enqueue");
        Assert.equals(1, fila.peek(), "peek não remove");
        Assert.equals(1, fila.peek(), "peek de novo dá o mesmo valor");

        Assert.equals(1, fila.dequeue(), "dequeue segue ordem FIFO");
        Assert.equals(2, fila.dequeue(), "dequeue segue ordem FIFO (2)");
        Assert.equals(3, fila.peek(), "só sobrou o 3");

        fila.dequeue();
        Assert.isTrue(fila.isEmpty(), "vazia depois de esvaziar");

        Assert.resumo();
    }
}
