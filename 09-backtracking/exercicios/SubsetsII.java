import util.Assert;
import java.util.List;

/* LeetCode 90 — Subsets II [Medium] | Tópico: Backtracking
 * Padrão: escolher / explorar / desfazer com array ordenado + pular duplicatas no mesmo nível
 *
 * MINHA IDEIA (escrever ANTES de codar):
 *   1.
 *   2.
 *   3.
 *
 * Complexidade:  tempo O(n * 2^n)  espaço O(n) de recursão
 * Status: sozinho | com dica | viu o vídeo
 * Vídeo: ver PLAYLIST_INDEX.md
 */
public class SubsetsII {

    public static void main(String[] args) {
        List<List<Integer>> r1 = subsetsWithDup(new int[]{1, 2, 2});
        Assert.equals(6, r1.size(), "[1,2,2] -> 6 subconjuntos únicos");
        Assert.isTrue(r1.contains(List.of()), "contém []");
        Assert.isTrue(r1.contains(List.of(1)), "contém [1]");
        Assert.isTrue(r1.contains(List.of(2)), "contém [2]");
        Assert.isTrue(r1.contains(List.of(1, 2)), "contém [1,2]");
        Assert.isTrue(r1.contains(List.of(2, 2)), "contém [2,2]");
        Assert.isTrue(r1.contains(List.of(1, 2, 2)), "contém [1,2,2]");

        List<List<Integer>> r2 = subsetsWithDup(new int[]{0});
        Assert.equals(2, r2.size(), "n=1 -> 2 subconjuntos");

        Assert.resumo();
    }

    static List<List<Integer>> subsetsWithDup(int[] nums) {
        throw new UnsupportedOperationException("TODO");
    }
}
