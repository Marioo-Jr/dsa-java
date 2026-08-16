import util.Assert;

/* LeetCode 146 — LRU Cache [Medium] | Tópico: Linked List
 * Padrão: HashMap + lista duplamente ligada (para O(1) get/put e O(1) mover para o topo)
 *
 * MINHA IDEIA (escrever ANTES de codar):
 *   1.
 *   2.
 *   3.
 *
 * Complexidade:  tempo O(1) por operação  espaço O(capacidade)
 * Status: sozinho | com dica | viu o vídeo
 * Vídeo: ver PLAYLIST_INDEX.md
 */
public class LRUCache {

    public LRUCache(int capacity) {
        throw new UnsupportedOperationException("TODO");
    }

    public int get(int key) {
        throw new UnsupportedOperationException("TODO");
    }

    public void put(int key, int value) {
        throw new UnsupportedOperationException("TODO");
    }

    public static void main(String[] args) {
        LRUCache cache = new LRUCache(2);
        cache.put(1, 1);
        cache.put(2, 2);
        Assert.equals(1, cache.get(1), "get(1) retorna 1");
        cache.put(3, 3); // remove a chave 2 (menos recentemente usada)
        Assert.equals(-1, cache.get(2), "chave 2 foi removida (LRU)");
        cache.put(4, 4); // remove a chave 1
        Assert.equals(-1, cache.get(1), "chave 1 foi removida (LRU)");
        Assert.equals(3, cache.get(3), "chave 3 ainda existe");
        Assert.equals(4, cache.get(4), "chave 4 ainda existe");
        Assert.resumo();
    }
}
