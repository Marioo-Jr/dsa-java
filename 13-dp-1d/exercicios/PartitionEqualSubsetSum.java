import util.Assert;

/* LeetCode 416 — Partition Equal Subset Sum [Medium] | Tópico: 1-D Dynamic Programming
 * Padrão: DP 1D (0/1 knapsack: existe subconjunto com soma == total/2?)
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
public class PartitionEqualSubsetSum {

    public static void main(String[] args) {
        Assert.isTrue(canPartition(new int[]{1, 5, 11, 5}), "{1,5,5} e {11}, ambos somam 11");
        Assert.isTrue(!canPartition(new int[]{1, 2, 3, 5}), "soma total 11, impar, impossivel dividir");
        Assert.isTrue(!canPartition(new int[]{1}), "um elemento so, impossivel dividir ao meio");
        Assert.isTrue(canPartition(new int[]{1, 1}), "{1} e {1}, ambos somam 1");
        Assert.resumo();
    }

    static boolean canPartition(int[] nums) {
        throw new UnsupportedOperationException("TODO");
    }
}
