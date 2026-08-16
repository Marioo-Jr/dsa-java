import util.Assert;

/* LeetCode 787 — Cheapest Flights Within K Stops [Medium] | Tópico: Advanced Graphs
 * Padrão: Bellman-Ford (relaxação limitada a k+1 arestas) ou Dijkstra com estado (nó, paradas)
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
public class CheapestFlightsWithinKStops {

    public static void main(String[] args) {
        int[][] flights1 = {{0, 1, 100}, {1, 2, 100}, {2, 0, 100}, {1, 3, 600}, {2, 3, 200}};
        Assert.equals(700, findCheapestPrice(4, flights1, 0, 3, 1), "0->1->3 com 1 parada, custo 700");

        int[][] flights2 = {{0, 1, 100}, {1, 2, 100}, {0, 2, 500}};
        Assert.equals(200, findCheapestPrice(3, flights2, 0, 2, 1), "0->1->2 com 1 parada é mais barato que direto");

        int[][] flights3 = {{0, 1, 100}, {1, 2, 100}, {0, 2, 500}};
        Assert.equals(500, findCheapestPrice(3, flights3, 0, 2, 0), "sem paradas, só o voo direto 0->2 serve");

        int[][] flights4 = {{0, 1, 100}};
        Assert.equals(-1, findCheapestPrice(3, flights4, 0, 2, 5), "nó 2 inalcançável mesmo com paradas de sobra");

        Assert.resumo();
    }

    static int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        throw new UnsupportedOperationException("TODO");
    }
}
