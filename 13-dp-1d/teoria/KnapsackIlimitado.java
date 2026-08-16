import util.Assert;

/* 13 — 1-D Dynamic Programming | Teoria: Unbounded Knapsack
 * Lição de referência: NeetCode Advanced Algorithms → "Unbounded Knapsack"
 *
 * IDEIA: mesma ideia da mochila 0/1 (Knapsack01.java), mas agora cada item
 * pode ser usado quantas vezes quiser. A diferença aparece na transição:
 * ao decidir usar o item i, continuamos considerando o MESMO item i (ele
 * pode entrar de novo), em vez de avançar para i-1.
 *
 *   dp[c] = valor máximo com capacidade c, considerando todos os itens.
 *   Para cada capacidade c (1..capacidade), para cada item i:
 *     se pesos[i] <= c: dp[c] = max(dp[c], valores[i] + dp[c - pesos[i]])
 *
 * Note que dp[c - pesos[i]] pode já incluir o próprio item i sendo usado de
 * novo — é exatamente isso que permite repetição ilimitada.
 *
 * ANTES DE CODAR, escreva aqui sua ideia em 3 linhas:
 *   1.
 *   2.
 *   3.
 */
public class KnapsackIlimitado {

    // TODO: dp[0..capacidade], dp[0] = 0. Para c de 1 até capacidade, para
    // cada item i, se pesos[i] <= c: dp[c] = max(dp[c], valores[i] + dp[c -
    // pesos[i]]). Retorne dp[capacidade].
    static int knapsackIlimitado(int[] pesos, int[] valores, int capacidade) {
        throw new UnsupportedOperationException("TODO");
    }

    public static void main(String[] args) {
        // Exemplo classico (GeeksforGeeks): pesos {1,3,4,5}, valores
        // {10,40,50,70}, capacidade 8. Melhor combinacao: um item de peso 3
        // (valor 40) + um item de peso 5 (valor 70) = 110, peso total 8.
        Assert.equals(110, knapsackIlimitado(new int[]{1, 3, 4, 5}, new int[]{10, 40, 50, 70}, 8),
                "exemplo classico: capacidade 8");

        Assert.equals(0, knapsackIlimitado(new int[]{}, new int[]{}, 5), "sem itens");
        Assert.equals(0, knapsackIlimitado(new int[]{5}, new int[]{10}, 0), "capacidade zero");
        Assert.equals(30, knapsackIlimitado(new int[]{2}, new int[]{10}, 6), "um item repetido 3 vezes");

        Assert.resumo();
    }
}
