package com.partialmap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartialMap3<A, B, C, D> {
    private final Map<Key3<A, B, C>,D> map = new HashMap<>();

    public D get(A a, B b, C c) {
        return map.get(new Key3<>(a, b, c));
    }

    public void put(A a, B b, C c, D d) {
        Key3<A, B, C> key = new Key3<>(a, b, c);
        map.put(key, d);
    }

    public PartialMap2<B, C, D> applyFirst(A a) {
        PartialMap2<B, C, D> result = new PartialMap2<>();
        List<Map.Entry<Key3<A, B, C>, D>> collect = map.entrySet().stream().filter(e -> e.getKey().getFirst().equals(a)).collect(Collectors.toList());
        for (var entry: collect) {
            result.put(entry.getKey().getSecond(), entry.getKey().getThird(), entry.getValue());
        }
        return result;
    }

    public PartialMap2<A, C, D> applySecond(B b) {
        PartialMap2<A, C, D> result = new PartialMap2<>();
        List<Map.Entry<Key3<A, B, C>, D>> collect = map.entrySet().stream().filter(e -> e.getKey().getSecond().equals(b)).collect(Collectors.toList());
        for (var entry: collect) {
            result.put(entry.getKey().getFirst(), entry.getKey().getThird(), entry.getValue());
        }
        return result;
    }

    public PartialMap2<A,B,D> applyThird(C c) {
        PartialMap2<A, B, D> result = new PartialMap2<>();
        List<Map.Entry<Key3<A, B, C>, D>> collect = map.entrySet().stream().filter(e -> e.getKey().getThird().equals(c)).collect(Collectors.toList());
        for (var entry: collect) {
            result.put(entry.getKey().getFirst(), entry.getKey().getSecond(), entry.getValue());
        }
        return result;
    }
}
