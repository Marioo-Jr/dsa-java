import util.Assert;
import java.util.Arrays;

/* Fase 0 — Fundamentos | Ordenação: Merge Sort
 *
 * IDEIA: divide o array ao meio recursivamente até sobrar 1 elemento (que já
 * está "ordenado" por definição), depois junta (merge) os pedaços de volta,
 * sempre pegando o menor entre as duas metades. Clássico "dividir para
 * conquistar" — o exercício mais importante desta trilha para lógica
 * recursiva.
 *
 * Complexidade: tempo O(n log n) sempre | espaço O(n)
 *
 * ANTES DE CODAR, escreva aqui sua ideia em 3 linhas:
 *   1.
 *   2.
 *   3.
 */
public class MergeSort {

    public static void main(String[] args) {
        Assert.arrayEquals(new int[]{1, 2, 3}, sort(new int[]{3, 1, 2}), "básico");
        Assert.arrayEquals(new int[]{}, sort(new int[]{}), "vazio");
        Assert.arrayEquals(new int[]{5}, sort(new int[]{5}), "um elemento");
        Assert.arrayEquals(new int[]{-3, -1, 0, 2, 8}, sort(new int[]{8, -1, 0, -3, 2}), "com negativos");
        Assert.arrayEquals(new int[]{1, 1, 2, 2, 3}, sort(new int[]{2, 1, 3, 1, 2}), "com repetidos");
        Assert.resumo();
    }

    static int[] sort(int[] arr) {
        arr = Arrays.copyOf(arr, arr.length);
        // TODO: implemente merge sort e retorne o array ordenado.
        // Estrutura sugerida:
        //   1. caso base: se arr.length <= 1, retorna arr.
        //   2. divide em metade esquerda e direita.
        //   3. chama sort() recursivamente em cada metade.
        //   4. faz o merge() das duas metades ordenadas.
        throw new UnsupportedOperationException("TODO");
    }

    // TODO: implemente o merge de dois arrays já ordenados em um só ordenado.
    static int[] merge(int[] esquerda, int[] direita) {
        throw new UnsupportedOperationException("TODO");
    }
}
