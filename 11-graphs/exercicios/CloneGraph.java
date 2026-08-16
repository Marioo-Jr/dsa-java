import util.Assert;
import java.util.*;

/* LeetCode 133 — Clone Graph [Medium] | Tópico: Graphs
 * Padrão: DFS/BFS + HashMap (original -> cópia)
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
public class CloneGraph {

    static class Node {
        int val;
        List<Node> neighbors;

        Node(int val) {
            this.val = val;
            this.neighbors = new ArrayList<>();
        }
    }

    public static void main(String[] args) {
        // grafo quadrado: 1 - 2 - 3 - 4 - 1
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        n1.neighbors.addAll(Arrays.asList(n2, n4));
        n2.neighbors.addAll(Arrays.asList(n1, n3));
        n3.neighbors.addAll(Arrays.asList(n2, n4));
        n4.neighbors.addAll(Arrays.asList(n1, n3));

        Node clone = cloneGraph(n1);
        Assert.equals(1, clone.val, "valor do nó raiz preservado");
        Assert.isTrue(clone != n1, "clone é um objeto novo, não o mesmo nó");
        Assert.equals(2, clone.neighbors.size(), "raiz clonada tem 2 vizinhos");
        Assert.isTrue(clone.neighbors.get(0) != n2 && clone.neighbors.get(0) != n4,
                "vizinhos também são clonados, não reaproveitados");

        Node semGrafo = null;
        Assert.equals(null, cloneGraph(semGrafo), "grafo vazio (null) retorna null");

        Assert.resumo();
    }

    static Node cloneGraph(Node node) {
        throw new UnsupportedOperationException("TODO");
    }
}
