import util.Assert;

/* LeetCode 43 — Multiply Strings [Medium] | Tópico: Math & Geometry
 * Padrão: multiplicação "na mão" dígito a dígito, acumulando num array de tamanho len(num1)+len(num2)
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
public class MultiplyStrings {

    public static void main(String[] args) {
        Assert.equals("6", multiply("2", "3"), "multiplicação de 1 dígito");
        Assert.equals("56088", multiply("123", "456"), "multiplicação de 3 dígitos");
        Assert.equals("0", multiply("0", "0"), "zero vezes zero");
        Assert.equals("0", multiply("0", "152"), "zero vezes número, resultado deve ser \"0\" sem zeros à esquerda");
        Assert.equals("121932631112635269", multiply("123456789", "987654321"), "números grandes, não cabe em int");
        Assert.resumo();
    }

    static String multiply(String num1, String num2) {
        throw new UnsupportedOperationException("TODO");
    }
}
