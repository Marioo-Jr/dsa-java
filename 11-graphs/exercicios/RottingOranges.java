import util.Assert;

/* LeetCode 994 — Rotting Oranges [Medium] | Tópico: Graphs
 * Padrão: Multi-source BFS
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
public class RottingOranges {

    public static void main(String[] args) {
        int[][] grid1 = {
                {2, 1, 1},
                {1, 1, 0},
                {0, 1, 1}
        };
        Assert.equals(4, orangesRotting(grid1), "todas apodrecem em 4 minutos");

        int[][] grid2 = {
                {2, 1, 1},
                {0, 1, 1},
                {1, 0, 1}
        };
        Assert.equals(-1, orangesRotting(grid2), "laranja isolada nunca apodrece");

        int[][] grid3 = {
                {0, 2}
        };
        Assert.equals(0, orangesRotting(grid3), "sem laranjas frescas, 0 minutos");

        Assert.resumo();
    }

    static int orangesRotting(int[][] grid) {
        throw new UnsupportedOperationException("TODO");
    }
}
