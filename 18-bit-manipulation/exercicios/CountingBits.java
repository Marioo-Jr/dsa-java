import util.Assert;

/* LeetCode 338 — Counting Bits [Easy] | Tópico: Bit Manipulation
 * Padrão: programação dinâmica — bits[i] = bits[i >> 1] + (i & 1)
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
public class CountingBits {

    public static void main(String[] args) {
        Assert.arrayEquals(new int[]{0, 1, 1}, countBits(2), "0,1,2 -> 0,1,1 bits");
        Assert.arrayEquals(new int[]{0, 1, 1, 2, 1, 2}, countBits(5), "0..5 -> contagem de bits de cada");
        Assert.arrayEquals(new int[]{0}, countBits(0), "apenas o zero");
        Assert.resumo();
    }

    static int[] countBits(int n) {
        throw new UnsupportedOperationException("TODO");
    }
}
