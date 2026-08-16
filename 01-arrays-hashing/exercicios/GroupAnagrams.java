import util.Assert;
import java.util.List;
import java.util.Arrays;

/* LeetCode 49 — Group Anagrams [Medium] | Tópico: Arrays & Hashing
 * Padrão: HashMap<chave-canônica, List<String>>
 * ⚠️ Não coberto pela playlist do Nick White — ver fallback em PLAYLIST_INDEX.md
 *
 * MINHA IDEIA (escrever ANTES de codar):
 *   1.
 *   2.
 *   3.
 *
 * Complexidade:  tempo O(?)  espaço O(?)
 * Status: sozinho | com dica | viu o vídeo
 */
public class GroupAnagrams {

    public static void main(String[] args) {
        List<List<String>> resultado = groupAnagrams(
                new String[]{"eat", "tea", "tan", "ate", "nat", "bat"});

        // Ordem dos grupos e dos elementos dentro de cada grupo pode variar,
        // então checamos apenas o total de grupos e o tamanho de cada um
        // (ordenado por tamanho para não depender de ordem de iteração).
        int[] tamanhos = resultado.stream().mapToInt(List::size).sorted().toArray();
        Assert.equals(3, resultado.size(), "3 grupos de anagramas");
        Assert.arrayEquals(new int[]{1, 2, 3}, tamanhos, "tamanhos dos grupos: 1, 2, 3");

        Assert.equals(1, groupAnagrams(new String[]{""}).size(), "string vazia forma 1 grupo");
        Assert.equals(1, groupAnagrams(new String[]{"a"}).size(), "elemento único");

        Assert.resumo();
    }

    static List<List<String>> groupAnagrams(String[] strs) {
        throw new UnsupportedOperationException("TODO");
    }
}
