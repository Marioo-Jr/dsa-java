import util.Assert;

/* LeetCode 200 — Number of Islands [Medium] | Tópico: Graphs
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
public class NumberOfIslands {

    public static void main(String[] args) {
        char[][] grid1 = {
                {'1', '1', '1', '1', '0'},
                {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '0', '0'}
        };
        Assert.equals(1, numIslands(grid1), "uma ilha grande conectada");

        char[][] grid2 = {
                {'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '1', '0', '0'},
                {'0', '0', '0', '1', '1'}
        };
        Assert.equals(3, numIslands(grid2), "três ilhas separadas");

        char[][] grid3 = {
                {'0', '0'},
                {'0', '0'}
        };
        Assert.equals(0, numIslands(grid3), "sem terra");

        Assert.resumo();
    }

    static int numIslands(char[][] grid) {
        throw new UnsupportedOperationException("TODO");
    }
}
