import util.Assert;
import java.util.List;

/* LeetCode 355 — Design Twitter [Medium] | Tópico: Heap / Priority Queue
 * Padrão: HashMap de listas de tweets por usuário + heap para mesclar os k mais recentes
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
public class DesignTwitter {

    public DesignTwitter() {
        throw new UnsupportedOperationException("TODO");
    }

    public void postTweet(int userId, int tweetId) {
        throw new UnsupportedOperationException("TODO");
    }

    public List<Integer> getNewsFeed(int userId) {
        throw new UnsupportedOperationException("TODO");
    }

    public void follow(int followerId, int followeeId) {
        throw new UnsupportedOperationException("TODO");
    }

    public void unfollow(int followerId, int followeeId) {
        throw new UnsupportedOperationException("TODO");
    }

    public static void main(String[] args) {
        DesignTwitter twitter = new DesignTwitter();
        twitter.postTweet(1, 5);
        Assert.equals(List.of(5), twitter.getNewsFeed(1), "feed só com o próprio tweet");
        twitter.follow(1, 2);
        twitter.postTweet(2, 6);
        Assert.equals(List.of(6, 5), twitter.getNewsFeed(1), "feed com tweet mais recente primeiro");
        twitter.unfollow(1, 2);
        Assert.equals(List.of(5), twitter.getNewsFeed(1), "feed após unfollow");

        DesignTwitter t2 = new DesignTwitter();
        Assert.equals(List.of(), t2.getNewsFeed(1), "feed vazio sem tweets nem follows");
        t2.follow(1, 1);
        t2.postTweet(1, 100);
        Assert.equals(List.of(100), t2.getNewsFeed(1), "seguir a si mesmo não duplica o próprio tweet");

        Assert.resumo();
    }
}
