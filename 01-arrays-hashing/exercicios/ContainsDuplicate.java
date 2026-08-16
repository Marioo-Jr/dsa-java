import util.Assert;

/* LeetCode 217 — Contains Duplicate [Easy] | Tópico: Arrays & Hashing
 * Padrão: HashSet
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
public class ContainsDuplicate {

    public static void main(String[] args) {
        Assert.isTrue(containsDuplicate(new int[]{1, 2, 3, 1}), "tem duplicado");
        Assert.isTrue(!containsDuplicate(new int[]{1, 2, 3, 4}), "sem duplicado");
        Assert.isTrue(containsDuplicate(new int[]{1, 1, 1, 3, 3, 4, 3, 2, 4, 2}), "vários duplicados");
        Assert.isTrue(!containsDuplicate(new int[]{}), "array vazio");
        Assert.resumo();
    }

    static boolean containsDuplicate(int[] nums) {
        throw new UnsupportedOperationException("TODO");
    }
}
