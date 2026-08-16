import util.Assert;
import java.util.*;

/* 12 — Advanced Graphs | Teoria: Topological Sort (Kahn's Algorithm)
 * Lição de referência: NeetCode Advanced Algorithms → "Topological Sort"
 *
 * IDEIA: uma ordenação topológica só existe em grafos DIRECIONADOS ACÍCLICOS
 * (DAGs) e ordena os nós de forma que toda aresta u->v tenha u antes de v.
 * O algoritmo de Kahn faz isso com BFS: calcule o grau de entrada
 * (in-degree) de cada nó, comece pelos nós com in-degree 0 (sem
 * dependências), e ao "processar" um nó, decremente o in-degree dos seus
 * vizinhos — quando um vizinho chega a 0, ele entra na fila. Se no final
 * nem todos os nós foram processados, existe um ciclo e não há ordenação
 * topológica válida.
 *
 * ANTES DE CODAR, escreva aqui sua ideia em 3 linhas:
 *   1.
 *   2.
 *   3.
 */
public class TopologicalSort {

    // edges: cada linha é {de, para}, "de" deve vir antes de "para".
    // Retorna uma ordenação topológica válida, ou lista vazia se houver ciclo.
    // TODO: calcule in-degree de cada nó, inicialize a fila com os de
    // in-degree 0, processe em BFS decrementando in-degree dos vizinhos.
    static List<Integer> topoSort(int n, int[][] edges) {
        throw new UnsupportedOperationException("TODO");
    }

    /** Confere se `ordem` é permutação de 0..n-1 e respeita todas as arestas. */
    static boolean isOrdemTopologicaValida(List<Integer> ordem, int n, int[][] edges) {
        if (ordem.size() != n) return false;
        int[] posicao = new int[n];
        boolean[] visto = new boolean[n];
        for (int i = 0; i < ordem.size(); i++) {
            int no = ordem.get(i);
            if (visto[no]) return false;
            visto[no] = true;
            posicao[no] = i;
        }
        for (int[] e : edges) {
            if (posicao[e[0]] >= posicao[e[1]]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        // grafo clássico: 5,4 não dependem de nada; 2 e 0 dependem de 5; etc.
        int[][] edges = {{5, 2}, {5, 0}, {4, 0}, {4, 1}, {2, 3}, {3, 1}};
        List<Integer> ordem = topoSort(6, edges);
        Assert.isTrue(isOrdemTopologicaValida(ordem, 6, edges), "ordem topológica respeita todas as arestas");

        // ciclo: 0 -> 1 -> 2 -> 0, não existe ordenação
        int[][] edgesCiclo = {{0, 1}, {1, 2}, {2, 0}};
        List<Integer> ordemCiclo = topoSort(3, edgesCiclo);
        Assert.equals(0, ordemCiclo.size(), "grafo com ciclo não tem ordenação topológica");

        // sem arestas: qualquer ordem serve, só precisa ter todos os nós
        List<Integer> ordemSemArestas = topoSort(3, new int[][]{});
        Assert.isTrue(isOrdemTopologicaValida(ordemSemArestas, 3, new int[][]{}), "sem arestas, qualquer permutação vale");

        Assert.resumo();
    }
}
