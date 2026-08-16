package util;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Nó de árvore binária, no formato usado pelo LeetCode. Compartilhado por
 * todos os exercícios do tópico 07-trees.
 *
 * `deArray` recebe o formato nível-a-nível do LeetCode (null = filho
 * ausente): {3, 9, 20, null, null, 15, 7} vira a árvore:
 *
 *          3
 *         / \
 *        9  20
 *           / \
 *          15  7
 *
 * Uso típico num teste:
 *   TreeNode raiz = TreeNode.deArray(new Integer[]{3, 9, 20, null, null, 15, 7});
 *   Assert.equals(3, maxDepth(raiz), "profundidade");
 */
public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode() {}
    public TreeNode(int val) { this.val = val; }
    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public static TreeNode deArray(Integer[] valores) {
        if (valores == null || valores.length == 0 || valores[0] == null) return null;

        TreeNode raiz = new TreeNode(valores[0]);
        Queue<TreeNode> fila = new LinkedList<>();
        fila.add(raiz);

        int i = 1;
        while (i < valores.length && !fila.isEmpty()) {
            TreeNode atual = fila.poll();

            if (i < valores.length) {
                Integer esquerdaVal = valores[i++];
                if (esquerdaVal != null) {
                    atual.left = new TreeNode(esquerdaVal);
                    fila.add(atual.left);
                }
            }
            if (i < valores.length) {
                Integer direitaVal = valores[i++];
                if (direitaVal != null) {
                    atual.right = new TreeNode(direitaVal);
                    fila.add(atual.right);
                }
            }
        }
        return raiz;
    }

    /** Serializa nível-a-nível, cortando os nulls "de sobra" no final (igual ao LeetCode). */
    public static List<Integer> paraArray(TreeNode raiz) {
        List<Integer> resultado = new ArrayList<>();
        if (raiz == null) return resultado;

        Queue<TreeNode> fila = new LinkedList<>();
        fila.add(raiz);
        while (!fila.isEmpty()) {
            TreeNode atual = fila.poll();
            if (atual == null) {
                resultado.add(null);
                continue;
            }
            resultado.add(atual.val);
            fila.add(atual.left);
            fila.add(atual.right);
        }
        while (!resultado.isEmpty() && resultado.get(resultado.size() - 1) == null) {
            resultado.remove(resultado.size() - 1);
        }
        return resultado;
    }
}
