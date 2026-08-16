import util.Assert;
import java.util.List;

/* LeetCode 51 — N-Queens [Hard] | Tópico: Backtracking
 * Padrão: escolher / explorar / desfazer, linha por linha, marcando colunas e diagonais atacadas
 *
 * MINHA IDEIA (escrever ANTES de codar):
 *   1.
 *   2.
 *   3.
 *
 * Complexidade:  tempo O(n!)  espaço O(n^2) por solução + O(n) de recursão
 * Status: sozinho | com dica | viu o vídeo
 * Vídeo: ver PLAYLIST_INDEX.md
 */
public class NQueens {

    public static void main(String[] args) {
        List<List<String>> r1 = solveNQueens(4);
        Assert.equals(2, r1.size(), "n=4 -> 2 soluções");
        Assert.isTrue(r1.contains(List.of(".Q..", "...Q", "Q...", "..Q.")), "contém a 1ª solução clássica");
        Assert.isTrue(r1.contains(List.of("..Q.", "Q...", "...Q", ".Q..")), "contém a 2ª solução clássica");

        List<List<String>> r2 = solveNQueens(1);
        Assert.equals(1, r2.size(), "n=1 -> 1 solução trivial");
        Assert.isTrue(r2.contains(List.of("Q")), "tabuleiro 1x1 com a rainha sozinha");

        List<List<String>> r3 = solveNQueens(2);
        Assert.equals(0, r3.size(), "n=2 -> nenhuma solução possível");

        List<List<String>> r4 = solveNQueens(3);
        Assert.equals(0, r4.size(), "n=3 -> nenhuma solução possível");

        Assert.resumo();
    }

    static List<List<String>> solveNQueens(int n) {
        throw new UnsupportedOperationException("TODO");
    }
}
