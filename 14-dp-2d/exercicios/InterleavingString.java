import util.Assert;

/* LeetCode 97 — Interleaving String [Medium] | Tópico: 2-D Dynamic Programming
 * Padrão: DP 2D (dp[i][j] = s1[0..i) e s2[0..j) juntos formam s3[0..i+j)?)
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
public class InterleavingString {

    public static void main(String[] args) {
        Assert.isTrue(isInterleave("aabcc", "dbbca", "aadbbcbcac"), "intercalacao valida classica");
        Assert.isTrue(!isInterleave("aabcc", "dbbca", "aadbbbaccc"), "intercalacao invalida classica");
        Assert.isTrue(isInterleave("", "", ""), "todas vazias -> true");
        Assert.isTrue(!isInterleave("abc", "", "abd"), "s3 nao bate com s1 quando s2 vazia");
        Assert.resumo();
    }

    static boolean isInterleave(String s1, String s2, String s3) {
        throw new UnsupportedOperationException("TODO");
    }
}
