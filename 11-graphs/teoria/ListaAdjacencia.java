import util.Assert;
import java.util.*;

/* 11 — Graphs | Teoria: Adjacency List
 * Lição de referência: NeetCode DSA for Beginners → "Adjacency List"
 *
 * IDEIA: dado um número de vértices n e uma lista de arestas, a forma mais
 * comum de representar um grafo esparso é uma lista de adjacência: um
 * array/lista de tamanho n onde a posição i guarda a lista de vizinhos do
 * vértice i. Por padrão trate o grafo como NÃO-DIRECIONADO — cada aresta
 * {u, v} deve aparecer tanto na lista de u quanto na lista de v.
 *
 * ANTES DE CODAR, escreva aqui sua ideia em 3 linhas:
 *   1.
 *   2.
 *   3.
 */
public class ListaAdjacencia {

    // TODO: crie uma lista de tamanho n, cada posição começando com uma
    // lista vazia, depois percorra edges adicionando cada aresta nos dois
    // sentidos (grafo não-direcionado).
    static List<List<Integer>> construir(int n, int[][] edges) {
        throw new UnsupportedOperationException("TODO");
    }

    public static void main(String[] args) {
        List<List<Integer>> adj = construir(5, new int[][]{{0, 1}, {0, 2}, {1, 2}, {3, 4}});
        Assert.equals(Arrays.asList(1, 2), adj.get(0), "vizinhos de 0");
        Assert.equals(Arrays.asList(0, 2), adj.get(1), "vizinhos de 1");
        Assert.equals(Arrays.asList(0, 1), adj.get(2), "vizinhos de 2");
        Assert.equals(Arrays.asList(4), adj.get(3), "vizinhos de 3");
        Assert.equals(Arrays.asList(3), adj.get(4), "vizinhos de 4");

        List<List<Integer>> semArestas = construir(1, new int[][]{});
        Assert.equals(0, semArestas.get(0).size(), "vértice isolado sem arestas");

        Assert.resumo();
    }
}
