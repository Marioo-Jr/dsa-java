import util.Assert;

/* LeetCode 74 — Search a 2D Matrix [Medium] | Tópico: Binary Search
 * Padrão: tratar a matriz como um array ordenado "achatado" (índice 1D -> linha/coluna)
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
public class SearchA2DMatrix {

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 60}
        };
        Assert.isTrue(searchMatrix(matrix, 3), "está na primeira linha");
        Assert.isTrue(!searchMatrix(matrix, 13), "não existe, entre 11 e 16");
        Assert.isTrue(searchMatrix(matrix, 60), "último elemento da matriz");
        Assert.isTrue(searchMatrix(matrix, 1), "primeiro elemento da matriz");
        Assert.resumo();
    }

    // Cada linha está ordenada crescente, e o primeiro elemento de cada
    // linha é maior que o último elemento da linha anterior (equivalente a
    // um único array ordenado "quebrado" em linhas).
    static boolean searchMatrix(int[][] matrix, int target) {
        throw new UnsupportedOperationException("TODO");
    }
}
