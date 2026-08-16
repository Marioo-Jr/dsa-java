import util.Assert;

/* LeetCode 91 — Decode Ways [Medium] | Tópico: 1-D Dynamic Programming
 * Padrão: DP 1D (contar caminhos validos, tipo Climbing Stairs com regras)
 *
 * MINHA IDEIA (escrever ANTES de codar):
 *   1.
 *   2.
 *   3.
 *
 * Complexidade:  tempo O(?)  espaço O(?)
 * Status: sozinho | com dica | viu o vídeo
 * Vídeo: ver PLAYLIST_INDEX.md
 */
public class DecodeWays {

    public static void main(String[] args) {
        Assert.equals(2, numDecodings("12"), "'12' -> 'AB' ou 'L': 2 formas");
        Assert.equals(3, numDecodings("226"), "'226' -> 'BZ','VF','BBF': 3 formas");
        Assert.equals(0, numDecodings("06"), "zero sem prefixo valido -> 0 formas");
        Assert.equals(0, numDecodings("0"), "'0' sozinho nao decodifica -> 0");
        Assert.equals(1, numDecodings("10"), "'10' -> 'J': 1 forma");
        Assert.resumo();
    }

    static int numDecodings(String s) {
        throw new UnsupportedOperationException("TODO");
    }
}
