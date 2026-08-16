import util.Assert;

/* 03 — Sliding Window | Teoria: Kadane's Algorithm
 * Lição de referência: NeetCode Advanced Algorithms → "Kadane's Algorithm"
 *
 * IDEIA: pra achar o subarray contíguo de soma máxima, mantenha
 * `somaAtual` = a melhor soma de um subarray que TERMINA no índice atual.
 * A cada posição, decida: vale mais continuar o subarray anterior
 * (somaAtual + arr[i]) ou começar um novo subarray aqui (arr[i] sozinho)?
 * Ou seja: somaAtual = max(arr[i], somaAtual + arr[i]). O resultado final é
 * o maior `somaAtual` visto em qualquer posição. Um único passe, O(n).
 *
 * ANTES DE CODAR, escreva aqui sua ideia em 3 linhas:
 *   1.
 *   2.
 *   3.
 */
public class Kadane {

    // TODO: retorna a soma máxima de um subarray contíguo NÃO-VAZIO.
    // arr sempre tem pelo menos 1 elemento.
    static int maxSubarraySum(int[] arr) {
        throw new UnsupportedOperationException("TODO");
    }

    public static void main(String[] args) {
        Assert.equals(6, maxSubarraySum(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}), "caso clássico: [4,-1,2,1]");
        Assert.equals(23, maxSubarraySum(new int[]{5, 4, -1, 7, 8}), "array quase todo positivo, soma o array inteiro");
        Assert.equals(1, maxSubarraySum(new int[]{1}), "elemento único positivo");
        Assert.equals(-1, maxSubarraySum(new int[]{-2, -1}), "todos negativos: melhor é o menos negativo");
        Assert.resumo();
    }
}
