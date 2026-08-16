import util.Assert;

/* LeetCode 329 — Longest Increasing Path In a Matrix [Hard] | Tópico: 2-D Dynamic Programming
 * Padrão: DFS + memoization sobre grade 2D
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
public class LongestIncreasingPathInAMatrix {

    public static void main(String[] args) {
        Assert.equals(4, longestIncreasingPath(new int[][]{{9, 9, 4}, {6, 6, 8}, {2, 1, 1}}), "caminho 1,2,6,9 (tamanho 4)");
        Assert.equals(4, longestIncreasingPath(new int[][]{{3, 4, 5}, {3, 2, 6}, {2, 2, 1}}), "caminho 3,4,5,6 (tamanho 4)");
        Assert.equals(1, longestIncreasingPath(new int[][]{{1}}), "matriz de 1 celula");
        Assert.resumo();
    }

    static int longestIncreasingPath(int[][] matrix) {
        throw new UnsupportedOperationException("TODO");
    }
}
