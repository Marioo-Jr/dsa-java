import util.Assert;

/* LeetCode 115 — Distinct Subsequences [Hard] | Tópico: 2-D Dynamic Programming
 * Padrão: DP 2D (dp[i][j] = num de formas de s[0..i) formar t[0..j))
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
public class DistinctSubsequences {

    public static void main(String[] args) {
        Assert.equals(3, numDistinct("rabbbit", "rabbit"), "3 formas de escolher 'rabbit' em 'rabbbit'");
        Assert.equals(5, numDistinct("babgbag", "bag"), "5 formas de escolher 'bag' em 'babgbag'");
        Assert.equals(1, numDistinct("abc", ""), "subsequencia vazia: sempre 1 forma (nao escolher nada)");
        Assert.equals(0, numDistinct("", "a"), "s vazia nao pode formar t nao vazio");
        Assert.resumo();
    }

    static int numDistinct(String s, String t) {
        throw new UnsupportedOperationException("TODO");
    }
}
