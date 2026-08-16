import util.Assert;
import java.util.List;
import java.util.Arrays;

/* LeetCode 271 — Encode and Decode Strings [Medium] | Tópico: Arrays & Hashing
 * Padrão: length-prefixing (não dá pra usar um delimitador simples tipo vírgula,
 * porque as strings do input podem conter qualquer caractere, inclusive vírgula)
 * ⚠️ Não coberto pela playlist do Nick White — ver fallback em PLAYLIST_INDEX.md
 *
 * MINHA IDEIA (escrever ANTES de codar — pense: como marcar onde uma string
 * termina e a próxima começa, sem ambiguidade, para QUALQUER conteúdo?):
 *   1.
 *   2.
 *   3.
 *
 * Complexidade:  tempo O(?)  espaço O(?)
 * Status: sozinho | com dica | viu o vídeo
 */
public class EncodeDecodeStrings {

    public static void main(String[] args) {
        List<String> original = Arrays.asList("hello", "world", "leet,code", "");
        String codificado = encode(original);
        List<String> decodificado = decode(codificado);
        Assert.equals(original, decodificado, "encode seguido de decode retorna o original");

        Assert.equals(List.of(), decode(encode(List.of())), "lista vazia");
        Assert.equals(List.of(""), decode(encode(List.of(""))), "uma string vazia");

        Assert.resumo();
    }

    static String encode(List<String> strs) {
        throw new UnsupportedOperationException("TODO");
    }

    static List<String> decode(String s) {
        throw new UnsupportedOperationException("TODO");
    }
}
