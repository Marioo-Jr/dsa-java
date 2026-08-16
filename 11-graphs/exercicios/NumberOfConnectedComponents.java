import util.Assert;

/* LeetCode 323 — Number of Connected Components In An Undirected Graph [Medium] | Tópico: Graphs
 * Padrão: Union-Find (ou DFS/BFS contando componentes)
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
public class NumberOfConnectedComponents {

    public static void main(String[] args) {
        Assert.equals(2, countComponents(5, new int[][]{{0, 1}, {1, 2}, {3, 4}}), "dois componentes");
        Assert.equals(1, countComponents(5, new int[][]{{0, 1}, {1, 2}, {2, 3}, {3, 4}}), "um componente conectando tudo");
        Assert.equals(4, countComponents(4, new int[][]{}), "sem arestas, cada nó é seu próprio componente");
        Assert.equals(1, countComponents(1, new int[][]{}), "um único vértice é um componente");

        Assert.resumo();
    }

    static int countComponents(int n, int[][] edges) {
        throw new UnsupportedOperationException("TODO");
    }
}
