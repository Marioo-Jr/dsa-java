import util.Assert;

/* LeetCode 48 — Rotate Image [Medium] | Tópico: Math & Geometry
 * Padrão: transpor a matriz e depois inverter cada linha (in-place)
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
public class RotateImage {

    public static void main(String[] args) {
        int[][] m1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        rotate(m1);
        Assert.isTrue(java.util.Arrays.deepEquals(new int[][]{{7, 4, 1}, {8, 5, 2}, {9, 6, 3}}, m1), "rotaciona matriz 3x3 em 90 graus");

        int[][] m2 = {{1, 2}, {3, 4}};
        rotate(m2);
        Assert.isTrue(java.util.Arrays.deepEquals(new int[][]{{3, 1}, {4, 2}}, m2), "rotaciona matriz 2x2 em 90 graus");

        int[][] m3 = {{1}};
        rotate(m3);
        Assert.isTrue(java.util.Arrays.deepEquals(new int[][]{{1}}, m3), "matriz 1x1 não muda");
        Assert.resumo();
    }

    static void rotate(int[][] matrix) {
        throw new UnsupportedOperationException("TODO");
    }
}
