import util.Assert;
import java.util.PriorityQueue;

/* Teoria — Two Heaps (mediana de um stream) | Tópico: Heap / Priority Queue
 * Padrão: max-heap para a metade menor + min-heap para a metade maior,
 *         mantendo as duas metades balanceadas (diferença de tamanho <= 1)
 *
 * MINHA IDEIA (escrever ANTES de codar):
 *   1.
 *   2.
 *   3.
 *
 * Aqui PODE usar java.util.PriorityQueue — o foco da lição é a técnica dos
 * dois heaps, não reimplementar heap de novo (isso já foi feito em
 * MeuMinHeap.java).
 *
 * Complexidade:  add O(log n)  findMedian O(1)  espaço O(n)
 * Status: sozinho | com dica | viu o vídeo
 * Vídeo: ver PLAYLIST_INDEX.md
 */
public class TwoHeaps {

    // TODO: max-heap com a metade menor dos números (PriorityQueue com Collections.reverseOrder())
    // TODO: min-heap com a metade maior dos números (PriorityQueue padrão)

    public void add(int num) {
        throw new UnsupportedOperationException("TODO");
    }

    public double findMedian() {
        throw new UnsupportedOperationException("TODO");
    }

    public static void main(String[] args) {
        TwoHeaps mf = new TwoHeaps();

        mf.add(5);
        Assert.equals(5.0, mf.findMedian(), "mediana com 1 elemento");

        mf.add(2);
        Assert.equals(3.5, mf.findMedian(), "mediana com 2 elementos (2,5)");

        mf.add(8);
        Assert.equals(5.0, mf.findMedian(), "mediana com 3 elementos (2,5,8)");

        mf.add(1);
        Assert.equals(3.5, mf.findMedian(), "mediana com 4 elementos (1,2,5,8)");

        mf.add(9);
        Assert.equals(5.0, mf.findMedian(), "mediana com 5 elementos (1,2,5,8,9)");

        Assert.resumo();
    }
}
