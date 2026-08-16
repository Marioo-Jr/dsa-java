import util.Assert;

/* LeetCode 5 — Longest Palindromic Substring [Medium] | Tópico: 1-D Dynamic Programming
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
public class LongestPalindromicSubstring {

    public static void main(String[] args) {
        // "babad" tem duas respostas validas ("bab" e "aba") — evitado de
        // proposito para nao depender de qual o algoritmo escolhe primeiro.
        Assert.equals("bb", longestPalindrome("cbbd"), "resposta unica: 'bb'");
        Assert.equals("a", longestPalindrome("a"), "string de 1 char e seu proprio palindromo");
        Assert.equals("geeksskeeg", longestPalindrome("forgeeksskeegfor"), "palindromo unico de 10 chars no meio");
        Assert.equals("", longestPalindrome(""), "string vazia");
        Assert.resumo();
    }

    static String longestPalindrome(String s) {
        throw new UnsupportedOperationException("TODO");
    }
}
