import util.Assert;

/* LeetCode 76 — Minimum Window Substring [Hard] | Tópico: Sliding Window
 * Padrão: janela variável + HashMap de contagem necessária vs. contagem atual
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
public class MinimumWindowSubstring {

    public static void main(String[] args) {
        Assert.equals("BANC", minWindow("ADOBECODEBANC", "ABC"), "caso clássico do LeetCode");
        Assert.equals("a", minWindow("a", "a"), "s e t iguais, tamanho 1");
        Assert.equals("", minWindow("a", "aa"), "t precisa de 2 'a', s só tem 1: impossível");
        Assert.equals("", minWindow("a", "b"), "caractere de t não existe em s");
        Assert.resumo();
    }

    // Retorna a menor substring de s que contém todos os caracteres de t
    // (com multiplicidade). Se não existir, retorna "".
    static String minWindow(String s, String t) {
        throw new UnsupportedOperationException("TODO");
    }
}
