import util.Assert;

/* LeetCode 125 — Valid Palindrome [Easy] | Tópico: Two Pointers
 * Padrão: dois ponteiros nas pontas, ignorando caracteres não-alfanuméricos
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
public class ValidPalindrome {

    public static void main(String[] args) {
        Assert.isTrue(isPalindrome("A man, a plan, a canal: Panama"), "frase clássica com pontuação");
        Assert.isTrue(!isPalindrome("race a car"), "não é palíndromo");
        Assert.isTrue(isPalindrome(" "), "string só com espaço é palíndromo vazio");
        Assert.isTrue(isPalindrome(""), "string vazia é palíndromo");
        Assert.isTrue(isPalindrome("0P"), "caso com dígito e letra, não-alfanumérico ignorado corretamente");
        Assert.resumo();
    }

    // Considera apenas caracteres alfanuméricos, ignorando maiúsculas/minúsculas.
    static boolean isPalindrome(String s) {
        throw new UnsupportedOperationException("TODO");
    }
}
