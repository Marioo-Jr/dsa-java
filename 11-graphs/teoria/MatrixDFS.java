import util.Assert;

/* 11 — Graphs | Teoria: Matrix DFS
 * Lição de referência: NeetCode DSA for Beginners → "Matrix DFS"
 *
 * IDEIA: uma matriz/grid pode ser vista como um grafo implícito, onde cada
 * célula é um nó e seus vizinhos são as células adjacentes (cima, baixo,
 * esquerda, direita). DFS a partir de uma célula com valor 1 visita toda a
 * "ilha" conectada, marcando as células visitadas para não contá-las de
 * novo. Contar quantas vezes você precisa DISPARAR uma DFS nova = número de
 * ilhas. Este é o exercício de fixação — o problema de verdade equivalente
 * é "Number of Islands" em exercicios/.
 *
 * ANTES DE CODAR, escreva aqui sua ideia em 3 linhas:
 *   1.
 *   2.
 *   3.
 */
public class MatrixDFS {

    // TODO: percorra todas as células; ao achar um 1 não visitado, incremente
    // o contador de ilhas e dispare uma DFS que marca (in-place ou com
    // visited[][]) todas as células 1 conectadas a ela.
    static int contarIlhas(int[][] grid) {
        throw new UnsupportedOperationException("TODO");
    }

    public static void main(String[] args) {
        int[][] grid1 = {
                {1, 1, 0, 0},
                {1, 0, 0, 1},
                {0, 0, 1, 1},
                {0, 0, 0, 0}
        };
        Assert.equals(2, contarIlhas(grid1), "duas ilhas separadas");

        int[][] grid2 = {
                {1, 1, 1},
                {1, 1, 1},
                {1, 1, 1}
        };
        Assert.equals(1, contarIlhas(grid2), "grid inteiro é uma ilha só");

        int[][] grid3 = {
                {0, 0},
                {0, 0}
        };
        Assert.equals(0, contarIlhas(grid3), "sem terra nenhuma");

        Assert.equals(0, contarIlhas(new int[][]{}), "grid vazio");

        Assert.resumo();
    }
}
