package com.partialmap;


import java.util.HashMap;
import java.util.Map;

public class PartialMap3<A, B, C, D> {

    private Map<Integer, D> indexA = new HashMap<>();
    private Map<Integer, D> indexB = new HashMap<>();
    private Map<Integer, D> indexC = new HashMap<>();
    private final Map<Integer,D> map = new HashMap<>();

    public D get(A a, B b, C c) {
        return map.get(a.hashCode() + b.hashCode() + c.hashCode());
    }

    public void put(A a, B b, C c, D d) {
        Integer hashNumber = a.hashCode() + b.hashCode() + c.hashCode();
        indexA.put(hashNumber, d);
        indexB.put(hashNumber, d);
        indexC.put(hashNumber, d);
        map.put(hashNumber, d);
    }

    public PartialMap2<B, C, D> applyFirst(A a) {
        map.entrySet().stream().filter(e -> indexA.containsKey(e.getKey()));
    }
}
