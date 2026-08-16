import util.Assert;
import java.util.List;

/* LeetCode 78 — Subsets [Medium] | Tópico: Backtracking
 * Padrão: escolher / explorar / desfazer (incluir ou não cada elemento)
 *
 * MINHA IDEIA (escrever ANTES de codar):
 *   1.
 *   2.
 *   3.
 *
 * Complexidade:  tempo O(n * 2^n)  espaço O(n) de recursão (fora a saída)
 * Status: sozinho | com dica | viu o vídeo
 * Vídeo: ver PLAYLIST_INDEX.md
 */
public class Subsets {

    public static void main(String[] args) {
        List<List<Integer>> r1 = subsets(new int[]{1, 2, 3});
        Assert.equals(8, r1.size(), "n=3 -> 2^3 = 8 subconjuntos");
        Assert.isTrue(r1.contains(List.of()), "contém o conjunto vazio");
        Assert.isTrue(r1.contains(List.of(1, 2, 3)), "contém o conjunto completo");
        Assert.isTrue(r1.contains(List.of(1)), "contém subconjunto unitário [1]");
        Assert.isTrue(r1.contains(List.of(2, 3)), "contém subconjunto [2,3]");

        List<List<Integer>> r2 = subsets(new int[]{0});
        Assert.equals(2, r2.size(), "n=1 -> 2 subconjuntos");
        Assert.isTrue(r2.contains(List.of()) && r2.contains(List.of(0)), "n=1 contém [] e [0]");

        Assert.resumo();
    }

    static List<List<Integer>> subsets(int[] nums) {
        throw new UnsupportedOperationException("TODO");
    }
}
