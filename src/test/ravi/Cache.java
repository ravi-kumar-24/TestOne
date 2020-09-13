package test.ravi;

public interface Cache <Integer, String>{

   public Cache<Integer, String> getCache(int size);
    public Cache<Integer, String> getCache(int size, Policy policy);

}
