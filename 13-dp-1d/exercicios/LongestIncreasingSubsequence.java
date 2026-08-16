import util.Assert;

/* LeetCode 300 — Longest Increasing Subsequence [Medium] | Tópico: 1-D Dynamic Programming
 * Padrão: DP 1D (dp[i] = tamanho da LIS terminando em i)
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
public class LongestIncreasingSubsequence {

    public static void main(String[] args) {
        Assert.equals(4, lengthOfLIS(new int[]{10, 9, 2, 5, 3, 7, 101, 18}), "LIS: 2,3,7,101 (tamanho 4)");
        Assert.equals(4, lengthOfLIS(new int[]{0, 1, 0, 3, 2, 3}), "LIS: 0,1,2,3 (tamanho 4)");
        Assert.equals(1, lengthOfLIS(new int[]{7, 7, 7, 7}), "todos iguais -> LIS de tamanho 1");
        Assert.equals(1, lengthOfLIS(new int[]{5}), "um elemento so");
        Assert.resumo();
    }

    static int lengthOfLIS(int[] nums) {
        throw new UnsupportedOperationException("TODO");
    }
}
