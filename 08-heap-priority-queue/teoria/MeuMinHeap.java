import util.Assert;

/* Teoria — Min-Heap do zero (array-based) | Tópico: Heap / Priority Queue
 * Padrão: array + sift-up (ao inserir) / sift-down (ao remover)
 *
 * MINHA IDEIA (escrever ANTES de codar):
 *   1.
 *   2.
 *   3.
 *
 * Objetivo desta lição: implementar um min-heap manualmente, SEM usar
 * java.util.PriorityQueue, para entender como push/pop/heapify funcionam
 * por baixo dos panos. Para os exercícios de verdade, PriorityQueue é
 * permitido — aqui não.
 *
 * Fórmulas de índice (heap binário guardado em array, 0-indexed):
 *   pai(i)          = (i - 1) / 2
 *   filhoEsquerda(i) = 2*i + 1
 *   filhoDireita(i)  = 2*i + 2
 *
 * Complexidade:  push O(log n)  pop O(log n)  peek O(1)  espaço O(n)
 * Status: sozinho | com dica | viu o vídeo
 * Vídeo: ver PLAYLIST_INDEX.md
 */
public class MeuMinHeap {

    // TODO: escolher representação interna (int[] com tamanho dinâmico, ou List<Integer>)

    public void push(int val) {
        throw new UnsupportedOperationException("TODO");
    }

    public int pop() {
        throw new UnsupportedOperationException("TODO");
    }

    public int peek() {
        throw new UnsupportedOperationException("TODO");
    }

    public boolean isEmpty() {
        throw new UnsupportedOperationException("TODO");
    }

    // TODO: métodos privados de apoio — siftUp(int i), siftDown(int i), swap(int i, int j)

    public static void main(String[] args) {
        MeuMinHeap heap = new MeuMinHeap();
        Assert.isTrue(heap.isEmpty(), "heap recém-criado está vazio");

        heap.push(5);
        heap.push(2);
        heap.push(8);
        heap.push(1);
        heap.push(9);

        Assert.isTrue(!heap.isEmpty(), "heap com elementos não está vazio");
        Assert.equals(1, heap.peek(), "peek retorna o menor elemento");

        Assert.equals(1, heap.pop(), "pop retorna 1 (menor)");
        Assert.equals(2, heap.pop(), "pop retorna 2");
        Assert.equals(5, heap.pop(), "pop retorna 5");
        Assert.equals(8, heap.pop(), "pop retorna 8");
        Assert.equals(9, heap.pop(), "pop retorna 9 (último)");
        Assert.isTrue(heap.isEmpty(), "heap vazio após remover tudo");

        heap.push(42);
        Assert.equals(42, heap.peek(), "único elemento após reuso do heap");

        Assert.resumo();
    }
}
