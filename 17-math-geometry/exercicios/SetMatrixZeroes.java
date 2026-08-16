import util.Assert;

/* LeetCode 73 — Set Matrix Zeroes [Medium] | Tópico: Math & Geometry
 * Padrão: usar a própria primeira linha/coluna como marcadores, mais 1 flag para a primeira coluna
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
public class SetMatrixZeroes {

    public static void main(String[] args) {
        int[][] m1 = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
        setZeroes(m1);
        Assert.isTrue(java.util.Arrays.deepEquals(new int[][]{{1, 0, 1}, {0, 0, 0}, {1, 0, 1}}, m1), "um único zero no meio");

        int[][] m2 = {{0, 1, 2, 0}, {3, 4, 5, 2}, {1, 3, 1, 5}};
        setZeroes(m2);
        Assert.isTrue(java.util.Arrays.deepEquals(new int[][]{{0, 0, 0, 0}, {0, 4, 5, 0}, {0, 3, 1, 0}}, m2), "dois zeros na primeira linha");

        int[][] m3 = {{1}};
        setZeroes(m3);
        Assert.isTrue(java.util.Arrays.deepEquals(new int[][]{{1}}, m3), "matriz 1x1 sem zero, nada muda");
        Assert.resumo();
    }

    static void setZeroes(int[][] matrix) {
        throw new UnsupportedOperationException("TODO");
    }
}
