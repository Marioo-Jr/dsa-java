import util.Assert;

/* LeetCode 215 — Kth Largest Element in an Array [Medium] | Tópico: Heap / Priority Queue
 * Padrão: min-heap de tamanho k (ou quickselect)
 *
 * MINHA IDEIA (escrever ANTES de codar):
 *   1.
 *   2.
 *   3.
 *
 * Complexidade:  tempo O(n log k)  espaço O(k)
 * Status: sozinho | com dica | viu o vídeo
 * Vídeo: ver PLAYLIST_INDEX.md
 */
public class KthLargestElementInAnArray {

    public static void main(String[] args) {
        Assert.equals(5, findKthLargest(new int[]{3, 2, 1, 5, 6, 4}, 2), "2º maior de [3,2,1,5,6,4] é 5");
        Assert.equals(4, findKthLargest(new int[]{3, 2, 3, 1, 2, 4, 5, 5, 6}, 4), "4º maior com repetidos é 4");
        Assert.equals(1, findKthLargest(new int[]{1}, 1), "único elemento, k=1");
        Assert.equals(1, findKthLargest(new int[]{2, 1}, 2), "k igual ao tamanho -> menor elemento");
        Assert.resumo();
    }

    static int findKthLargest(int[] nums, int k) {
        throw new UnsupportedOperationException("TODO");
    }
}
