import util.Assert;
import java.util.List;

/* LeetCode 131 — Palindrome Partitioning [Medium] | Tópico: Backtracking
 * Padrão: escolher / explorar / desfazer, cortando prefixos que sejam palíndromos
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
public class PalindromePartitioning {

    public static void main(String[] args) {
        List<List<String>> r1 = partition("aab");
        Assert.equals(2, r1.size(), "'aab' -> 2 partições de palíndromos");
        Assert.isTrue(r1.contains(List.of("a", "a", "b")), "contém [a,a,b]");
        Assert.isTrue(r1.contains(List.of("aa", "b")), "contém [aa,b]");

        List<List<String>> r2 = partition("a");
        Assert.equals(1, r2.size(), "'a' -> 1 partição");
        Assert.isTrue(r2.contains(List.of("a")), "única partição é [a]");

        List<List<String>> r3 = partition("aba");
        Assert.equals(2, r3.size(), "'aba' -> 2 partições");
        Assert.isTrue(r3.contains(List.of("a", "b", "a")), "contém [a,b,a]");
        Assert.isTrue(r3.contains(List.of("aba")), "contém [aba]");

        Assert.resumo();
    }

    static List<List<String>> partition(String s) {
        throw new UnsupportedOperationException("TODO");
    }
}
