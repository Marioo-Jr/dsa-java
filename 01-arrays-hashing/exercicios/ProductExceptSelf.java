import util.Assert;

/* LeetCode 238 — Product of Array Except Self [Medium] | Tópico: Arrays & Hashing
 * Padrão: dois passes (prefixo e sufixo) — SEM usar divisão
 *
 * MINHA IDEIA (escrever ANTES de codar):
 *   1.
 *   2.
 *   3.
 *
 * Complexidade:  tempo O(?)  espaço O(1) fora do array de saída — como conseguir isso?
 * Status: sozinho | com dica | viu o vídeo
 * Vídeo: ver PLAYLIST_INDEX.md
 */
public class ProductExceptSelf {

    public static void main(String[] args) {
        Assert.arrayEquals(new int[]{24, 12, 8, 6}, productExceptSelf(new int[]{1, 2, 3, 4}), "básico");
        Assert.arrayEquals(new int[]{0, 0, 9, 0, 0}, productExceptSelf(new int[]{-1, 1, 0, -3, 3}), "com zero");
        Assert.resumo();
    }

    // Proibido usar divisão.
    static int[] productExceptSelf(int[] nums) {
        throw new UnsupportedOperationException("TODO");
    }
}
