import util.Assert;
import java.util.Arrays;

/* LeetCode 973 — K Closest Points to Origin [Medium] | Tópico: Heap / Priority Queue
 * Padrão: max-heap de tamanho k (por distância euclidiana ao quadrado)
 *
 * MINHA IDEIA (escrever ANTES de codar):
 *   1.
 *   2.
 *   3.
 *
 * Complexidade:  tempo O(n log k)  espaço O(k)
 * Status: sozinho | com dica | viu o vídeo
 * Vídeo: ver PLAYLIST_INDEX.md
 */
public class KClosestPointsToOrigin {

    public static void main(String[] args) {
        // ordena para comparar independente da ordem de saída do heap
        int[][] r1 = kClosest(new int[][]{{1, 3}, {-2, 2}}, 1);
        Arrays.sort(r1, (a, b) -> a[0] != b[0] ? a[0] - b[0] : a[1] - b[1]);
        Assert.arrayEquals(new int[]{-2, 2}, r1[0], "k=1, ponto mais próximo é (-2,2)");
        Assert.equals(1, r1.length, "k=1 retorna 1 ponto");

        int[][] r2 = kClosest(new int[][]{{3, 3}, {5, -1}, {-2, 4}}, 2);
        Arrays.sort(r2, (a, b) -> a[0] != b[0] ? a[0] - b[0] : a[1] - b[1]);
        Assert.arrayEquals(new int[]{-2, 4}, r2[0], "k=2, primeiro mais próximo (-2,4)");
        Assert.arrayEquals(new int[]{3, 3}, r2[1], "k=2, segundo mais próximo (3,3)");

        int[][] r3 = kClosest(new int[][]{{0, 1}}, 1);
        Assert.arrayEquals(new int[]{0, 1}, r3[0], "único ponto disponível");

        int[][] r4 = kClosest(new int[][]{{1, 1}, {2, 2}, {3, 3}}, 3);
        Assert.equals(3, r4.length, "k igual ao total de pontos retorna todos");

        Assert.resumo();
    }

    static int[][] kClosest(int[][] points, int k) {
        throw new UnsupportedOperationException("TODO");
    }
}
