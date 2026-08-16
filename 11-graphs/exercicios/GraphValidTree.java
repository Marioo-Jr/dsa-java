import util.Assert;

/* LeetCode 261 — Graph Valid Tree [Medium] | Tópico: Graphs
 * Padrão: Union-Find (ou DFS) — uma árvore é um grafo conexo com exatamente n-1 arestas e sem ciclo
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
public class GraphValidTree {

    public static void main(String[] args) {
        Assert.isTrue(validTree(5, new int[][]{{0, 1}, {0, 2}, {0, 3}, {1, 4}}), "árvore válida, conexa e sem ciclo");
        Assert.isTrue(!validTree(5, new int[][]{{0, 1}, {1, 2}, {2, 3}, {1, 3}, {1, 4}}), "tem ciclo (1-2-3-1)");
        Assert.isTrue(validTree(1, new int[][]{}), "vértice único, sem arestas, é árvore trivial");
        Assert.isTrue(!validTree(4, new int[][]{{0, 1}, {2, 3}}), "desconexo não é árvore");
        Assert.isTrue(!validTree(2, new int[][]{}), "dois vértices sem aresta não é conexo");

        Assert.resumo();
    }

    static boolean validTree(int n, int[][] edges) {
        throw new UnsupportedOperationException("TODO");
    }
}
