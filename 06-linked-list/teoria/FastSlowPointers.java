import util.Assert;
import util.ListNode;

/* 06 — Linked List | Teoria: Fast & Slow Pointers
 * Lição de referência: NeetCode DSA for Advanced Coders → "Fast & Slow Pointers"
 *
 * IDEIA: dois ponteiros percorrem a lista em velocidades diferentes (slow
 * anda 1 nó por vez, fast anda 2). Quando fast chega ao fim, slow está no
 * meio. Se a lista tem ciclo, fast eventualmente "dá a volta" e encontra
 * slow de novo — é o algoritmo de detecção de ciclo de Floyd (tartaruga e
 * lebre).
 *
 * ANTES DE CODAR, escreva aqui sua ideia em 3 linhas:
 *   1.
 *   2.
 *   3.
 */
public class FastSlowPointers {

    // TODO: retorna o nó do meio da lista (se tamanho par, o segundo dos
    // dois do meio — mesma convenção do LeetCode 876).
    static ListNode encontrarMeio(ListNode head) {
        throw new UnsupportedOperationException("TODO");
    }

    // TODO: retorna true se a lista tem ciclo (algoritmo de Floyd).
    static boolean temCiclo(ListNode head) {
        throw new UnsupportedOperationException("TODO");
    }

    public static void main(String[] args) {
        ListNode impar = ListNode.deArray(new int[]{1, 2, 3, 4, 5});
        Assert.equals(3, encontrarMeio(impar).val, "meio de lista ímpar (5 elementos) é o 3º");

        ListNode par = ListNode.deArray(new int[]{1, 2, 3, 4, 5, 6});
        Assert.equals(4, encontrarMeio(par).val, "meio de lista par (6 elementos) é o 4º (2ª metade)");

        ListNode umElemento = ListNode.deArray(new int[]{1});
        Assert.equals(1, encontrarMeio(umElemento).val, "lista com um elemento");

        ListNode semCiclo = ListNode.deArray(new int[]{1, 2, 3, 4});
        Assert.isTrue(!temCiclo(semCiclo), "lista linear não tem ciclo");

        // monta ciclo manualmente: 1 -> 2 -> 3 -> 4 -> 2 (aponta de volta pro nó 2)
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        n1.next = n2; n2.next = n3; n3.next = n4; n4.next = n2;
        Assert.isTrue(temCiclo(n1), "lista com ciclo é detectada");

        Assert.resumo();
    }
}
