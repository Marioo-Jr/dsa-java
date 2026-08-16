import util.Assert;

/* LeetCode 167 — Two Sum II Input Array Is Sorted [Medium] | Tópico: Two Pointers
 * Padrão: dois ponteiros nas pontas (array já ordenado)
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
public class TwoSumII {

    public static void main(String[] args) {
        Assert.arrayEquals(new int[]{1, 2}, twoSum(new int[]{2, 7, 11, 15}, 9), "básico");
        Assert.arrayEquals(new int[]{1, 3}, twoSum(new int[]{2, 3, 4}, 6), "pula o do meio");
        Assert.arrayEquals(new int[]{1, 2}, twoSum(new int[]{-1, 0}, -1), "com negativos");
        Assert.resumo();
    }

    // Índices retornados são 1-INDEXED (convenção do problema no LeetCode).
    // Garantido exatamente uma solução; não pode usar o mesmo elemento duas vezes.
    static int[] twoSum(int[] numbers, int target) {
        throw new UnsupportedOperationException("TODO");
    }
}
