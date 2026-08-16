import util.Assert;

/* LeetCode 56 — Merge Intervals [Medium] | Tópico: Intervals
 * Padrão: ordenar por início, varrer e mesclar quando início atual <= fim do último mesclado
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
public class MergeIntervals {

    public static void main(String[] args) {
        Assert.isTrue(java.util.Arrays.deepEquals(
                new int[][]{{1, 6}, {8, 10}, {15, 18}},
                merge(new int[][]{{1, 3}, {2, 6}, {8, 10}, {15, 18}})), "mescla [1,3] e [2,6]");

        Assert.isTrue(java.util.Arrays.deepEquals(
                new int[][]{{1, 5}},
                merge(new int[][]{{1, 4}, {4, 5}})), "intervalos que se tocam nas pontas também mesclam");

        Assert.isTrue(java.util.Arrays.deepEquals(
                new int[][]{{1, 4}},
                merge(new int[][]{{1, 4}})), "único intervalo, nada pra mesclar");
        Assert.resumo();
    }

    static int[][] merge(int[][] intervals) {
        throw new UnsupportedOperationException("TODO");
    }
}
