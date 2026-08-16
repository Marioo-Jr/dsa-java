import util.Assert;
import util.TreeNode;

/* 07 — Trees | Teoria: Binary Search Tree (Insert/Search/Remove)
 * Lição de referência: NeetCode DSA for Beginners → "Binary Search Tree", "BST Insert/Remove"
 *
 * IDEIA: numa BST, todo nó mantém a invariante "esquerda < nó < direita".
 * Isso permite busca/inserção em O(log n) numa árvore balanceada (O(n) no
 * pior caso, se degenerar numa lista). Remover é o caso mais delicado: tem
 * 3 casos (0, 1 ou 2 filhos) — o caso de 2 filhos exige substituir o nó pelo
 * seu sucessor (menor valor da subárvore direita) ou predecessor.
 *
 * ANTES DE CODAR, escreva aqui sua ideia em 3 linhas:
 *   1.
 *   2.
 *   3.
 */
public class MinhaBST {

    // TODO: insere valor na BST enraizada em root e retorna a nova raiz
    // (root pode mudar se a árvore estava vazia). Percorra comparando com o
    // valor do nó atual: menor vai pra esquerda, maior (ou igual) pra direita.
    static TreeNode inserir(TreeNode root, int valor) {
        throw new UnsupportedOperationException("TODO");
    }

    // TODO: retorna true se valor existe na BST enraizada em root.
    static boolean buscar(TreeNode root, int valor) {
        throw new UnsupportedOperationException("TODO");
    }

    // TODO: remove valor da BST enraizada em root e retorna a nova raiz.
    // Casos: nó folha (remove direto), nó com um filho (promove o filho),
    // nó com dois filhos (substitui pelo sucessor — menor da subárvore
    // direita — e remove o sucessor de onde ele estava).
    static TreeNode remover(TreeNode root, int valor) {
        throw new UnsupportedOperationException("TODO");
    }

    public static void main(String[] args) {
        TreeNode raiz = null;
        int[] valores = {5, 3, 8, 1, 4, 7, 9};
        for (int v : valores) raiz = inserir(raiz, v);

        Assert.isTrue(buscar(raiz, 4), "4 foi inserido");
        Assert.isTrue(!buscar(raiz, 6), "6 não foi inserido");
        Assert.isTrue(buscar(raiz, 5), "raiz original ainda está lá");

        raiz = remover(raiz, 1); // 1 é folha (0 filhos)
        Assert.isTrue(!buscar(raiz, 1), "1 (folha) foi removido");
        Assert.isTrue(buscar(raiz, 3), "3 continua na árvore");

        raiz = remover(raiz, 3); // agora 3 só tem o filho direito (4) -> 1 filho
        Assert.isTrue(!buscar(raiz, 3), "3 (um filho) foi removido");
        Assert.isTrue(buscar(raiz, 4), "4 (filho de 3) continua acessível");

        raiz = remover(raiz, 8); // 8 tem dois filhos (7 e 9) -> 2 filhos
        Assert.isTrue(!buscar(raiz, 8), "8 (dois filhos) foi removido");
        Assert.isTrue(buscar(raiz, 7), "7 continua acessível");
        Assert.isTrue(buscar(raiz, 9), "9 continua acessível");

        Assert.resumo();
    }
}
