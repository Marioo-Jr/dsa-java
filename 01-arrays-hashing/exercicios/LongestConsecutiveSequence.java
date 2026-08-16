import util.Assert;

/* LeetCode 128 — Longest Consecutive Sequence [Hard] | Tópico: Arrays & Hashing
 * Padrão: HashSet + só começar a contar sequência a partir do "início" dela
 * (um número n é início de sequência se n-1 NÃO está no set)
 *
 * MINHA IDEIA (escrever ANTES de codar — o requisito é O(n), então sort está
 * fora de cogitação):
 *   1.
 *   2.
 *   3.
 *
 * Complexidade:  tempo O(n) — por que o loop interno não quebra isso?
 * Status: sozinho | com dica | viu o vídeo
 * Vídeo: ver PLAYLIST_INDEX.md
 */
public class LongestConsecutiveSequence {

    public static void main(String[] args) {
        Assert.equals(4, longestConsecutive(new int[]{100, 4, 200, 1, 3, 2}), "sequência 1,2,3,4");
        Assert.equals(9, longestConsecutive(new int[]{0, 3, 7, 2, 5, 8, 4, 6, 0, 1}), "sequência 0..8");
        Assert.equals(0, longestConsecutive(new int[]{}), "array vazio");
        Assert.equals(1, longestConsecutive(new int[]{1, 1, 1}), "todos iguais");
        Assert.resumo();
    }

    static int longestConsecutive(int[] nums) {
        throw new UnsupportedOperationException("TODO");
    }
}
