import util.Assert;
import util.ListNode;

/* LeetCode 141 — Linked List Cycle [Easy] | Tópico: Linked List
 * Padrão: Floyd's fast & slow pointers
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
public class LinkedListCycle {

    public static void main(String[] args) {
        // 3 -> 2 -> 0 -> -4 -> 2 (ciclo, "tail connects to" o nó de índice 1)
        ListNode n0 = new ListNode(3);
        ListNode n1 = new ListNode(2);
        ListNode n2 = new ListNode(0);
        ListNode n3 = new ListNode(-4);
        n0.next = n1; n1.next = n2; n2.next = n3; n3.next = n1;
        Assert.isTrue(hasCycle(n0), "lista com ciclo (exemplo LeetCode)");

        ListNode semCiclo = ListNode.deArray(new int[]{1, 2});
        Assert.isTrue(!hasCycle(semCiclo), "lista sem ciclo");

        Assert.isTrue(!hasCycle(null), "lista vazia não tem ciclo");

        ListNode umNoSemCiclo = ListNode.deArray(new int[]{1});
        Assert.isTrue(!hasCycle(umNoSemCiclo), "um nó sem ciclo");

        ListNode umNoComCiclo = new ListNode(1);
        umNoComCiclo.next = umNoComCiclo;
        Assert.isTrue(hasCycle(umNoComCiclo), "um nó apontando para si mesmo é ciclo");

        Assert.resumo();
    }

    static boolean hasCycle(ListNode head) {
        throw new UnsupportedOperationException("TODO");
    }
}
