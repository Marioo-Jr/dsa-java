import util.Assert;
import java.util.*;

/* LeetCode 417 — Pacific Atlantic Water Flow [Medium] | Tópico: Graphs
 * Padrão: Multi-source DFS/BFS a partir das bordas (de trás para frente)
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
public class PacificAtlanticWaterFlow {

    public static void main(String[] args) {
        int[][] heights = {
                {1, 2, 2, 3, 5},
                {3, 2, 3, 4, 4},
                {2, 4, 5, 3, 1},
                {6, 7, 1, 4, 5},
                {5, 1, 1, 2, 4}
        };
        Set<List<Integer>> esperado = new HashSet<>(Arrays.asList(
                Arrays.asList(0, 4), Arrays.asList(1, 3), Arrays.asList(1, 4),
                Arrays.asList(2, 2), Arrays.asList(3, 0), Arrays.asList(3, 1),
                Arrays.asList(4, 0)
        ));
        List<List<Integer>> resultado = pacificAtlantic(heights);
        Set<List<Integer>> resultadoSet = new HashSet<>(resultado);
        Assert.isTrue(resultadoSet.equals(esperado) && resultado.size() == esperado.size(),
                "células que alcançam os dois oceanos (exemplo clássico)");

        int[][] umaCelula = {{1}};
        List<List<Integer>> esperadoUmaCelula = Arrays.asList(Arrays.asList(0, 0));
        Assert.isTrue(new HashSet<>(pacificAtlantic(umaCelula)).equals(new HashSet<>(esperadoUmaCelula)),
                "grid 1x1 toca as duas bordas ao mesmo tempo");

        Assert.resumo();
    }

    static List<List<Integer>> pacificAtlantic(int[][] heights) {
        throw new UnsupportedOperationException("TODO");
    }
}
