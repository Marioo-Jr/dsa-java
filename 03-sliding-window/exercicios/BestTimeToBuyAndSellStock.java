import util.Assert;

/* LeetCode 121 — Best Time to Buy And Sell Stock [Easy] | Tópico: Sliding Window
 * Padrão: janela variável — mantém o menor preço visto até agora
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
public class BestTimeToBuyAndSellStock {

    public static void main(String[] args) {
        Assert.equals(5, maxProfit(new int[]{7, 1, 5, 3, 6, 4}), "compra em 1, vende em 6");
        Assert.equals(0, maxProfit(new int[]{7, 6, 4, 3, 1}), "preço só cai, nenhum lucro possível");
        Assert.equals(0, maxProfit(new int[]{5}), "um único dia, sem transação possível");
        Assert.resumo();
    }

    // Uma única transação (comprar uma vez, vender depois). Retorna o lucro
    // máximo possível, ou 0 se não houver lucro.
    static int maxProfit(int[] prices) {
        throw new UnsupportedOperationException("TODO");
    }
}
