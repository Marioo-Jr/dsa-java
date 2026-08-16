import util.Assert;

/* LeetCode 242 — Valid Anagram [Easy] | Tópico: Arrays & Hashing
 * Padrão: contagem de frequência (array[26] ou HashMap)
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
public class ValidAnagram {

    public static void main(String[] args) {
        Assert.isTrue(isAnagram("anagram", "nagaram"), "anagrama válido");
        Assert.isTrue(!isAnagram("rat", "car"), "não é anagrama");
        Assert.isTrue(!isAnagram("a", "ab"), "tamanhos diferentes");
        Assert.isTrue(isAnagram("", ""), "ambos vazios");
        Assert.resumo();
    }

    static boolean isAnagram(String s, String t) {
        throw new UnsupportedOperationException("TODO");
    }
}
