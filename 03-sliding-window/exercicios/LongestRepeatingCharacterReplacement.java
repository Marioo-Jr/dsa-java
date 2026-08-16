import util.Assert;

/* LeetCode 424 — Longest Repeating Character Replacement [Medium] | Tópico: Sliding Window
 * Padrão: janela variável + contagem de frequências, encolhe quando
 * (tamanho da janela - contagem do caractere mais frequente) > k
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
public class LongestRepeatingCharacterReplacement {

    public static void main(String[] args) {
        Assert.equals(4, characterReplacement("ABAB", 2), "troca as duas letras erradas");
        Assert.equals(4, characterReplacement("AABABBA", 1), "'AABA' ou 'ABBA', tamanho 4");
        Assert.equals(1, characterReplacement("A", 0), "sem trocas permitidas, string de 1 char");
        Assert.resumo();
    }

    // s contém apenas letras maiúsculas A-Z. Pode trocar até k caracteres
    // por qualquer outro. Retorna o tamanho da maior substring que fica com
    // um único caractere repetido após as trocas.
    static int characterReplacement(String s, int k) {
        throw new UnsupportedOperationException("TODO");
    }
}
