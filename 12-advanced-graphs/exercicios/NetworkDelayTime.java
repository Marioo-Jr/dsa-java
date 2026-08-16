import util.Assert;

/* LeetCode 743 — Network Delay Time [Medium] | Tópico: Advanced Graphs
 * Padrão: Dijkstra
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
public class NetworkDelayTime {

    public static void main(String[] args) {
        int[][] times1 = {{2, 1, 1}, {2, 3, 1}, {3, 4, 1}};
        Assert.equals(2, networkDelayTime(times1, 4, 2), "sinal alcança todos em 2 (nós 3 e 4 pelo caminho mais longo)");

        int[][] times2 = {{1, 2, 1}};
        Assert.equals(1, networkDelayTime(times2, 2, 1), "sinal de 1 alcança 2 em 1 unidade");

        int[][] times3 = {{1, 2, 1}};
        Assert.equals(-1, networkDelayTime(times3, 2, 2), "não existe aresta saindo de 2, nó 1 inalcançável");

        Assert.resumo();
    }

    static int networkDelayTime(int[][] times, int n, int k) {
        throw new UnsupportedOperationException("TODO");
    }
}
