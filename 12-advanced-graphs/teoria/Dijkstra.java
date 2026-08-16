import util.Assert;
import java.util.*;

/* 12 — Advanced Graphs | Teoria: Dijkstra's Algorithm
 * Lição de referência: NeetCode Advanced Algorithms → "Dijkstra's Algorithm"
 *
 * IDEIA: para achar a menor distância da origem até todo mundo num grafo
 * com pesos NÃO-NEGATIVOS, sempre expanda o nó não-finalizado de menor
 * distância conhecida (um min-heap resolve isso em O(log n)). Ao expandir
 * um nó, tente relaxar (melhorar) a distância dos vizinhos. Diferente de
 * BFS puro, aqui a ordem de expansão é por distância acumulada, não por
 * número de arestas — por isso o heap, e não uma fila simples.
 *
 * Usar PriorityQueue do Java é aceitável aqui: o foco da lição é o
 * algoritmo de Dijkstra em si, não reimplementar um heap do zero de novo.
 *
 * ANTES DE CODAR, escreva aqui sua ideia em 3 linhas:
 *   1.
 *   2.
 *   3.
 */
public class Dijkstra {

    // edges: cada linha é {origem, destino, peso}, grafo DIRECIONADO.
    // Retorna dist[i] = menor distância de src até i, ou -1 se inalcançável.
    // TODO: monte a lista de adjacência, use um PriorityQueue<int[]>
    // ordenado por distância acumulada, e relaxe as arestas ao processar
    // cada nó (ignorando entradas obsoletas do heap).
    static int[] dijkstra(int n, int[][] edges, int src) {
        throw new UnsupportedOperationException("TODO");
    }

    public static void main(String[] args) {
        int[][] edges = {
                {0, 1, 4}, {0, 2, 1}, {2, 1, 2}, {1, 3, 1}, {2, 3, 5}, {3, 4, 3}
        };
        int[] esperado = {0, 3, 1, 4, 7};
        Assert.arrayEquals(esperado, dijkstra(5, edges, 0), "menor caminho a partir de 0 (via 0->2->1 mais barato que 0->1)");

        int[][] edgesDesconexo = {{0, 1, 5}};
        int[] esperadoDesconexo = {0, 5, -1};
        Assert.arrayEquals(esperadoDesconexo, dijkstra(3, edgesDesconexo, 0), "nó 2 inalcançável fica com -1");

        Assert.resumo();
    }
}
