import util.Assert;

/* LeetCode 1899 — Merge Triplets to Form Target Triplet [Medium] | Tópico: Greedy
 * Padrão: descartar triplets com componente > target; verificar se cada posição do target é coberta
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
public class MergeTripletsToFormTargetTriplet {

    public static void main(String[] args) {
        Assert.isTrue(mergeTriplets(
                new int[][]{{2, 5, 3}, {1, 8, 4}, {1, 7, 5}},
                new int[]{2, 7, 5}), "consegue montar [2,7,5]");
        Assert.isTrue(!mergeTriplets(
                new int[][]{{3, 4, 5}, {4, 4, 5}, {5, 2, 3}},
                new int[]{5, 5, 5}), "nenhum triplet tem posição 1 == 5 sem estourar outra posição");
        Assert.isTrue(mergeTriplets(
                new int[][]{{2, 5, 3}, {2, 3, 4}, {1, 2, 5}, {5, 2, 3}},
                new int[]{5, 5, 5}), "consegue montar [5,5,5] combinando 3 triplets");
        Assert.isTrue(mergeTriplets(
                new int[][]{{5, 5, 5}},
                new int[]{5, 5, 5}), "único triplet já é o target");
        Assert.resumo();
    }

    static boolean mergeTriplets(int[][] triplets, int[] target) {
        throw new UnsupportedOperationException("TODO");
    }
}
