import util.Assert;

/* LeetCode 371 — Sum of Two Integers [Medium] | Tópico: Bit Manipulation
 * Padrão: soma sem + nem - usando XOR (soma sem carry) e AND deslocado (carry), repetindo até carry ser 0
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
public class SumOfTwoIntegers {

    public static void main(String[] args) {
        Assert.equals(3, getSum(1, 2), "soma simples positiva");
        Assert.equals(5, getSum(2, 3), "soma simples positiva 2");
        Assert.equals(0, getSum(-1, 1), "soma com negativo que zera");
        Assert.equals(1, getSum(-2, 3), "soma com negativo, resultado positivo");
        Assert.equals(-5, getSum(-2, -3), "soma de dois negativos");
        Assert.resumo();
    }

    static int getSum(int a, int b) {
        throw new UnsupportedOperationException("TODO");
    }
}
