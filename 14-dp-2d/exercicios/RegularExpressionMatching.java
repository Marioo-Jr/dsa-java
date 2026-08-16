import util.Assert;

/* LeetCode 10 — Regular Expression Matching [Hard] | Tópico: 2-D Dynamic Programming
 * Padrão: DP 2D (dp[i][j] = s[0..i) casa com p[0..j)? suporte a '.' e '*')
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
public class RegularExpressionMatching {

    public static void main(String[] args) {
        Assert.isTrue(!isMatch("aa", "a"), "'a' nao casa toda a string 'aa'");
        Assert.isTrue(isMatch("aa", "a*"), "'a*' vira zero-ou-mais 'a' -> casa 'aa'");
        Assert.isTrue(isMatch("ab", ".*"), "'.*' casa qualquer coisa");
        Assert.isTrue(isMatch("aab", "c*a*b"), "'c*' vira zero 'c', 'a*' vira 'aa', depois 'b'");
        Assert.isTrue(isMatch("", ""), "ambas vazias -> casa");
        Assert.isTrue(isMatch("", "a*"), "'a*' pode virar zero 'a' -> casa string vazia");
        Assert.isTrue(!isMatch("", "a"), "padrao 'a' nao casa string vazia");
        Assert.resumo();
    }

    static boolean isMatch(String s, String p) {
        throw new UnsupportedOperationException("TODO");
    }
}
