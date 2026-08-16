import util.Assert;

/* LeetCode 518 — Coin Change II [Medium] | Tópico: 2-D Dynamic Programming
 * Padrão: DP 2D (unbounded knapsack: CONTAR combinacoes, nao minimizar)
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
public class CoinChangeII {

    public static void main(String[] args) {
        Assert.equals(4, change(5, new int[]{1, 2, 5}), "5 = 5 | 2+2+1 | 2+1+1+1 | 1*5 -> 4 combinacoes");
        Assert.equals(0, change(3, new int[]{2}), "impossivel formar 3 so com moedas de 2");
        Assert.equals(1, change(10, new int[]{10}), "so 1 jeito: uma moeda de 10");
        Assert.equals(1, change(0, new int[]{1, 2, 5}), "alvo 0: 1 combinacao (nao usar nenhuma moeda)");
        Assert.resumo();
    }

    static int change(int amount, int[] coins) {
        throw new UnsupportedOperationException("TODO");
    }
}
