package util;

import java.util.ArrayList;
import java.util.List;

/**
 * Nó de lista ligada simples, no formato usado pelo LeetCode. Compartilhado
 * por todos os exercícios do tópico 06-linked-list para não precisar
 * redeclarar a classe (nem montar a lista na mão) em cada arquivo.
 *
 * Uso típico num teste:
 *   ListNode entrada = ListNode.deArray(new int[]{1, 2, 3});
 *   ListNode resultado = reverseList(entrada);
 *   Assert.arrayEquals(new int[]{3, 2, 1}, ListNode.paraArray(resultado), "reverso");
 */
public class ListNode {
    public int val;
    public ListNode next;

    public ListNode() {}
    public ListNode(int val) { this.val = val; }
    public ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    public static ListNode deArray(int[] valores) {
        ListNode dummy = new ListNode();
        ListNode atual = dummy;
        for (int v : valores) {
            atual.next = new ListNode(v);
            atual = atual.next;
        }
        return dummy.next;
    }

    public static int[] paraArray(ListNode cabeca) {
        List<Integer> lista = new ArrayList<>();
        while (cabeca != null) {
            lista.add(cabeca.val);
            cabeca = cabeca.next;
        }
        return lista.stream().mapToInt(Integer::intValue).toArray();
    }
}
