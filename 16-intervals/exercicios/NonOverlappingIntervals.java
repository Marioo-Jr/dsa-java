import util.Assert;

/* LeetCode 435 — Non-overlapping Intervals [Medium] | Tópico: Intervals
 * Padrão: ordenar por fim, greedy — manter o intervalo que termina primeiro, remover o resto que causa overlap
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
public class NonOverlappingIntervals {

    public static void main(String[] args) {
        Assert.equals(1, eraseOverlapIntervals(new int[][]{{1, 2}, {2, 3}, {3, 4}, {1, 3}}), "remove [1,3] para eliminar overlap");
        Assert.equals(2, eraseOverlapIntervals(new int[][]{{1, 2}, {1, 2}, {1, 2}}), "remove 2 dos 3 duplicados");
        Assert.equals(0, eraseOverlapIntervals(new int[][]{{1, 2}, {2, 3}}), "intervalos que só se tocam não são overlap");
        Assert.equals(0, eraseOverlapIntervals(new int[][]{{1, 2}}), "único intervalo, nada a remover");
        Assert.resumo();
    }

    static int eraseOverlapIntervals(int[][] intervals) {
        throw new UnsupportedOperationException("TODO");
    }
}
