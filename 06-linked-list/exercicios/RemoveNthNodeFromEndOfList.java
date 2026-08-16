import util.Assert;
import util.ListNode;

/* LeetCode 19 — Remove Nth Node From End of List [Medium] | Tópico: Linked List
 * Padrão: dois ponteiros com distância n (um dummy node ajuda no caso de remover a cabeça)
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
public class RemoveNthNodeFromEndOfList {

    public static void main(String[] args) {
        ListNode l1 = ListNode.deArray(new int[]{1, 2, 3, 4, 5});
        Assert.arrayEquals(new int[]{1, 2, 3, 5}, ListNode.paraArray(removeNthFromEnd(l1, 2)), "exemplo do LeetCode (n=2)");

        ListNode umElemento = ListNode.deArray(new int[]{1});
        Assert.arrayEquals(new int[]{}, ListNode.paraArray(removeNthFromEnd(umElemento, 1)), "remove o único elemento");

        ListNode doisElementos = ListNode.deArray(new int[]{1, 2});
        Assert.arrayEquals(new int[]{1}, ListNode.paraArray(removeNthFromEnd(doisElementos, 1)), "remove o último de dois");

        ListNode doisElementos2 = ListNode.deArray(new int[]{1, 2});
        Assert.arrayEquals(new int[]{2}, ListNode.paraArray(removeNthFromEnd(doisElementos2, 2)), "remove a cabeça de dois");

        Assert.resumo();
    }

    static ListNode removeNthFromEnd(ListNode head, int n) {
        throw new UnsupportedOperationException("TODO");
    }
}
