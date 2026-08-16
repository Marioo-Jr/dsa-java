import util.Assert;
import util.ListNode;

/* LeetCode 25 — Reverse Nodes In K Group [Hard] | Tópico: Linked List
 * Padrão: inversão iterativa em blocos de k, com checagem prévia de que o
 * grupo tem k nós antes de inverter
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
public class ReverseNodesInKGroup {

    public static void main(String[] args) {
        ListNode l1 = ListNode.deArray(new int[]{1, 2, 3, 4, 5});
        Assert.arrayEquals(new int[]{2, 1, 4, 3, 5}, ListNode.paraArray(reverseKGroup(l1, 2)), "k=2, sobra um nó no fim (fica como está)");

        ListNode l2 = ListNode.deArray(new int[]{1, 2, 3, 4, 5});
        Assert.arrayEquals(new int[]{3, 2, 1, 4, 5}, ListNode.paraArray(reverseKGroup(l2, 3)), "k=3, sobram 2 nós no fim (ficam como estão)");

        ListNode l3 = ListNode.deArray(new int[]{1, 2, 3, 4});
        Assert.arrayEquals(new int[]{2, 1, 4, 3}, ListNode.paraArray(reverseKGroup(l3, 2)), "k=2 dividindo exatamente");

        ListNode l4 = ListNode.deArray(new int[]{1});
        Assert.arrayEquals(new int[]{1}, ListNode.paraArray(reverseKGroup(l4, 1)), "k=1 não muda nada");

        Assert.resumo();
    }

    static ListNode reverseKGroup(ListNode head, int k) {
        throw new UnsupportedOperationException("TODO");
    }
}
