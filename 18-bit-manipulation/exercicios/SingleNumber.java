import util.Assert;

/* LeetCode 136 — Single Number [Easy] | Tópico: Bit Manipulation
 * Padrão: XOR de todos os elementos — pares se cancelam, sobra o único
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
public class SingleNumber {

    public static void main(String[] args) {
        Assert.equals(1, singleNumber(new int[]{2, 2, 1}), "1 é o único sem par");
        Assert.equals(4, singleNumber(new int[]{4, 1, 2, 1, 2}), "4 é o único sem par");
        Assert.equals(1, singleNumber(new int[]{1}), "único elemento do array");
        Assert.equals(-1, singleNumber(new int[]{-1, 3, 3}), "funciona com número negativo");
        Assert.resumo();
    }

    static int singleNumber(int[] nums) {
        throw new UnsupportedOperationException("TODO");
    }
}
