import util.Assert;

/* LeetCode 2013 — Detect Squares [Medium] | Tópico: Math & Geometry
 * Padrão: HashMap de contagem de pontos + verificar os 2 quadrados possíveis por par de diagonais
 *
 * MINHA IDEIA (escrever ANTES de codar):
 *   1.
 *   2.
 *   3.
 *
 * Complexidade:  tempo O(?) por consulta  espaço O(?)
 * Status: sozinho | com dica | viu o vídeo
 * Vídeo: ver PLAYLIST_INDEX.md
 */
public class DetectSquares {

    public DetectSquares() {
        throw new UnsupportedOperationException("TODO");
    }

    public void add(int[] point) {
        throw new UnsupportedOperationException("TODO");
    }

    public int count(int[] point) {
        throw new UnsupportedOperationException("TODO");
    }

    public static void main(String[] args) {
        DetectSquares ds = new DetectSquares();
        ds.add(new int[]{3, 10});
        ds.add(new int[]{11, 2});
        ds.add(new int[]{3, 2});
        Assert.equals(1, ds.count(new int[]{11, 10}), "forma 1 quadrado com os 3 pontos");
        Assert.equals(0, ds.count(new int[]{14, 8}), "não forma quadrado nenhum");
        ds.add(new int[]{11, 2}); // ponto duplicado é permitido
        Assert.equals(2, ds.count(new int[]{11, 10}), "agora forma 2 quadrados (ponto duplicado)");
        Assert.resumo();
    }
}
