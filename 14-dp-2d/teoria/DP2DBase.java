import util.Assert;

/* 14 — 2-D Dynamic Programming | Teoria: DP em grade 2D
 * Lição de referência: NeetCode DSA for Beginners → "2-Dimension DP"
 *
 * IDEIA: em vez de um array 1D de estados, o estado agora tem 2 dimensões —
 * aqui, uma posição (linha, coluna) numa grade m x n. Partindo de (0,0),
 * só é permitido andar para a DIREITA ou para BAIXO. Queremos contar quantos
 * caminhos distintos existem até chegar em (m-1, n-1).
 *
 * dp[i][j] = número de caminhos até a célula (i, j).
 *   - Primeira linha (i=0) e primeira coluna (j=0): só existe 1 jeito de
 *     chegar (andando sempre reto), então dp[0][j] = 1 e dp[i][0] = 1.
 *   - Caso geral: dp[i][j] = dp[i-1][j] (veio de cima) + dp[i][j-1] (veio da
 *     esquerda).
 *
 * Esse é o "hello world" de DP 2D: toda tabela dp[i][j] que depende só da
 * célula de cima e da esquerda segue esse mesmo esqueleto de preenchimento
 * linha por linha (ou coluna por coluna).
 *
 * ANTES DE CODAR, escreva aqui sua ideia em 3 linhas:
 *   1.
 *   2.
 *   3.
 */
public class DP2DBase {

    // TODO: tabela dp[m][n]. dp[i][0] = 1 para toda linha i (unico caminho:
    // sempre para baixo). dp[0][j] = 1 para toda coluna j (unico caminho:
    // sempre para direita). Para i>=1 e j>=1: dp[i][j] = dp[i-1][j] +
    // dp[i][j-1]. Retorne dp[m-1][n-1].
    static int contarCaminhos(int m, int n) {
        throw new UnsupportedOperationException("TODO");
    }

    public static void main(String[] args) {
        Assert.equals(1, contarCaminhos(1, 1), "grade 1x1: ja comeca no destino");
        Assert.equals(3, contarCaminhos(3, 2), "grade 3x2: 3 caminhos");
        Assert.equals(28, contarCaminhos(3, 7), "grade 3x7: 28 caminhos (exemplo classico)");
        Assert.resumo();
    }
}
