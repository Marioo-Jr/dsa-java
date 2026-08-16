import util.Assert;

/* LeetCode 191 — Number of 1 Bits [Easy] | Tópico: Bit Manipulation
 * Padrão: n & (n-1) apaga o bit 1 menos significativo a cada iteração (Brian Kernighan)
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
public class NumberOf1Bits {

    public static void main(String[] args) {
        Assert.equals(3, hammingWeight(0b1011), "1011 tem 3 bits 1");
        Assert.equals(1, hammingWeight(0b10000000), "128 tem 1 bit 1");
        Assert.equals(0, hammingWeight(0), "zero não tem bit 1 nenhum");
        Assert.equals(32, hammingWeight(-1), "-1 tratado como unsigned é 0xFFFFFFFF, 32 bits 1");
        Assert.resumo();
    }

    static int hammingWeight(int n) {
        throw new UnsupportedOperationException("TODO");
    }
}
