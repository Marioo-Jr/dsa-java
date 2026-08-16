import util.Assert;
import java.util.List;

/* LeetCode 17 — Letter Combinations of a Phone Number [Medium] | Tópico: Backtracking
 * Padrão: escolher / explorar / desfazer sobre o mapa dígito -> letras
 *
 * MINHA IDEIA (escrever ANTES de codar):
 *   1.
 *   2.
 *   3.
 *
 * Complexidade:  tempo O(4^n * n)  espaço O(n) de recursão (fora a saída)
 * Status: sozinho | com dica | viu o vídeo
 * Vídeo: ver PLAYLIST_INDEX.md
 */
public class LetterCombinationsOfAPhoneNumber {

    public static void main(String[] args) {
        List<String> r1 = letterCombinations("23");
        Assert.equals(9, r1.size(), "'23' -> 3*3 = 9 combinações");
        Assert.isTrue(r1.contains("ad") && r1.contains("bd") && r1.contains("cf"),
                "contém ad, bd, cf");

        List<String> r2 = letterCombinations("");
        Assert.equals(0, r2.size(), "string vazia -> lista vazia");

        List<String> r3 = letterCombinations("2");
        Assert.equals(3, r3.size(), "'2' -> 3 combinações (a,b,c)");
        Assert.isTrue(r3.contains("a") && r3.contains("b") && r3.contains("c"), "contém a, b, c");

        Assert.resumo();
    }

    static List<String> letterCombinations(String digits) {
        throw new UnsupportedOperationException("TODO");
    }
}
