import util.Assert;

/* LeetCode 703 — Kth Largest Element in a Stream [Easy] | Tópico: Heap / Priority Queue
 * Padrão: min-heap de tamanho k (o topo é o k-ésimo maior)
 *
 * MINHA IDEIA (escrever ANTES de codar):
 *   1.
 *   2.
 *   3.
 *
 * Complexidade:  tempo O(log k) por add, O(n log k) no construtor  espaço O(k)
 * Status: sozinho | com dica | viu o vídeo
 * Vídeo: ver PLAYLIST_INDEX.md
 */
public class KthLargestElementInAStream {

    public KthLargestElementInAStream(int k, int[] nums) {
        throw new UnsupportedOperationException("TODO");
    }

    public int add(int val) {
        throw new UnsupportedOperationException("TODO");
    }

    public static void main(String[] args) {
        KthLargestElementInAStream kthLargest = new KthLargestElementInAStream(3, new int[]{4, 5, 8, 2});
        Assert.equals(4, kthLargest.add(3), "3º maior após add(3) -> [4,5,8,2,3]");
        Assert.equals(5, kthLargest.add(5), "3º maior após add(5) -> [4,5,8,2,3,5]");
        Assert.equals(5, kthLargest.add(10), "3º maior após add(10) -> [4,5,8,2,3,5,10]");
        Assert.equals(8, kthLargest.add(9), "3º maior após add(9) -> [4,5,8,2,3,5,10,9]");
        Assert.equals(8, kthLargest.add(4), "3º maior após add(4) -> [4,5,8,2,3,5,10,9,4]");

        KthLargestElementInAStream kthLargest2 = new KthLargestElementInAStream(1, new int[]{});
        Assert.equals(-3, kthLargest2.add(-3), "k=1 com stream inicial vazio, add(-3)");
        Assert.equals(-3, kthLargest2.add(-5), "k=1, -3 continua sendo o maior");

        Assert.resumo();
    }
}
