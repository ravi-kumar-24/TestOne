package test.ravi;

public class CacheFactory {

    public static Cache getCache(int size, Policy policy){
        switch (policy){
            case LFR:
                return new LFUCache(size);
            case LRU:
                return new LRUCache(size);
            default:
                return new LRUCache(size, Policy.LRU);
        }

    }
}
