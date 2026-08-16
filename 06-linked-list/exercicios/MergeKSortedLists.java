import util.Assert;
import util.ListNode;

/* LeetCode 23 — Merge K Sorted Lists [Hard] | Tópico: Linked List
 * Padrão: heap mínimo (ou merge dois a dois, divide and conquer)
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
public class MergeKSortedLists {

    public static void main(String[] args) {
        ListNode[] listas = new ListNode[]{
                ListNode.deArray(new int[]{1, 4, 5}),
                ListNode.deArray(new int[]{1, 3, 4}),
                ListNode.deArray(new int[]{2, 6})
        };
        Assert.arrayEquals(new int[]{1, 1, 2, 3, 4, 4, 5, 6}, ListNode.paraArray(mergeKLists(listas)), "exemplo do LeetCode");

        Assert.equals(null, mergeKLists(new ListNode[]{}), "array vazio");

        Assert.equals(null, mergeKLists(new ListNode[]{null}), "array com uma lista vazia (null)");

        ListNode[] umaLista = new ListNode[]{ListNode.deArray(new int[]{1, 2, 3})};
        Assert.arrayEquals(new int[]{1, 2, 3}, ListNode.paraArray(mergeKLists(umaLista)), "só uma lista na entrada");

        Assert.resumo();
    }

    static ListNode mergeKLists(ListNode[] lists) {
        throw new UnsupportedOperationException("TODO");
    }
}
