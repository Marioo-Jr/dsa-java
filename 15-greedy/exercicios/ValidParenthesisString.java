import util.Assert;

/* LeetCode 678 — Valid Parenthesis String [Medium] | Tópico: Greedy
 * Padrão: rastrear intervalo [mínimo, máximo] de "(" abertos possíveis, tratando '*' como coringa
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
public class ValidParenthesisString {

    public static void main(String[] args) {
        Assert.isTrue(checkValidString("()"), "parênteses simples válidos");
        Assert.isTrue(checkValidString("(*)"), "'*' vira parêntese vazio");
        Assert.isTrue(checkValidString("(*))"), "'*' vira '(' para balancear o fechamento extra");
        Assert.isTrue(!checkValidString("((("), "3 aberturas sem fechamento, sem '*' suficiente");
        Assert.isTrue(checkValidString(""), "string vazia é válida");
        Assert.resumo();
    }

    static boolean checkValidString(String s) {
        throw new UnsupportedOperationException("TODO");
    }
}
