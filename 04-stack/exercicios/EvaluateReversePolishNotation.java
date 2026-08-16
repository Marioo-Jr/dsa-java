import util.Assert;

/* LeetCode 150 — Evaluate Reverse Polish Notation [Medium] | Tópico: Stack
 * Padrão: pilha — empilha números, ao ver operador desempilha 2 e empilha o resultado
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
public class EvaluateReversePolishNotation {

    public static void main(String[] args) {
        Assert.equals(9, evalRPN(new String[]{"2", "1", "+", "3", "*"}), "(2+1)*3 = 9");
        Assert.equals(6, evalRPN(new String[]{"4", "13", "5", "/", "+"}), "4 + (13/5) = 4 + 2 = 6");
        Assert.equals(22, evalRPN(new String[]{
                "10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"
        }), "expressão longa do enunciado oficial");
        Assert.equals(5, evalRPN(new String[]{"5"}), "token único, sem operador");
        Assert.resumo();
    }

    // Tokens: números inteiros ou operadores "+", "-", "*", "/".
    // Divisão trunca em direção a zero (divisão inteira do Java já faz isso).
    static int evalRPN(String[] tokens) {
        throw new UnsupportedOperationException("TODO");
    }
}
