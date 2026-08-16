import util.Assert;

/* LeetCode 42 — Trapping Rain Water [Hard] | Tópico: Two Pointers
 * Padrão: dois ponteiros nas pontas + máximo à esquerda/direita visto até agora
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
public class TrappingRainWater {

    public static void main(String[] args) {
        Assert.equals(6, trap(new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1}), "caso clássico");
        Assert.equals(9, trap(new int[]{4, 2, 0, 3, 2, 5}), "outro caso clássico");
        Assert.equals(0, trap(new int[]{}), "array vazio");
        Assert.equals(0, trap(new int[]{1, 2, 3, 4}), "crescente, sem água presa");
        Assert.resumo();
    }

    // height[i] é a altura da barra na posição i. Retorna quantas unidades
    // de água ficam presas após a chuva.
    static int trap(int[] height) {
        throw new UnsupportedOperationException("TODO");
    }
}
