import util.Assert;

/* LeetCode 1584 — Min Cost to Connect All Points [Medium] | Tópico: Advanced Graphs
 * Padrão: MST (Prim ou Kruskal) num grafo completo com peso = distância Manhattan
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
public class MinCostToConnectAllPoints {

    public static void main(String[] args) {
        int[][] points1 = {{0, 0}, {2, 2}, {3, 10}, {5, 2}, {7, 0}};
        Assert.equals(20, minCostConnectPoints(points1), "exemplo clássico LC 1584");

        int[][] points2 = {{3, 12}, {-2, 5}, {-4, 1}};
        Assert.equals(18, minCostConnectPoints(points2), "três pontos, soma das duas menores distâncias");

        int[][] pontoUnico = {{0, 0}};
        Assert.equals(0, minCostConnectPoints(pontoUnico), "um único ponto, custo zero");

        Assert.resumo();
    }

    static int minCostConnectPoints(int[][] points) {
        throw new UnsupportedOperationException("TODO");
    }
}
