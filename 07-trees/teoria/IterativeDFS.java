import util.Assert;
import util.TreeNode;

import java.util.ArrayList;
import java.util.List;

/* 07 — Trees | Teoria: Iterative DFS
 * Lição de referência: NeetCode DSA for Advanced Coders → "Iterative DFS"
 *
 * IDEIA: qualquer DFS recursivo pode virar iterativo com uma pilha explícita
 * (a call stack da recursão é substituída por uma Deque manual). O preorder
 * iterativo é direto (empilha direita antes da esquerda, pra desempilhar a
 * esquerda primeiro). O inorder iterativo é mais sutil: precisa "descer"
 * até a esquerda mais funda antes de processar qualquer nó.
 *
 * ANTES DE CODAR, escreva aqui sua ideia em 3 linhas:
 *   1.
 *   2.
 *   3.
 */
public class IterativeDFS {

    // TODO: preorder (nó, esquerda, direita) usando uma Deque como pilha,
    // sem recursão.
    static List<Integer> preorderIterativo(TreeNode root) {
        throw new UnsupportedOperationException("TODO");
    }

    // TODO: inorder (esquerda, nó, direita) usando uma Deque como pilha,
    // sem recursão. Dica: empilhe todos os nós à esquerda antes de
    // processar; depois de processar um nó, vá para a subárvore direita.
    static List<Integer> inorderIterativo(TreeNode root) {
        throw new UnsupportedOperationException("TODO");
    }

    public static void main(String[] args) {
        TreeNode arvore = TreeNode.deArray(new Integer[]{1, null, 2, 3});
        // árvore:  1
        //           \
        //            2
        //           /
        //          3

        Assert.equals(List.of(1, 2, 3), preorderIterativo(arvore), "preorder iterativo");
        Assert.equals(List.of(1, 3, 2), inorderIterativo(arvore), "inorder iterativo");

        Assert.equals(new ArrayList<Integer>(), preorderIterativo(null), "árvore vazia (preorder)");
        Assert.equals(new ArrayList<Integer>(), inorderIterativo(null), "árvore vazia (inorder)");

        Assert.resumo();
    }
}
