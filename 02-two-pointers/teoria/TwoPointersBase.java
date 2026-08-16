import util.Assert;

/* 02 — Two Pointers | Teoria: Two Pointers
 * Lição de referência: NeetCode Advanced Algorithms → "Two Pointers"
 *
 * IDEIA: em vez de percorrer um array com loops aninhados (O(n²)), usamos
 * dois índices que se movem de forma coordenada, geralmente das duas pontas
 * para o centro (array ORDENADO) ou os dois na mesma direção (leitura e
 * escrita). Cada passo descarta uma parte do espaço de busca sem precisar
 * revisitar — é isso que derruba o custo pra O(n).
 *
 * Dois padrões clássicos aqui:
 *   1. Ponteiros de pontas opostas (esquerda/direita se aproximando) — usado
 *      quando o array está ordenado e você quer combinar elementos.
 *   2. Ponteiro rápido/lento (mesma direção) — usado pra compactar ou
 *      inverter um array in-place.
 *
 * ANTES DE CODAR, escreva aqui sua ideia em 3 linhas:
 *   1.
 *   2.
 *   3.
 */
public class TwoPointersBase {

    // TODO: array ORDENADO. Retorna true se existir um par (i != j) cuja
    // soma seja igual a target. Use dois ponteiros nas pontas: se a soma for
    // menor que o alvo, avance o ponteiro esquerdo; se for maior, recue o
    // direito; se for igual, retorne true.
    static boolean existePairComSoma(int[] arr, int target) {
        throw new UnsupportedOperationException("TODO");
    }

    // TODO: inverte o array IN-PLACE usando dois ponteiros que começam nas
    // pontas e se cruzam no meio, trocando os elementos a cada passo.
    static void inverter(int[] arr) {
        throw new UnsupportedOperationException("TODO");
    }

    // TODO: remove duplicados de um array ORDENADO in-place (como o LeetCode
    // 26) usando um ponteiro lento (posição de escrita) e um rápido (leitura).
    // Retorna o novo tamanho lógico do array (elementos únicos ficam no
    // início, o que vem depois não importa).
    static int removerDuplicados(int[] arr) {
        throw new UnsupportedOperationException("TODO");
    }

    public static void main(String[] args) {
        Assert.isTrue(existePairComSoma(new int[]{1, 2, 4, 7, 11}, 15), "par 4+11 existe");
        Assert.isTrue(!existePairComSoma(new int[]{1, 2, 4, 7, 11}, 100), "nenhum par soma 100");
        Assert.isTrue(!existePairComSoma(new int[]{5}, 5), "elemento único não forma par consigo mesmo");

        int[] arr1 = {1, 2, 3, 4, 5};
        inverter(arr1);
        Assert.arrayEquals(new int[]{5, 4, 3, 2, 1}, arr1, "inverte array de tamanho ímpar");

        int[] arr2 = {1, 2, 3, 4};
        inverter(arr2);
        Assert.arrayEquals(new int[]{4, 3, 2, 1}, arr2, "inverte array de tamanho par");

        int[] arr3 = {};
        inverter(arr3);
        Assert.arrayEquals(new int[]{}, arr3, "inverter array vazio não quebra");

        int[] dup = {1, 1, 2, 2, 3, 4, 4};
        int novoTamanho = removerDuplicados(dup);
        Assert.equals(4, novoTamanho, "4 elementos únicos: 1,2,3,4");

        Assert.resumo();
    }
}
