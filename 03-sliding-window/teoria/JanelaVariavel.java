import util.Assert;

/* 03 — Sliding Window | Teoria: Variable Size Sliding Window
 * Lição de referência: NeetCode Advanced Algorithms → "Sliding Window - Variable Size"
 *
 * IDEIA: quando o tamanho da janela não é fixo, use dois ponteiros `esq` e
 * `dir`. Expanda `dir` somando elementos até a condição ser satisfeita
 * (aqui, soma >= alvo); então, ENQUANTO a condição continuar satisfeita,
 * tente encolher pela esquerda (some -= arr[esq]; esq++) atualizando a
 * melhor resposta a cada encolhida. Cada índice entra e sai da janela no
 * máximo uma vez, então o total ainda é O(n), mesmo com dois loops
 * aparentes.
 *
 * ANTES DE CODAR, escreva aqui sua ideia em 3 linhas:
 *   1.
 *   2.
 *   3.
 */
public class JanelaVariavel {

    // TODO: retorna o tamanho do MENOR subarray contíguo cuja soma seja >=
    // alvo. Se nenhum subarray satisfizer, retorne 0. Assume arr com valores
    // positivos (senão a técnica de encolher pela esquerda não é válida).
    static int menorSubarrayComSomaMinima(int[] arr, int alvo) {
        throw new UnsupportedOperationException("TODO");
    }

    public static void main(String[] args) {
        Assert.equals(2, menorSubarrayComSomaMinima(new int[]{2, 3, 1, 2, 4, 3}, 7), "janela [4,3] tamanho 2");
        Assert.equals(1, menorSubarrayComSomaMinima(new int[]{1, 4, 4}, 4), "um único elemento já basta");
        Assert.equals(0, menorSubarrayComSomaMinima(new int[]{1, 1, 1, 1, 1, 1, 1, 1}, 11), "soma total menor que o alvo");
        Assert.resumo();
    }
}
