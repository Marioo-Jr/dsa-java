import util.Assert;

/* LeetCode 54 — Spiral Matrix [Medium] | Tópico: Math & Geometry
 * Padrão: 4 fronteiras (top, bottom, left, right) que se movem para dentro a cada volta
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
public class SpiralMatrix {

    public static void main(String[] args) {
        Assert.equals(
                java.util.List.of(1, 2, 3, 6, 9, 8, 7, 4, 5),
                spiralOrder(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}),
                "matriz 3x3 quadrada");

        Assert.equals(
                java.util.List.of(1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7),
                spiralOrder(new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}}),
                "matriz 3x4 retangular");

        Assert.equals(java.util.List.of(1), spiralOrder(new int[][]{{1}}), "matriz 1x1");
        Assert.resumo();
    }

    static java.util.List<Integer> spiralOrder(int[][] matrix) {
        throw new UnsupportedOperationException("TODO");
    }
}
