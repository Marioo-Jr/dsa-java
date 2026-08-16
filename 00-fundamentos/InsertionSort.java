import util.Assert;
import java.util.Arrays;

/* Fase 0 — Fundamentos | Ordenação: Insertion Sort
 *
 * IDEIA: percorre o array da esquerda pra direita. A cada posição i, pega o
 * elemento e "insere" ele no lugar certo dentro da parte já ordenada [0..i-1],
 * empurrando os maiores uma casa pra frente. É assim que a maioria das pessoas
 * ordena cartas na mão.
 *
 * Complexidade: tempo O(n²) pior caso, O(n) se quase ordenado | espaço O(1)
 *
 * ANTES DE CODAR, escreva aqui sua ideia em 3 linhas:
 *   1.
 *   2.
 *   3.
 */
public class InsertionSort {

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
        // TODO: implemente insertion sort in-place e retorne arr.
        // Dica: for (i = 1; i < arr.length; i++) { pegue arr[i], compare com
        // os anteriores e empurre até achar a posição certa. }
        throw new UnsupportedOperationException("TODO");
    }
}
