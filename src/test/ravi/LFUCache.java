package test.ravi;

public class LFUCache implements Cache {
    public LFUCache(int size, Policy policy) {
    }

    public LFUCache(int size) {
    }
    @Override
    public Cache<Integer, String> getCache(int size) {
        return getCache(size, Policy.LRU);
    }

    @Override
    public Cache<Integer, String> getCache(int size, Policy policy) {
        return null;
    }
}
