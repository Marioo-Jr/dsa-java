import util.Assert;

/* LeetCode 312 — Burst Balloons [Hard] | Tópico: 2-D Dynamic Programming
 * Padrão: DP em intervalos (dp[i][j] = melhor jeito de estourar tudo entre i e j)
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
public class BurstBalloons {

    public static void main(String[] args) {
        Assert.equals(167, maxCoins(new int[]{3, 1, 5, 8}), "exemplo classico: ordem 1,5,3,8 -> 167 moedas");
        Assert.equals(0, maxCoins(new int[]{}), "sem baloes, sem moedas");
        Assert.equals(7, maxCoins(new int[]{7}), "um balao so: 1*7*1=7");
        Assert.equals(20, maxCoins(new int[]{3, 5}), "estoura 3 primeiro (1*3*5=15), depois 5 (1*5*1=5): total 20 (melhor que estourar 5 primeiro, que da 18)");
        Assert.resumo();
    }

    static int maxCoins(int[] nums) {
        throw new UnsupportedOperationException("TODO");
    }
}
