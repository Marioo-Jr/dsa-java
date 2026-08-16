import util.Assert;

/* LeetCode 778 — Swim In Rising Water [Hard] | Tópico: Advanced Graphs
 * Padrão: Dijkstra-like com min-heap (minimiza o MAIOR obstáculo do caminho, não a soma)
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
public class SwimInRisingWater {

    public static void main(String[] args) {
        int[][] grid1 = {
                {0, 2},
                {1, 3}
        };
        Assert.equals(3, swimInWater(grid1), "precisa esperar até o tempo 3 para atravessar");

        int[][] grid2 = {
                {0, 1, 2, 3, 4},
                {24, 23, 22, 21, 5},
                {12, 13, 14, 15, 16},
                {11, 17, 18, 19, 20},
                {10, 9, 8, 7, 6}
        };
        Assert.equals(16, swimInWater(grid2), "exemplo clássico LC 778, espiral 5x5");

        Assert.resumo();
    }

    static int swimInWater(int[][] grid) {
        throw new UnsupportedOperationException("TODO");
    }
}
