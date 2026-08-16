import util.Assert;

/* 12 — Advanced Graphs | Teoria: Union-Find (Disjoint Set Union)
 * Lição de referência: NeetCode Advanced Algorithms → "Union-Find"
 *
 * IDEIA: Union-Find mantém uma floresta de conjuntos disjuntos. Cada
 * elemento aponta para um "pai"; a raiz de cada árvore representa o
 * conjunto inteiro. Duas otimizações tornam find/union quase O(1)
 * amortizado:
 *   - path compression: ao fazer find(x), faça cada nó no caminho apontar
 *     direto para a raiz (achata a árvore para buscas futuras).
 *   - union by rank/size: ao unir dois conjuntos, pendure a árvore menor
 *     (ou de rank menor) embaixo da maior, evitando árvores compridas.
 *
 * ANTES DE CODAR, escreva aqui sua ideia em 3 linhas:
 *   1.
 *   2.
 *   3.
 */
public class UnionFind {

    private final int[] pai;
    private final int[] rank;

    public UnionFind(int n) {
        pai = new int[n];
        rank = new int[n];
        for (int i = 0; i < n; i++) pai[i] = i;
    }

    // TODO: encontre a raiz de x, comprimindo o caminho (path compression):
    // cada nó visitado deve passar a apontar direto para a raiz encontrada.
    public int find(int x) {
        throw new UnsupportedOperationException("TODO");
    }

    // TODO: una os conjuntos de a e b. Ache as raízes com find(); se já
    // forem iguais, não faça nada. Senão, pendure a raiz de rank menor
    // embaixo da de rank maior (union by rank); em empate, escolha uma e
    // incremente o rank da nova raiz.
    public void union(int a, int b) {
        throw new UnsupportedOperationException("TODO");
    }

    public boolean connected(int a, int b) {
        return find(a) == find(b);
    }

    public static void main(String[] args) {
        UnionFind uf = new UnionFind(5);
        Assert.isTrue(!uf.connected(0, 2), "0 e 2 ainda não conectados");

        uf.union(0, 1);
        uf.union(1, 2);
        Assert.isTrue(uf.connected(0, 2), "0-1-2 unidos transitivamente");
        Assert.isTrue(!uf.connected(0, 3), "0 e 3 continuam em componentes diferentes");

        uf.union(3, 4);
        Assert.isTrue(uf.connected(3, 4), "3 e 4 unidos");
        Assert.isTrue(!uf.connected(0, 4), "os dois grupos {0,1,2} e {3,4} continuam separados");

        uf.union(2, 4);
        Assert.isTrue(uf.connected(0, 4), "unir 2 e 4 conecta os dois grupos inteiros");

        Assert.resumo();
    }
}
