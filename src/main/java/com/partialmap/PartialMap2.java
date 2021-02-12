package com.partialmap;

import java.util.HashMap;
import java.util.Map;

public class PartialMap2<A, B, C> {

    private final Map<Key2<A, B>, C> map = new HashMap<>();

    public C get(A first, B second) {
        return map.get(new Key2<>(first, second));
    }

    public void put(A first, B second, C value) {
        Key2<A, B> key = new Key2<>(first, second);
        map.put(key, value);
    }

}
