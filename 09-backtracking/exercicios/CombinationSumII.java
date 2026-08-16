import util.Assert;
import java.util.List;

/* LeetCode 40 — Combination Sum II [Medium] | Tópico: Backtracking
 * Padrão: escolher / explorar / desfazer com array ordenado + pular duplicatas no mesmo nível
 *
 * MINHA IDEIA (escrever ANTES de codar):
 *   1.
 *   2.
 *   3.
 *
 * Complexidade:  tempo O(2^n)  espaço O(n) de recursão
 * Status: sozinho | com dica | viu o vídeo
 * Vídeo: ver PLAYLIST_INDEX.md
 */
public class CombinationSumII {

    public static void main(String[] args) {
        List<List<Integer>> r1 = combinationSum2(new int[]{10, 1, 2, 7, 6, 1, 5}, 8);
        Assert.equals(4, r1.size(), "exemplo clássico -> 4 combinações únicas");
        Assert.isTrue(r1.contains(List.of(1, 1, 6)), "contém [1,1,6]");
        Assert.isTrue(r1.contains(List.of(1, 2, 5)), "contém [1,2,5]");
        Assert.isTrue(r1.contains(List.of(1, 7)), "contém [1,7]");
        Assert.isTrue(r1.contains(List.of(2, 6)), "contém [2,6]");

        List<List<Integer>> r2 = combinationSum2(new int[]{2, 5, 2, 1, 2}, 5);
        Assert.equals(2, r2.size(), "candidatos com repetição -> 2 combinações únicas");
        Assert.isTrue(r2.contains(List.of(1, 2, 2)), "contém [1,2,2]");
        Assert.isTrue(r2.contains(List.of(5)), "contém [5]");

        List<List<Integer>> r3 = combinationSum2(new int[]{2}, 1);
        Assert.equals(0, r3.size(), "sem candidato possível -> lista vazia");

        Assert.resumo();
    }

    static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        throw new UnsupportedOperationException("TODO");
    }
}
