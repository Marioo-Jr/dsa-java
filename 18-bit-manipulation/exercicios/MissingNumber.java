import util.Assert;

/* LeetCode 268 — Missing Number [Easy] | Tópico: Bit Manipulation
 * Padrão: XOR de todos os índices/valores com 0..n — o que sobra é o número faltante
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
public class MissingNumber {

    public static void main(String[] args) {
        Assert.equals(2, missingNumber(new int[]{3, 0, 1}), "falta o 2 no intervalo [0,3]");
        Assert.equals(2, missingNumber(new int[]{0, 1}), "falta o 2 no intervalo [0,2]");
        Assert.equals(8, missingNumber(new int[]{9, 6, 4, 2, 3, 5, 7, 0, 1}), "falta o 8 no intervalo [0,9]");
        Assert.equals(1, missingNumber(new int[]{0}), "array de 1 elemento, falta o 1");
        Assert.resumo();
    }

    static int missingNumber(int[] nums) {
        throw new UnsupportedOperationException("TODO");
    }
}
