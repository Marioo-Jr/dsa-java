import util.Assert;

/* LeetCode 4 — Median of Two Sorted Arrays [Hard] | Tópico: Binary Search
 * Padrão: busca binária sobre a partição do array menor, em O(log(min(m,n)))
 *
 * MINHA IDEIA (escrever ANTES de codar):
 *   1.
 *   2.
 *   3.
 *
 * Complexidade:  tempo O(?)  espaço O(?)
 * Status: sozinho | com dica | viu o vídeo
 * Vídeo: ver PLAYLIST_INDEX.md
 */
public class MedianOfTwoSortedArrays {

    public static void main(String[] args) {
        Assert.equals(2.0, findMedianSortedArrays(new int[]{1, 3}, new int[]{2}), "total ímpar: mediana é o elemento do meio");
        Assert.equals(2.5, findMedianSortedArrays(new int[]{1, 2}, new int[]{3, 4}), "total par: média dos dois do meio");
        Assert.equals(1.0, findMedianSortedArrays(new int[]{}, new int[]{1}), "um array vazio, único elemento");
        Assert.equals(2.0, findMedianSortedArrays(new int[]{2}, new int[]{}), "outro array vazio, único elemento");
        Assert.resumo();
    }

    static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        throw new UnsupportedOperationException("TODO");
    }
}
