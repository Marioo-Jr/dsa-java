import util.Assert;

/* LeetCode 981 — Time Based Key Value Store [Medium] | Tópico: Binary Search
 * Padrão: HashMap<chave, List<[timestamp, valor]>> + busca binária (lower
 * bound) na lista de timestamps pra achar o maior timestamp <= consulta
 *
 * MINHA IDEIA (escrever ANTES de codar):
 *   1.
 *   2.
 *   3.
 *
 * Complexidade:  tempo O(?) por operação  espaço O(?)
 * Status: sozinho | com dica | viu o vídeo
 * Vídeo: ver PLAYLIST_INDEX.md
 */
public class TimeBasedKeyValueStore {

    public TimeBasedKeyValueStore() {
        throw new UnsupportedOperationException("TODO");
    }

    // set(key, value, timestamp): timestamps de sets para uma mesma key são
    // sempre estritamente crescentes.
    public void set(String key, String value, int timestamp) {
        throw new UnsupportedOperationException("TODO");
    }

    // get(key, timestamp): retorna o valor associado à chave com o MAIOR
    // timestamp_set <= timestamp. Se não houver nenhum, retorna "".
    public String get(String key, int timestamp) {
        throw new UnsupportedOperationException("TODO");
    }

    public static void main(String[] args) {
        // NOTA: como o construtor/métodos lançam TODO, este main() vai
        // lançar exceção até você implementar a classe — isso é esperado.
        TimeBasedKeyValueStore store = new TimeBasedKeyValueStore();

        store.set("foo", "bar", 1);
        Assert.equals("bar", store.get("foo", 1), "get exatamente no timestamp do set");
        Assert.equals("bar", store.get("foo", 3), "get depois do timestamp, mesmo valor");

        store.set("foo", "bar2", 4);
        Assert.equals("bar", store.get("foo", 3), "get antes do segundo set ainda retorna o primeiro valor");
        Assert.equals("bar2", store.get("foo", 4), "get exatamente no segundo set");
        Assert.equals("bar2", store.get("foo", 10), "get bem depois retorna o valor mais recente");

        Assert.equals("", store.get("chaveInexistente", 1), "chave nunca foi setada");
        Assert.equals("", store.get("foo", 0), "get antes de qualquer set para a chave");

        Assert.resumo();
    }
}
