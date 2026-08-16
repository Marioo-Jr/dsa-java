import util.Assert;

/* 13 — 1-D Dynamic Programming | Teoria: 0/1 Knapsack
 * Lição de referência: NeetCode DSA for Beginners → "0/1 Knapsack"
 *
 * IDEIA: temos `capacidade` de peso disponível e uma lista de itens, cada um
 * com um peso e um valor. Cada item só pode ser usado UMA vez (0/1: ou entra
 * ou não entra na mochila). Queremos o valor máximo possível sem estourar a
 * capacidade.
 *
 * Para cada item i e cada capacidade c, a decisão é binária:
 *   - não usar o item i: valor = dp(i-1, c)
 *   - usar o item i (se pesos[i] <= c): valor = valores[i] + dp(i-1, c - pesos[i])
 *   dp(i, c) = max dessas duas opções.
 *
 * Como cada item só pode ser usado uma vez, ao "usar" o item avançamos para
 * i-1 (não voltamos a considerar o mesmo item de novo) — essa é a diferença
 * central para a mochila ilimitada (KnapsackIlimitado.java).
 *
 * ANTES DE CODAR, escreva aqui sua ideia em 3 linhas:
 *   1.
 *   2.
 *   3.
 */
public class Knapsack01 {

    // TODO: tabela dp[i][c] = valor máximo usando os primeiros i itens com
    // capacidade c. dp[0][*] = 0 (sem itens, valor 0). Para cada item i (1..n)
    // e cada capacidade c (0..capacidade): se pesos[i-1] > c, dp[i][c] =
    // dp[i-1][c] (não cabe). Senão, dp[i][c] = max(dp[i-1][c], valores[i-1] +
    // dp[i-1][c - pesos[i-1]]). Retorne dp[n][capacidade].
    static int knapsack01(int[] pesos, int[] valores, int capacidade) {
        throw new UnsupportedOperationException("TODO");
    }

    public static void main(String[] args) {
        // Exemplo clássico: pesos {1,3,4,5}, valores {1,4,5,7}, capacidade 7.
        // Melhor escolha: itens de peso 3 e 4 (valores 4 + 5 = 9), peso total 7.
        Assert.equals(9, knapsack01(new int[]{1, 3, 4, 5}, new int[]{1, 4, 5, 7}, 7),
                "exemplo classico: capacidade 7");

        Assert.equals(0, knapsack01(new int[]{}, new int[]{}, 5), "sem itens");
        Assert.equals(0, knapsack01(new int[]{10}, new int[]{60}, 5), "item nao cabe na mochila");
        Assert.equals(60, knapsack01(new int[]{10}, new int[]{60}, 10), "item cabe exatamente");

        Assert.resumo();
    }
}
