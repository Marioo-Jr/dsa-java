import util.Assert;

/* 03 — Sliding Window | Teoria: Fixed Size Sliding Window
 * Lição de referência: NeetCode Advanced Algorithms → "Sliding Window - Fixed Size"
 *
 * IDEIA: quando a janela tem tamanho FIXO k, não precisa recalcular a soma
 * (ou qualquer métrica) do zero a cada posição. Calcule a soma da primeira
 * janela [0, k-1] uma vez; depois, pra deslizar a janela um passo pra
 * direita, SUBTRAIA o elemento que sai (esquerda) e SOME o que entra
 * (direita). Isso troca O(n*k) por O(n).
 *
 * ANTES DE CODAR, escreva aqui sua ideia em 3 linhas:
 *   1.
 *   2.
 *   3.
 */
public class JanelaFixa {

    // TODO: retorna a maior soma entre todas as janelas contíguas de tamanho
    // exatamente k. Se k > arr.length, lance IllegalArgumentException.
    static int maiorSomaJanelaFixa(int[] arr, int k) {
        throw new UnsupportedOperationException("TODO");
    }

    public static void main(String[] args) {
        Assert.equals(9, maiorSomaJanelaFixa(new int[]{2, 1, 5, 1, 3, 2}, 3), "janela k=3");
        Assert.equals(7, maiorSomaJanelaFixa(new int[]{2, 3, 4, 1, 5}, 2), "janela k=2, melhor é 3+4");
        Assert.equals(6, maiorSomaJanelaFixa(new int[]{1, 1, 1, 1, 1, 1}, 6), "janela igual ao array inteiro");
        Assert.resumo();
    }
}
