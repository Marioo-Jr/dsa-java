import util.Assert;

/* 01 — Arrays & Hashing | Teoria: Prefix Sums
 * Lição de referência: NeetCode Advanced Algorithms → "Prefix Sums"
 *
 * IDEIA: pré-computa um array `prefix` onde prefix[i] = soma de arr[0..i-1].
 * Depois, a soma de qualquer intervalo [i, j] (inclusive) vira
 * prefix[j+1] - prefix[i] — O(1) por consulta, em vez de O(n) somando de
 * novo toda vez. O custo é O(n) de pré-processamento, uma vez só.
 *
 * Padrão que reaparece em vários problemas de subarray (ex: Subarray Sum
 * Equals K, mais à frente).
 *
 * ANTES DE CODAR, escreva aqui sua ideia em 3 linhas:
 *   1.
 *   2.
 *   3.
 */
public class PrefixSum {

    private int[] prefix;

    // TODO: construa prefix de tamanho arr.length + 1, onde prefix[0] = 0 e
    // prefix[i] = prefix[i-1] + arr[i-1].
    public PrefixSum(int[] arr) {
        throw new UnsupportedOperationException("TODO");
    }

    // TODO: retorna a soma de arr[i..j] inclusive, usando prefix[j+1] - prefix[i].
    public int somaIntervalo(int i, int j) {
        throw new UnsupportedOperationException("TODO");
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, -1, 6, 3, -8};
        PrefixSum ps = new PrefixSum(arr);

        Assert.equals(2, ps.somaIntervalo(0, 0), "intervalo de um elemento");
        Assert.equals(6, ps.somaIntervalo(0, 1), "2 + 4");
        Assert.equals(9, ps.somaIntervalo(0, 3), "2 + 4 - 1 + 6");
        Assert.equals(1, ps.somaIntervalo(2, 5), "-1 + 6 + 3 - 8");
        Assert.equals(6, ps.somaIntervalo(3, 4), "6 + 3");

        Assert.resumo();
    }
}
