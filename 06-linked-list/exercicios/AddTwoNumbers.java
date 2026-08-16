import util.Assert;
import util.ListNode;

/* LeetCode 2 — Add Two Numbers [Medium] | Tópico: Linked List
 * Padrão: simular soma manual com carry, dígitos em ordem reversa
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
public class AddTwoNumbers {

    public static void main(String[] args) {
        ListNode l1 = ListNode.deArray(new int[]{2, 4, 3}); // 342
        ListNode l2 = ListNode.deArray(new int[]{5, 6, 4}); // 465
        Assert.arrayEquals(new int[]{7, 0, 8}, ListNode.paraArray(addTwoNumbers(l1, l2)), "342 + 465 = 807");

        ListNode zero1 = ListNode.deArray(new int[]{0});
        ListNode zero2 = ListNode.deArray(new int[]{0});
        Assert.arrayEquals(new int[]{0}, ListNode.paraArray(addTwoNumbers(zero1, zero2)), "0 + 0 = 0");

        ListNode grande1 = ListNode.deArray(new int[]{9, 9, 9, 9, 9, 9, 9});
        ListNode grande2 = ListNode.deArray(new int[]{9, 9, 9, 9});
        Assert.arrayEquals(new int[]{8, 9, 9, 9, 0, 0, 0, 1}, ListNode.paraArray(addTwoNumbers(grande1, grande2)), "carry propaga e cria um dígito a mais");

        Assert.resumo();
    }

    static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        throw new UnsupportedOperationException("TODO");
    }
}
