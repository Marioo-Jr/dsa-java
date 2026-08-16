import util.Assert;
import util.ListNode;

/* LeetCode 21 — Merge Two Sorted Lists [Easy] | Tópico: Linked List
 * Padrão: dois ponteiros / dummy node
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
public class MergeTwoSortedLists {

    public static void main(String[] args) {
        ListNode l1 = ListNode.deArray(new int[]{1, 2, 4});
        ListNode l2 = ListNode.deArray(new int[]{1, 3, 4});
        Assert.arrayEquals(new int[]{1, 1, 2, 3, 4, 4}, ListNode.paraArray(mergeTwoLists(l1, l2)), "exemplo do LeetCode");

        Assert.equals(null, mergeTwoLists(null, null), "duas listas vazias");

        ListNode vazia = null;
        ListNode naoVazia = ListNode.deArray(new int[]{0});
        Assert.arrayEquals(new int[]{0}, ListNode.paraArray(mergeTwoLists(vazia, naoVazia)), "uma lista vazia");

        Assert.resumo();
    }

    static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        throw new UnsupportedOperationException("TODO");
    }
}
