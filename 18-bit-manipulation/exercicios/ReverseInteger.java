import util.Assert;

/* LeetCode 7 — Reverse Integer [Medium] | Tópico: Bit Manipulation
 * Padrão: reverter dígito a dígito checando overflow de 32 bits ANTES de cada multiplicação/soma
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
public class ReverseInteger {

    public static void main(String[] args) {
        Assert.equals(321, reverse(123), "reversão simples positiva");
        Assert.equals(-321, reverse(-123), "reversão simples negativa");
        Assert.equals(21, reverse(120), "zero à direita vira zero à esquerda e some");
        Assert.equals(0, reverse(1534236469), "estoura int de 32 bits ao reverter -> retorna 0");
        Assert.equals(0, reverse(0), "zero permanece zero");
        Assert.equals(0, reverse(-2147483648), "Integer.MIN_VALUE estoura ao reverter -> retorna 0");
        Assert.resumo();
    }

    static int reverse(int x) {
        throw new UnsupportedOperationException("TODO");
    }
}
