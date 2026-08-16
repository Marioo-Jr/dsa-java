import util.Assert;
import java.util.List;

/* LeetCode 46 — Permutations [Medium] | Tópico: Backtracking
 * Padrão: escolher / explorar / desfazer com marcação de "usado"
 *
 * MINHA IDEIA (escrever ANTES de codar):
 *   1.
 *   2.
 *   3.
 *
 * Complexidade:  tempo O(n * n!)  espaço O(n) de recursão (fora a saída)
 * Status: sozinho | com dica | viu o vídeo
 * Vídeo: ver PLAYLIST_INDEX.md
 */
public class Permutations {

    public static void main(String[] args) {
        List<List<Integer>> r1 = permute(new int[]{1, 2, 3});
        Assert.equals(6, r1.size(), "n=3 -> 3! = 6 permutações");
        Assert.isTrue(r1.contains(List.of(1, 2, 3)), "contém [1,2,3]");
        Assert.isTrue(r1.contains(List.of(3, 2, 1)), "contém [3,2,1]");
        Assert.isTrue(r1.contains(List.of(2, 1, 3)), "contém [2,1,3]");

        List<List<Integer>> r2 = permute(new int[]{0, 1});
        Assert.equals(2, r2.size(), "n=2 -> 2 permutações");

        List<List<Integer>> r3 = permute(new int[]{1});
        Assert.equals(1, r3.size(), "n=1 -> 1 permutação");
        Assert.isTrue(r3.contains(List.of(1)), "única permutação é [1]");

        Assert.resumo();
    }

    static List<List<Integer>> permute(int[] nums) {
        throw new UnsupportedOperationException("TODO");
    }
}
