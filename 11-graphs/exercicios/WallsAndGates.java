import util.Assert;

/* LeetCode 286 — Walls And Gates [Medium] | Tópico: Graphs
 * Padrão: Multi-source BFS
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
public class WallsAndGates {

    static final int INF = Integer.MAX_VALUE;

    public static void main(String[] args) {
        int[][] rooms = {
                {INF, -1, 0, INF},
                {INF, INF, INF, -1},
                {INF, -1, INF, -1},
                {0, -1, INF, INF}
        };
        int[][] esperado = {
                {3, -1, 0, 1},
                {2, 2, 1, -1},
                {1, -1, 2, -1},
                {0, -1, 3, 4}
        };

        wallsAndGates(rooms);
        for (int i = 0; i < rooms.length; i++) {
            Assert.arrayEquals(esperado[i], rooms[i], "linha " + i + " preenchida com distância até o portão");
        }

        int[][] semPortao = {
                {INF, INF},
                {INF, INF}
        };
        int[][] esperadoSemPortao = {
                {INF, INF},
                {INF, INF}
        };
        wallsAndGates(semPortao);
        Assert.arrayEquals(esperadoSemPortao[0], semPortao[0], "sem portão, quartos continuam INF (linha 0)");
        Assert.arrayEquals(esperadoSemPortao[1], semPortao[1], "sem portão, quartos continuam INF (linha 1)");

        Assert.resumo();
    }

    static void wallsAndGates(int[][] rooms) {
        throw new UnsupportedOperationException("TODO");
    }
}
