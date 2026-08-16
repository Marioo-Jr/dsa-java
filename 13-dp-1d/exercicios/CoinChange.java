import util.Assert;

/* LeetCode 322 — Coin Change [Medium] | Tópico: 1-D Dynamic Programming
 * Padrão: DP 1D (unbounded knapsack: minimizar numero de moedas)
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
public class CoinChange {

    public static void main(String[] args) {
        Assert.equals(3, coinChange(new int[]{1, 2, 5}, 11), "11 = 5+5+1 -> 3 moedas");
        Assert.equals(-1, coinChange(new int[]{2}, 3), "impossivel formar 3 so com moedas de 2");
        Assert.equals(0, coinChange(new int[]{1}, 0), "alvo 0 -> 0 moedas");
        Assert.equals(1, coinChange(new int[]{1}, 1), "1 moeda de 1");
        Assert.resumo();
    }

    static int coinChange(int[] coins, int amount) {
        throw new UnsupportedOperationException("TODO");
    }
}
