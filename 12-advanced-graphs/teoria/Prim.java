import util.Assert;

/* 12 — Advanced Graphs | Teoria: Prim's Algorithm
 * Lição de referência: NeetCode Advanced Algorithms → "Prim's Algorithm"
 *
 * IDEIA: Prim constrói a Árvore Geradora Mínima (MST) crescendo uma única
 * árvore a partir de um nó qualquer. A cada passo, olhe todas as arestas
 * que saem do conjunto de nós já na árvore e escolha a de MENOR peso que
 * leva a um nó de fora — um min-heap guardando (peso, nó) é a forma natural
 * de sempre pegar essa aresta mínima em O(log n). Repita até todos os nós
 * estarem na árvore, ou até esgotar as arestas (grafo desconexo → sem MST).
 *
 * ANTES DE CODAR, escreva aqui sua ideia em 3 linhas:
 *   1.
 *   2.
 *   3.
 */
public class Prim {

    // edges: cada linha é {u, v, peso}, grafo NÃO-DIRECIONADO.
    // Retorna o peso total da MST, ou -1 se o grafo for desconexo (não dá
    // pra conectar todos os n nós).
    // TODO: monte a lista de adjacência, comece do nó 0 com um min-heap de
    // (peso, nó), sempre expandindo a aresta mínima que alcança um nó novo.
    static int primMST(int n, int[][] edges) {
        throw new UnsupportedOperationException("TODO");
    }

    public static void main(String[] args) {
        int[][] edges = {
                {0, 1, 4}, {0, 2, 1}, {1, 2, 2}, {1, 3, 5}, {2, 3, 8}, {2, 4, 10}, {3, 4, 2}
        };
        Assert.equals(10, primMST(5, edges), "MST: (0-2,1)+(1-2,2)+(3-4,2)+(1-3,5) = 10");

        int[][] edgesDesconexo = {{0, 1, 1}};
        Assert.equals(-1, primMST(4, edgesDesconexo), "nós 2 e 3 isolados, impossível formar MST");

        Assert.resumo();
    }
}
