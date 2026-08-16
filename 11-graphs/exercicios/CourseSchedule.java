import util.Assert;

/* LeetCode 207 — Course Schedule [Medium] | Tópico: Graphs
 * Padrão: Detecção de ciclo em grafo direcionado (DFS com estados, ou Kahn's/BFS)
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
public class CourseSchedule {

    public static void main(String[] args) {
        Assert.isTrue(canFinish(2, new int[][]{{1, 0}}), "1 depende de 0, sem ciclo, dá pra terminar");
        Assert.isTrue(!canFinish(2, new int[][]{{1, 0}, {0, 1}}), "ciclo direto entre 0 e 1");
        Assert.isTrue(canFinish(1, new int[][]{}), "curso único sem pré-requisitos");
        Assert.isTrue(canFinish(4, new int[][]{{1, 0}, {2, 0}, {3, 1}, {3, 2}}), "DAG em diamante, sem ciclo");
        Assert.isTrue(!canFinish(3, new int[][]{{0, 1}, {1, 2}, {2, 0}}), "ciclo de tamanho 3");

        Assert.resumo();
    }

    static boolean canFinish(int numCourses, int[][] prerequisites) {
        throw new UnsupportedOperationException("TODO");
    }
}
