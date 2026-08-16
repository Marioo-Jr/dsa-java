import util.Assert;

/* LeetCode 190 — Reverse Bits [Easy] | Tópico: Bit Manipulation
 * Padrão: extrair cada um dos 32 bits e reconstruir o número na ordem inversa
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
public class ReverseBits {

    public static void main(String[] args) {
        Assert.equals(964176192, reverseBits(43261596), "exemplo clássico do LeetCode");
        Assert.equals(-1073741825, reverseBits(-3), "entrada com todos os bits altos ligados (0xFFFFFFFD)");
        Assert.equals(0, reverseBits(0), "zero permanece zero");
        Assert.equals(-1, reverseBits(-1), "0xFFFFFFFF revertido continua 0xFFFFFFFF");
        Assert.resumo();
    }

    static int reverseBits(int n) {
        throw new UnsupportedOperationException("TODO");
    }
}
