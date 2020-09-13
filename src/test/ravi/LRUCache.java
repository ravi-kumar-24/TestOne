package test.ravi;

import java.util.*;

public class LRUCache implements Cache {
    int size;

    Map<Integer, String> map = new HashMap<>();
    List list = new LinkedList();

    public LRUCache(int size, Policy policy) {
    }

    public LRUCache(int size) {
        this.size = size;
    }
    @Override
    public Cache<Integer, String> getCache(int size) {
        return getCache(size, Policy.LRU);
    }

    @Override
    public Cache<Integer, String> getCache(int size, Policy policy) {
        return null;
    }

    public void add(Integer key, String value){
        if(size> list.size()) {
            map.put(key, value);
            list.add(key);
        }else {
            map.remove(list.get(list.size()-1));
        }
    }

    public String get(Integer key){
        updateQueue(key);
      return   map.get(key);
    }

    private void updateQueue(Integer key) {
        /*for (int i =0; i< list.size() ; i++ ){

        }*/

        list.get(key);
    }


}
