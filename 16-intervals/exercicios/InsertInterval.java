import util.Assert;

/* LeetCode 57 — Insert Interval [Medium] | Tópico: Intervals
 * Padrão: percorrer e separar em 3 blocos — antes (sem overlap), mescla (overlap), depois (sem overlap)
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
public class InsertInterval {

    public static void main(String[] args) {
        Assert.isTrue(java.util.Arrays.deepEquals(
                new int[][]{{1, 5}, {6, 9}},
                insert(new int[][]{{1, 3}, {6, 9}}, new int[]{2, 5})), "mescla com [1,3]");

        Assert.isTrue(java.util.Arrays.deepEquals(
                new int[][]{{1, 2}, {3, 10}, {12, 16}},
                insert(new int[][]{{1, 2}, {3, 5}, {6, 7}, {8, 10}, {12, 16}}, new int[]{4, 8})), "mescla com vários intervalos do meio");

        Assert.isTrue(java.util.Arrays.deepEquals(
                new int[][]{{5, 7}},
                insert(new int[][]{}, new int[]{5, 7})), "lista de intervalos vazia");

        Assert.isTrue(java.util.Arrays.deepEquals(
                new int[][]{{1, 3}, {4, 6}},
                insert(new int[][]{{1, 3}}, new int[]{4, 6})), "sem overlap, insere no fim");
        Assert.resumo();
    }

    static int[][] insert(int[][] intervals, int[] newInterval) {
        throw new UnsupportedOperationException("TODO");
    }
}
