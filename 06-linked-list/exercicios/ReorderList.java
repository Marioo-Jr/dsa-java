import util.Assert;
import util.ListNode;

/* LeetCode 143 — Reorder List [Medium] | Tópico: Linked List
 * Padrão: encontrar o meio (fast/slow) + inverter a segunda metade + intercalar
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
public class ReorderList {

    public static void main(String[] args) {
        ListNode par = ListNode.deArray(new int[]{1, 2, 3, 4});
        reorderList(par);
        Assert.arrayEquals(new int[]{1, 4, 2, 3}, ListNode.paraArray(par), "lista de tamanho par");

        ListNode impar = ListNode.deArray(new int[]{1, 2, 3, 4, 5});
        reorderList(impar);
        Assert.arrayEquals(new int[]{1, 5, 2, 4, 3}, ListNode.paraArray(impar), "lista de tamanho ímpar");

        ListNode umElemento = ListNode.deArray(new int[]{1});
        reorderList(umElemento);
        Assert.arrayEquals(new int[]{1}, ListNode.paraArray(umElemento), "um elemento não muda");

        Assert.resumo();
    }

    static void reorderList(ListNode head) {
        throw new UnsupportedOperationException("TODO");
    }
}
