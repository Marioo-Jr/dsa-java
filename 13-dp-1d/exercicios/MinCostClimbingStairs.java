import util.Assert;

/* LeetCode 746 — Min Cost Climbing Stairs [Easy] | Tópico: 1-D Dynamic Programming
 * Padrão: DP 1D
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
public class MinCostClimbingStairs {

    public static void main(String[] args) {
        Assert.equals(15, minCostClimbingStairs(new int[]{10, 15, 20}), "comeca no indice 1, paga 15, pula pro topo");
        Assert.equals(6, minCostClimbingStairs(new int[]{1, 100, 1, 1, 1, 100, 1, 1, 100, 1}), "caminho de custo minimo 6");
        Assert.equals(0, minCostClimbingStairs(new int[]{0, 0, 0, 0}), "todos os custos zero");
        Assert.resumo();
    }

    static int minCostClimbingStairs(int[] cost) {
        throw new UnsupportedOperationException("TODO");
    }
}
