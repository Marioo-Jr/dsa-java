import util.Assert;
import java.util.*;

/* 12 — Advanced Graphs | Teoria: Kruskal's Algorithm
 * Lição de referência: NeetCode Advanced Algorithms → "Kruskal's Algorithm"
 *
 * IDEIA: Kruskal constrói a MST olhando as arestas em ordem CRESCENTE de
 * peso e adicionando cada uma se ela não formar ciclo — ou seja, se seus
 * dois extremos ainda não estiverem no mesmo componente. "Mesmo componente"
 * é exatamente a pergunta que Union-Find responde em quase O(1). Pare
 * quando tiver n-1 arestas na MST (ou quando as arestas acabarem — grafo
 * desconexo, sem MST).
 *
 * Este arquivo é autocontido: a estrutura de union-find é declarada aqui de
 * novo (mesma ideia de path compression + union by rank de UnionFind.java).
 *
 * ANTES DE CODAR, escreva aqui sua ideia em 3 linhas:
 *   1.
 *   2.
 *   3.
 */
public class Kruskal {

    private static int[] pai;
    private static int[] rank_;

    private static int find(int x) {
        throw new UnsupportedOperationException("TODO");
    }

    private static boolean union(int a, int b) {
        throw new UnsupportedOperationException("TODO");
    }

    // edges: cada linha é {u, v, peso}, grafo NÃO-DIRECIONADO.
    // Retorna o peso total da MST, ou -1 se o grafo for desconexo.
    // TODO: ordene as arestas por peso crescente; percorra somando ao total
    // e unindo os componentes sempre que union(u, v) conectar algo novo;
    // conte quantas arestas entraram e confira se deu n-1 no final.
    static int kruskalMST(int n, int[][] edges) {
        throw new UnsupportedOperationException("TODO");
    }

    public static void main(String[] args) {
        int[][] edges = {
                {0, 1, 4}, {0, 2, 1}, {1, 2, 2}, {1, 3, 5}, {2, 3, 8}, {2, 4, 10}, {3, 4, 2}
        };
        Assert.equals(10, kruskalMST(5, edges), "mesma MST de Prim.java no mesmo grafo: peso 10");

        int[][] edgesDesconexo = {{0, 1, 1}, {2, 3, 1}};
        Assert.equals(-1, kruskalMST(4, edgesDesconexo), "dois componentes separados, impossível formar MST");

        Assert.resumo();
    }
}
