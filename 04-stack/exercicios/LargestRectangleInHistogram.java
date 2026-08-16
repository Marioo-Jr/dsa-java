import util.Assert;

/* LeetCode 84 — Largest Rectangle In Histogram [Hard] | Tópico: Stack
 * Padrão: pilha monotônica crescente (guarda índices de alturas)
 *
 * MINHA IDEIA (escrever ANTES de codar):
 *   1.
 *   2.
 *   3.
 *
 * Complexidade:  tempo O(?)  espaço O(?)
 * Status: sozinho | com dica | viu o vídeo
 * Vídeo: ver PLAYLIST_INDEX.md
 */
public class LargestRectangleInHistogram {

    public static void main(String[] args) {
        Assert.equals(10, largestRectangleArea(new int[]{2, 1, 5, 6, 2, 3}), "caso clássico: retângulo 5x2");
        Assert.equals(4, largestRectangleArea(new int[]{2, 4}), "duas barras, melhor é 4x1");
        Assert.equals(9, largestRectangleArea(new int[]{3, 3, 3}), "barras iguais: 3x3");
        Assert.equals(0, largestRectangleArea(new int[]{}), "sem barras");
        Assert.resumo();
    }

    // heights[i] é a altura da barra i (largura 1 cada). Retorna a área do
    // maior retângulo que cabe no histograma.
    static int largestRectangleArea(int[] heights) {
        throw new UnsupportedOperationException("TODO");
    }
}
