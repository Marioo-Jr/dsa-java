import util.Assert;
import util.ListNode;

/* LeetCode 206 — Reverse Linked List [Easy] | Tópico: Linked List
 * Padrão: inversão iterativa com 3 ponteiros (prev, atual, próximo)
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
public class ReverseLinkedList {

    public static void main(String[] args) {
        ListNode entrada = ListNode.deArray(new int[]{1, 2, 3, 4, 5});
        ListNode resultado = reverseList(entrada);
        Assert.arrayEquals(new int[]{5, 4, 3, 2, 1}, ListNode.paraArray(resultado), "lista básica");

        Assert.equals(null, reverseList(null), "lista vazia");

        ListNode umElemento = ListNode.deArray(new int[]{1});
        Assert.arrayEquals(new int[]{1}, ListNode.paraArray(reverseList(umElemento)), "um elemento");

        Assert.resumo();
    }

    static ListNode reverseList(ListNode head) {
        throw new UnsupportedOperationException("TODO");
    }
}
