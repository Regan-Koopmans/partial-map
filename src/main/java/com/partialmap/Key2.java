package com.partialmap;

import java.util.Objects;

public class Key2<A, B> {

    private A first;
    private B second;

    public A getFirst() {
        return first;
    }

    public B getSecond() {
        return second;
    }

    Key2(A a, B b) {
        first = a;
        second = b;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Key2<?, ?> key2 = (Key2<?, ?>) o;
        return Objects.equals(first, key2.first) && Objects.equals(second, key2.second);
    }

    @Override
    public int hashCode() {
        return Objects.hash(first, second);
    }
}
