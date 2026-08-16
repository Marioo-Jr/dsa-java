import util.Assert;

/* LeetCode 1851 — Minimum Interval to Include Each Query [Hard] | Tópico: Intervals
 * Padrão: ordenar intervalos por início + queries por valor, min-heap por tamanho do intervalo (sweep line)
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
public class MinimumIntervalToIncludeEachQuery {

    public static void main(String[] args) {
        Assert.arrayEquals(
                new int[]{3, 3, 1, 4},
                minInterval(new int[][]{{1, 4}, {2, 4}, {3, 6}, {4, 4}}, new int[]{2, 3, 4, 5}),
                "cada query casa com o menor intervalo que a contém");

        Assert.arrayEquals(
                new int[]{2, -1, 4, 6},
                minInterval(new int[][]{{2, 3}, {2, 5}, {1, 8}, {20, 25}}, new int[]{2, 19, 5, 22}),
                "query 19 não é coberta por nenhum intervalo -> -1");

        Assert.arrayEquals(
                new int[]{-1},
                minInterval(new int[][]{{1, 3}}, new int[]{10}),
                "query fora de qualquer intervalo");
        Assert.resumo();
    }

    static int[] minInterval(int[][] intervals, int[] queries) {
        throw new UnsupportedOperationException("TODO");
    }
}
