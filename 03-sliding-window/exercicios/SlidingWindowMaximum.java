import util.Assert;

/* LeetCode 239 — Sliding Window Maximum [Hard] | Tópico: Sliding Window
 * Padrão: janela fixa + deque monotônica decrescente (guarda índices)
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
public class SlidingWindowMaximum {

    public static void main(String[] args) {
        Assert.arrayEquals(new int[]{3, 3, 5, 5, 6, 7},
                maxSlidingWindow(new int[]{1, 3, -1, -3, 5, 3, 6, 7}, 3), "caso clássico k=3");
        Assert.arrayEquals(new int[]{1}, maxSlidingWindow(new int[]{1}, 1), "janela do tamanho do array");
        Assert.arrayEquals(new int[]{4, 5}, maxSlidingWindow(new int[]{4, 5}, 2), "array de tamanho 2, k=2");
        Assert.resumo();
    }

    // Retorna, para cada janela contígua de tamanho k, o valor máximo dentro dela.
    static int[] maxSlidingWindow(int[] nums, int k) {
        throw new UnsupportedOperationException("TODO");
    }
}
