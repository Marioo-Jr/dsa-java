import util.Assert;

/* LeetCode 309 — Best Time to Buy And Sell Stock With Cooldown [Medium] | Tópico: 2-D Dynamic Programming
 * Padrão: DP com estados (segurando ação / nao segurando / em cooldown)
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
public class BestTimeToBuyAndSellStockWithCooldown {

    public static void main(String[] args) {
        Assert.equals(3, maxProfit(new int[]{1, 2, 3, 0, 2}), "compra dia0 vende dia1 (lucro1), cooldown dia2, compra dia3 vende dia4 (lucro2): total 3");
        Assert.equals(0, maxProfit(new int[]{1}), "um dia so, nao da pra negociar");
        Assert.equals(0, maxProfit(new int[]{}), "array vazio");
        Assert.equals(3, maxProfit(new int[]{1, 2, 4}), "compra dia0 vende dia2: lucro 4-1=3 (melhor que vender no dia1)");
        Assert.resumo();
    }

    static int maxProfit(int[] prices) {
        throw new UnsupportedOperationException("TODO");
    }
}
