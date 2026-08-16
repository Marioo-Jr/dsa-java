import util.Assert;

/* LeetCode 1 — Two Sum [Easy] | Tópico: Arrays & Hashing
 * Padrão: HashMap (valor -> índice)
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
public class TwoSum {

    public static void main(String[] args) {
        Assert.arrayEquals(new int[]{0, 1}, twoSum(new int[]{2, 7, 11, 15}, 9), "básico");
        Assert.arrayEquals(new int[]{1, 2}, twoSum(new int[]{3, 2, 4}, 6), "não é o primeiro par");
        Assert.arrayEquals(new int[]{0, 1}, twoSum(new int[]{3, 3}, 6), "valores repetidos");
        Assert.resumo();
    }

    // Retorna os ÍNDICES dos dois números que somam target.
    static int[] twoSum(int[] nums, int target) {
        throw new UnsupportedOperationException("TODO");
    }
}
