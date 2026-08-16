import util.Assert;

/* LeetCode 684 — Redundant Connection [Medium] | Tópico: Graphs
 * Padrão: Union-Find — a aresta redundante é a primeira que conecta dois nós já no mesmo componente
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
public class RedundantConnection {

    public static void main(String[] args) {
        Assert.arrayEquals(new int[]{2, 3},
                findRedundantConnection(new int[][]{{1, 2}, {1, 3}, {2, 3}}), "triângulo 1-2-3, redundante fecha o ciclo");

        Assert.arrayEquals(new int[]{1, 4},
                findRedundantConnection(new int[][]{{1, 2}, {2, 3}, {3, 4}, {1, 4}, {1, 5}}),
                "cadeia 1-2-3-4 + 1-4 fecha ciclo, 1-5 é galho");

        Assert.resumo();
    }

    static int[] findRedundantConnection(int[][] edges) {
        throw new UnsupportedOperationException("TODO");
    }
}
