import java.util.Arrays;
import java.util.List;
import util.Assert;

/* LeetCode 139 — Word Break [Medium] | Tópico: 1-D Dynamic Programming
 * Padrão: DP 1D (dp[i] = prefixo s[0..i) e segmentavel?)
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
public class WordBreak {

    public static void main(String[] args) {
        Assert.isTrue(wordBreak("leetcode", Arrays.asList("leet", "code")), "'leet'+'code'");
        Assert.isTrue(wordBreak("applepenapple", Arrays.asList("apple", "pen")), "'apple'+'pen'+'apple'");
        Assert.isTrue(!wordBreak("catsandog", Arrays.asList("cats", "dog", "sand", "and", "cat")), "sobra 'og' sem match");
        Assert.isTrue(wordBreak("", Arrays.asList("a", "b")), "string vazia sempre segmentavel");
        Assert.resumo();
    }

    static boolean wordBreak(String s, List<String> wordDict) {
        throw new UnsupportedOperationException("TODO");
    }
}
