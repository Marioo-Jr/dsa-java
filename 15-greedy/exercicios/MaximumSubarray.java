import util.Assert;

/* LeetCode 53 — Maximum Subarray [Medium] | Tópico: Greedy
 * Padrão: Kadane's Algorithm
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
public class MaximumSubarray {

    public static void main(String[] args) {
        Assert.equals(6, maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}), "subarray [4,-1,2,1] soma 6");
        Assert.equals(1, maxSubArray(new int[]{1}), "único elemento");
        Assert.equals(23, maxSubArray(new int[]{5, 4, -1, 7, 8}), "quase tudo positivo");
        Assert.equals(-1, maxSubArray(new int[]{-1}), "único elemento negativo");
        Assert.equals(-1, maxSubArray(new int[]{-3, -2, -1}), "todos negativos: melhor é o menos negativo");
        Assert.resumo();
    }

    static int maxSubArray(int[] nums) {
        throw new UnsupportedOperationException("TODO");
    }
}
