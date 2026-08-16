import util.Assert;

/* LeetCode 695 — Max Area of Island [Medium] | Tópico: Graphs
 * Padrão: Matrix DFS/BFS (flood fill)
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
public class MaxAreaOfIsland {

    public static void main(String[] args) {
        int[][] grid1 = {
                {1, 1, 0, 0},
                {1, 1, 0, 0},
                {0, 0, 0, 1},
                {0, 0, 0, 1}
        };
        Assert.equals(4, maxAreaOfIsland(grid1), "ilha 2x2 é a maior");

        int[][] grid2 = {
                {0, 0, 0},
                {0, 0, 0}
        };
        Assert.equals(0, maxAreaOfIsland(grid2), "sem ilhas, área máxima 0");

        int[][] grid3 = {
                {1, 1, 1},
                {1, 1, 1},
                {1, 1, 1}
        };
        Assert.equals(9, maxAreaOfIsland(grid3), "grid inteiro é uma ilha só");

        Assert.resumo();
    }

    static int maxAreaOfIsland(int[][] grid) {
        throw new UnsupportedOperationException("TODO");
    }
}
