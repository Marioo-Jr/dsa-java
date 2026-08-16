import util.Assert;
import java.util.Arrays;

/* LeetCode 347 — Top K Frequent Elements [Medium] | Tópico: Arrays & Hashing
 * Padrão: HashMap de frequência + Bucket Sort (ou Heap)
 * ⚠️ Não coberto pela playlist do Nick White — ver fallback em PLAYLIST_INDEX.md
 *
 * MINHA IDEIA (escrever ANTES de codar):
 *   1.
 *   2.
 *   3.
 *
 * Complexidade:  tempo O(?)  espaço O(?)
 * (o objetivo é bater melhor que O(n log n) — pense em por que sort não é ótimo aqui)
 * Status: sozinho | com dica | viu o vídeo
 */
public class TopKFrequentElements {

    public static void main(String[] args) {
        int[] resultado = topKFrequent(new int[]{1, 1, 1, 2, 2, 3}, 2);
        Arrays.sort(resultado); // ordem de saída não é garantida pelo problema
        Assert.arrayEquals(new int[]{1, 2}, resultado, "os 2 mais frequentes");

        int[] resultado2 = topKFrequent(new int[]{1}, 1);
        Assert.arrayEquals(new int[]{1}, resultado2, "único elemento, k=1");

        Assert.resumo();
    }

    static int[] topKFrequent(int[] nums, int k) {
        throw new UnsupportedOperationException("TODO");
    }
}
