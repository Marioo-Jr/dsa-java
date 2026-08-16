import util.Assert;

/* LeetCode 152 — Maximum Product Subarray [Medium] | Tópico: 1-D Dynamic Programming
 * Padrão: DP 1D (rastrear max E min por causa de negativos)
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
public class MaximumProductSubarray {

    public static void main(String[] args) {
        Assert.equals(6, maxProduct(new int[]{2, 3, -2, 4}), "[2,3] -> produto 6");
        Assert.equals(0, maxProduct(new int[]{-2, 0, -1}), "melhor subarray inclui so o 0");
        Assert.equals(5, maxProduct(new int[]{5}), "um elemento so");
        Assert.equals(-2, maxProduct(new int[]{-2}), "um elemento negativo so");
        Assert.equals(24, maxProduct(new int[]{-2, 3, -4}), "produto de todos os 3: (-2)*3*(-4)=24");
        Assert.resumo();
    }

    static int maxProduct(int[] nums) {
        throw new UnsupportedOperationException("TODO");
    }
}
