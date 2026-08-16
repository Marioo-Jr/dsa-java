import util.Assert;

import java.util.ArrayList;
import java.util.List;

/* LeetCode 138 — Copy List With Random Pointer [Medium] | Tópico: Linked List
 * Padrão: HashMap (nó original -> cópia) em duas passadas, ou intercalação O(1) espaço
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
public class CopyListWithRandomPointer {

    static class Node {
        int val;
        Node next;
        Node random;
        Node(int val) { this.val = val; }
    }

    public static void main(String[] args) {
        // [[7,null],[13,0],[11,4],[10,2],[1,0]] (exemplo do LeetCode; -1 = random null)
        Node original = construir(new int[][]{{7, -1}, {13, 0}, {11, 4}, {10, 2}, {1, 0}});
        Node copia = copyRandomList(original);
        Assert.isTrue(mesmaEstrutura(original, copia), "cópia tem os mesmos valores e padrão de random");
        Assert.isTrue(saoNosDiferentes(original, copia), "cópia usa nós novos, não os mesmos objetos");

        Assert.equals(null, copyRandomList(null), "lista vazia");

        Node umNo = construir(new int[][]{{1, 0}}); // aponta random para si mesmo
        Node copiaUmNo = copyRandomList(umNo);
        Assert.isTrue(mesmaEstrutura(umNo, copiaUmNo), "um nó com random apontando para si mesmo");

        Assert.resumo();
    }

    // constroi a partir de pares [val, indiceRandom] (indiceRandom = -1 significa null)
    static Node construir(int[][] dados) {
        if (dados.length == 0) return null;
        List<Node> nos = new ArrayList<>();
        for (int[] par : dados) nos.add(new Node(par[0]));
        for (int i = 0; i < dados.length; i++) {
            if (i + 1 < dados.length) nos.get(i).next = nos.get(i + 1);
            int idx = dados[i][1];
            nos.get(i).random = (idx == -1) ? null : nos.get(idx);
        }
        return nos.get(0);
    }

    // compara valores e o padrão de "para onde aponta o random" (por índice na lista)
    static boolean mesmaEstrutura(Node a, Node b) {
        List<Node> nosA = new ArrayList<>();
        List<Node> nosB = new ArrayList<>();
        for (Node n = a; n != null; n = n.next) nosA.add(n);
        for (Node n = b; n != null; n = n.next) nosB.add(n);
        if (nosA.size() != nosB.size()) return false;
        for (int i = 0; i < nosA.size(); i++) {
            if (nosA.get(i).val != nosB.get(i).val) return false;
            int idxA = nosA.get(i).random == null ? -1 : nosA.indexOf(nosA.get(i).random);
            int idxB = nosB.get(i).random == null ? -1 : nosB.indexOf(nosB.get(i).random);
            if (idxA != idxB) return false;
        }
        return true;
    }

    static boolean saoNosDiferentes(Node a, Node b) {
        for (Node n = a, m = b; n != null && m != null; n = n.next, m = m.next) {
            if (n == m) return false;
        }
        return true;
    }

    static Node copyRandomList(Node head) {
        throw new UnsupportedOperationException("TODO");
    }
}
