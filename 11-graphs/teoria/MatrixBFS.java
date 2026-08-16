import util.Assert;
import java.util.*;

/* 11 — Graphs | Teoria: Matrix BFS
 * Lição de referência: NeetCode DSA for Beginners → "Matrix BFS"
 *
 * IDEIA: BFS explora o grafo "em camadas" a partir de uma origem, usando uma
 * fila — por isso é a ferramenta certa para achar a distância MÍNIMA em
 * número de passos até cada célula (DFS não garante o caminho mais curto).
 * grid[i][j] == 1 é parede (bloqueada); 0 é célula livre. A origem (0,0) é
 * sempre livre. Retorne uma matriz de distâncias, com -1 para células
 * inalcançáveis (paredes ou isoladas por paredes).
 *
 * ANTES DE CODAR, escreva aqui sua ideia em 3 linhas:
 *   1.
 *   2.
 *   3.
 */
public class MatrixBFS {

    // TODO: BFS a partir de (0,0). dist[0][0] = 0. Para cada célula livre
    // nunca visitada, dist = dist do vizinho que a descobriu + 1. Células
    // parede ou nunca alcançadas ficam com -1.
    static int[][] bfsDistancias(int[][] grid) {
        throw new UnsupportedOperationException("TODO");
    }

    public static void main(String[] args) {
        int[][] gridAberto = {
                {0, 0, 0},
                {0, 0, 0},
                {0, 0, 0}
        };
        int[][] esperadoAberto = {
                {0, 1, 2},
                {1, 2, 3},
                {2, 3, 4}
        };
        Assert.arrayEquals(esperadoAberto[0], bfsDistancias(gridAberto)[0], "linha 0 sem paredes");
        Assert.arrayEquals(esperadoAberto[1], bfsDistancias(gridAberto)[1], "linha 1 sem paredes");
        Assert.arrayEquals(esperadoAberto[2], bfsDistancias(gridAberto)[2], "linha 2 sem paredes");

        int[][] gridComParede = {
                {0, 0, 0},
                {1, 1, 0},
                {0, 0, 0}
        };
        int[][] esperadoComParede = {
                {0, 1, 2},
                {-1, -1, 3},
                {6, 5, 4}
        };
        Assert.arrayEquals(esperadoComParede[0], bfsDistancias(gridComParede)[0], "linha 0 com parede");
        Assert.arrayEquals(esperadoComParede[1], bfsDistancias(gridComParede)[1], "linha 1 (paredes viram -1)");
        Assert.arrayEquals(esperadoComParede[2], bfsDistancias(gridComParede)[2], "linha 2, contorna a parede");

        Assert.resumo();
    }
}
