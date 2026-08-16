import util.Assert;

/* LeetCode 3 — Longest Substring Without Repeating Characters [Medium] | Tópico: Sliding Window
 * Padrão: janela variável + HashSet (ou HashMap de última posição vista)
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
public class LongestSubstringWithoutRepeatingCharacters {

    public static void main(String[] args) {
        Assert.equals(3, lengthOfLongestSubstring("abcabcbb"), "'abc' tamanho 3");
        Assert.equals(1, lengthOfLongestSubstring("bbbbb"), "todos repetidos, tamanho 1");
        Assert.equals(3, lengthOfLongestSubstring("pwwkew"), "'wke' tamanho 3");
        Assert.equals(0, lengthOfLongestSubstring(""), "string vazia");
        Assert.resumo();
    }

    static int lengthOfLongestSubstring(String s) {
        throw new UnsupportedOperationException("TODO");
    }
}
