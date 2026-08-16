import util.Assert;

/* LeetCode 210 — Course Schedule II [Medium] | Tópico: Graphs
 * Padrão: Ordenação topológica (Kahn's/BFS com grau de entrada, ou DFS + pilha)
 *
 * MINHA IDEIA (escrever ANTES de codar):
 *   1.
 *   2.
 *   3.
 *
 * Complexidade:  tempo O(?)  espaço O(?)
 * Status: sozinho | com dica | viu o vídeo
 * Vídeo: ver PLAYLIST_INDEX.md
 *
 * NOTA DE TESTE: quando existe mais de uma ordem topológica válida, o
 * LeetCode aceita qualquer uma — mas aqui usamos grafos em CADEIA (sem
 * ambiguidade) para poder comparar arrays exatos com Assert.arrayEquals.
 */
public class CourseScheduleII {

    public static void main(String[] args) {
        // cadeia única: 0 -> 1 (1 depende de 0)
        Assert.arrayEquals(new int[]{0, 1}, findOrder(2, new int[][]{{1, 0}}), "ordem única com 2 cursos");

        // cadeia única: 0 -> 1 -> 2 -> 3
        Assert.arrayEquals(new int[]{0, 1, 2, 3},
                findOrder(4, new int[][]{{1, 0}, {2, 1}, {3, 2}}), "cadeia linear de 4 cursos");

        // ciclo: impossível
        Assert.arrayEquals(new int[]{}, findOrder(2, new int[][]{{1, 0}, {0, 1}}), "ciclo retorna array vazio");

        // sem pré-requisitos, curso único
        Assert.arrayEquals(new int[]{0}, findOrder(1, new int[][]{}), "curso único sem pré-requisitos");

        Assert.resumo();
    }

    static int[] findOrder(int numCourses, int[][] prerequisites) {
        throw new UnsupportedOperationException("TODO");
    }
}
