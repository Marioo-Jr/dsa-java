import util.Assert;

/* 14 — 2-D Dynamic Programming | Teoria: Longest Common Subsequence
 * Lição de referência: NeetCode Advanced Algorithms → "LCS"
 *
 * IDEIA: uma subsequência não precisa ser contígua (diferente de substring),
 * só precisa manter a ordem relativa dos caracteres. Dado texto1 (tamanho m)
 * e texto2 (tamanho n), dp[i][j] = tamanho da LCS entre texto1[0..i) e
 * texto2[0..j).
 *
 *   - Caso base: dp[0][j] = 0 e dp[i][0] = 0 (uma das strings vazia -> LCS 0).
 *   - Se texto1[i-1] == texto2[j-1]: esse caractere participa da LCS, então
 *     dp[i][j] = 1 + dp[i-1][j-1].
 *   - Senão: dp[i][j] = max(dp[i-1][j], dp[i][j-1]) — ignora o último
 *     caractere de uma das duas strings, o que for melhor.
 *
 * Resposta final: dp[m][n].
 *
 * ANTES DE CODAR, escreva aqui sua ideia em 3 linhas:
 *   1.
 *   2.
 *   3.
 */
public class LCS {

    // TODO: tabela dp[m+1][n+1] conforme a recorrencia acima. Retorne
    // dp[a.length()][b.length()].
    static int lcs(String a, String b) {
        throw new UnsupportedOperationException("TODO");
    }

    public static void main(String[] args) {
        Assert.equals(3, lcs("abcde", "ace"), "'ace' e subsequencia comum, tamanho 3");
        Assert.equals(3, lcs("abc", "abc"), "strings iguais -> LCS e a propria string");
        Assert.equals(0, lcs("abc", "def"), "nenhum caractere em comum");
        Assert.equals(0, lcs("", "abc"), "uma string vazia -> LCS 0");
        Assert.resumo();
    }
}
