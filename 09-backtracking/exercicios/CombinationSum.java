import util.Assert;
import java.util.List;

/* LeetCode 39 — Combination Sum [Medium] | Tópico: Backtracking
 * Padrão: escolher / explorar / desfazer com reuso do mesmo elemento (não avança índice)
 *
 * MINHA IDEIA (escrever ANTES de codar):
 *   1.
 *   2.
 *   3.
 *
 * Complexidade:  tempo O(2^target) no pior caso  espaço O(target) de recursão
 * Status: sozinho | com dica | viu o vídeo
 * Vídeo: ver PLAYLIST_INDEX.md
 */
public class CombinationSum {

    public static void main(String[] args) {
        List<List<Integer>> r1 = combinationSum(new int[]{2, 3, 6, 7}, 7);
        Assert.equals(2, r1.size(), "candidates=[2,3,6,7], target=7 -> 2 combinações");
        Assert.isTrue(r1.contains(List.of(2, 2, 3)), "contém [2,2,3]");
        Assert.isTrue(r1.contains(List.of(7)), "contém [7]");

        List<List<Integer>> r2 = combinationSum(new int[]{2, 3, 5}, 8);
        Assert.equals(3, r2.size(), "candidates=[2,3,5], target=8 -> 3 combinações");
        Assert.isTrue(r2.contains(List.of(2, 2, 2, 2)), "contém [2,2,2,2]");
        Assert.isTrue(r2.contains(List.of(2, 3, 3)), "contém [2,3,3]");
        Assert.isTrue(r2.contains(List.of(3, 5)), "contém [3,5]");

        List<List<Integer>> r3 = combinationSum(new int[]{2}, 1);
        Assert.equals(0, r3.size(), "nenhum candidato menor ou igual ao target -> lista vazia");

        Assert.resumo();
    }

    static List<List<Integer>> combinationSum(int[] candidates, int target) {
        throw new UnsupportedOperationException("TODO");
    }
}
