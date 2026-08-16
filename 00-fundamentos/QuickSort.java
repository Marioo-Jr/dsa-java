import util.Assert;
import java.util.Arrays;

/* Fase 0 — Fundamentos | Ordenação: Quick Sort
 *
 * IDEIA: escolhe um "pivô", particiona o array em [menores que o pivô | pivô |
 * maiores que o pivô], e chama recursivamente nas duas partições. Ao contrário
 * do merge sort, ordena in-place (sem array auxiliar) — mas o pior caso é
 * O(n²) se o pivô for sempre o pior possível (ex: array já ordenado + pivô no
 * extremo).
 *
 * Complexidade: tempo O(n log n) médio, O(n²) pior caso | espaço O(log n) (pilha de recursão)
 *
 * ANTES DE CODAR, escreva aqui sua ideia em 3 linhas:
 *   1.
 *   2.
 *   3.
 */
public class QuickSort {

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
        // TODO: chame quickSort(arr, 0, arr.length - 1) e retorne arr.
        throw new UnsupportedOperationException("TODO");
    }

    // TODO: implemente in-place: particiona em torno de um pivô (ex: último
    // elemento) e chama recursivamente em [low, p-1] e [p+1, high].
    static void quickSort(int[] arr, int low, int high) {
        throw new UnsupportedOperationException("TODO");
    }

    // TODO: implemente a partição (Lomuto ou Hoare) e retorne o índice final do pivô.
    static int partition(int[] arr, int low, int high) {
        throw new UnsupportedOperationException("TODO");
    }
}
