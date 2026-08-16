import util.Assert;

/* LeetCode 763 — Partition Labels [Medium] | Tópico: Greedy
 * Padrão: guardar o último índice de cada letra, expandir a fronteira da partição até o maior "último índice" visto
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
public class PartitionLabels {

    public static void main(String[] args) {
        Assert.equals(java.util.List.of(9, 7, 8), partitionLabels("ababcbacadefegdehijhklij"), "3 partições clássicas");
        Assert.equals(java.util.List.of(10), partitionLabels("eccbbbbdec"), "string inteira é uma única partição");
        Assert.equals(java.util.List.of(1), partitionLabels("a"), "string de um único caractere");
        Assert.resumo();
    }

    static java.util.List<Integer> partitionLabels(String s) {
        throw new UnsupportedOperationException("TODO");
    }
}
