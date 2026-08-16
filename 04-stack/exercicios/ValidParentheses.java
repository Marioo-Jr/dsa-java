import util.Assert;

/* LeetCode 20 — Valid Parentheses [Easy] | Tópico: Stack
 * Padrão: pilha — empilha abertura, desempilha e compara ao ver fechamento
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
public class ValidParentheses {

    public static void main(String[] args) {
        Assert.isTrue(isValid("()"), "par simples");
        Assert.isTrue(isValid("()[]{}"), "vários pares na sequência");
        Assert.isTrue(!isValid("(]"), "tipos não combinam");
        Assert.isTrue(!isValid("([)]"), "aninhamento cruzado inválido");
        Assert.isTrue(isValid("{[]}"), "aninhamento correto");
        Assert.isTrue(isValid(""), "string vazia é válida");
        Assert.isTrue(!isValid("("), "abertura sem fechamento");
        Assert.resumo();
    }

    // s contém apenas os caracteres '(', ')', '{', '}', '[', ']'.
    static boolean isValid(String s) {
        throw new UnsupportedOperationException("TODO");
    }
}
