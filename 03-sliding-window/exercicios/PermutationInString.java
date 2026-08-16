import util.Assert;

/* LeetCode 567 — Permutation In String [Medium] | Tópico: Sliding Window
 * Padrão: janela fixa (tamanho s1.length()) + comparação de contagem de frequências
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
public class PermutationInString {

    public static void main(String[] args) {
        Assert.isTrue(checkInclusion("ab", "eidbaooo"), "'ba' é permutação de 'ab' e aparece em s2");
        Assert.isTrue(!checkInclusion("ab", "eidboaoo"), "nenhuma janela de s2 é permutação de 'ab'");
        Assert.isTrue(checkInclusion("a", "a"), "casos de tamanho 1 iguais");
        Assert.isTrue(!checkInclusion("abc", "ab"), "s1 maior que s2, impossível");
        Assert.resumo();
    }

    // Retorna true se alguma substring contígua de s2 for uma permutação (anagrama) de s1.
    static boolean checkInclusion(String s1, String s2) {
        throw new UnsupportedOperationException("TODO");
    }
}
