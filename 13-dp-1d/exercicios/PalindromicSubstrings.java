import util.Assert;

/* LeetCode 647 — Palindromic Substrings [Medium] | Tópico: 1-D Dynamic Programming
 * Padrão: DP 1D/2D (expandir a partir do centro, ou dp[i][j] = palindromo?)
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
public class PalindromicSubstrings {

    public static void main(String[] args) {
        Assert.equals(3, countSubstrings("abc"), "'a','b','c' -> 3 palindromos");
        Assert.equals(6, countSubstrings("aaa"), "'a','a','a','aa','aa','aaa' -> 6 palindromos");
        Assert.equals(1, countSubstrings("a"), "string de 1 char -> 1 palindromo");
        Assert.equals(0, countSubstrings(""), "string vazia -> 0 palindromos");
        Assert.resumo();
    }

    static int countSubstrings(String s) {
        throw new UnsupportedOperationException("TODO");
    }
}
