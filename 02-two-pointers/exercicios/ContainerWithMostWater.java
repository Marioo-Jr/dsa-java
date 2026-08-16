import util.Assert;

/* LeetCode 11 — Container With Most Water [Medium] | Tópico: Two Pointers
 * Padrão: dois ponteiros nas pontas, sempre movendo o menor
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
public class ContainerWithMostWater {

    public static void main(String[] args) {
        Assert.equals(49, maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}), "caso clássico");
        Assert.equals(1, maxArea(new int[]{1, 1}), "dois elementos");
        Assert.equals(2, maxArea(new int[]{1, 2, 1}), "vale no meio, pontas vencem");
        Assert.resumo();
    }

    // height[i] é a altura da parede na posição i. Retorna a maior área de
    // água que pode ficar entre duas paredes.
    static int maxArea(int[] height) {
        throw new UnsupportedOperationException("TODO");
    }
}
