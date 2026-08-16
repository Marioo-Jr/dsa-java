import util.Assert;

/* LeetCode 1143 — Longest Common Subsequence [Medium] | Tópico: 2-D Dynamic Programming
 * Padrão: DP 2D (tabela dp[i][j] sobre duas strings)
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
public class LongestCommonSubsequence {

    public static void main(String[] args) {
        Assert.equals(3, longestCommonSubsequence("abcde", "ace"), "'ace' e subsequencia comum, tamanho 3");
        Assert.equals(3, longestCommonSubsequence("abc", "abc"), "strings iguais -> LCS e a propria string");
        Assert.equals(0, longestCommonSubsequence("abc", "def"), "nenhum caractere em comum");
        Assert.equals(0, longestCommonSubsequence("", "abc"), "uma string vazia -> LCS 0");
        Assert.resumo();
    }

    static int longestCommonSubsequence(String text1, String text2) {
        throw new UnsupportedOperationException("TODO");
    }
}
