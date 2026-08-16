import util.Assert;
import util.TreeNode;

import java.util.ArrayList;
import java.util.List;

/* 07 — Trees | Teoria: BFS (Level Order)
 * Lição de referência: NeetCode DSA for Beginners → "Breadth-First Search"
 *
 * IDEIA: BFS visita a árvore nível por nível, usando uma fila (não uma
 * pilha/recursão como o DFS). Para separar os níveis, guarda-se o tamanho
 * da fila no início de cada iteração — esse é exatamente o número de nós
 * daquele nível.
 *
 * ANTES DE CODAR, escreva aqui sua ideia em 3 linhas:
 *   1.
 *   2.
 *   3.
 */
public class TravessiaBFS {

    // TODO: BFS iterativo com fila. Retorna uma lista de níveis, cada nível
    // sendo a lista dos valores dos nós naquela profundidade, da esquerda
    // pra direita.
    static List<List<Integer>> levelOrder(TreeNode root) {
        throw new UnsupportedOperationException("TODO");
    }

    public static void main(String[] args) {
        TreeNode arvore = TreeNode.deArray(new Integer[]{3, 9, 20, null, null, 15, 7});
        List<List<Integer>> esperado = List.of(
                List.of(3),
                List.of(9, 20),
                List.of(15, 7)
        );
        Assert.equals(esperado, levelOrder(arvore), "árvore de exemplo do LeetCode");

        Assert.equals(new ArrayList<List<Integer>>(), levelOrder(null), "árvore vazia");

        TreeNode soRaiz = TreeNode.deArray(new Integer[]{1});
        Assert.equals(List.of(List.of(1)), levelOrder(soRaiz), "só a raiz");

        Assert.resumo();
    }
}
