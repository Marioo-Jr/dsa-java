import util.Assert;

/* LeetCode 494 — Target Sum [Medium] | Tópico: 2-D Dynamic Programming
 * Padrão: DP 2D (contar formas de atribuir +/- que somam o alvo)
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
public class TargetSum {

    public static void main(String[] args) {
        Assert.equals(5, findTargetSumWays(new int[]{1, 1, 1, 1, 1}, 3), "5 formas de somar 3 com +/-1 cinco vezes");
        Assert.equals(1, findTargetSumWays(new int[]{1}, 1), "so '+1' bate com alvo 1");
        Assert.equals(2, findTargetSumWays(new int[]{0}, 0), "'+0' e '-0' ambos batem com alvo 0 -> 2 formas");
        Assert.equals(0, findTargetSumWays(new int[]{1, 2, 3}, 100), "alvo impossivel de alcancar");
        Assert.resumo();
    }

    static int findTargetSumWays(int[] nums, int target) {
        throw new UnsupportedOperationException("TODO");
    }
}
