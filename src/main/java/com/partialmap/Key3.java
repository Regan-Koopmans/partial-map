package com.partialmap;

import java.util.Objects;

public class Key3<A, B, C> {

    private A first;
    private B second;
    private C third;

    public A getFirst() {
        return first;
    }

    public B getSecond() {
        return second;
    }

    public C getThird() {
        return third;
    }

    Key3(A a, B b, C c) {
        first = a;
        second = b;
        third = c;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Key3<?, ?, ?> key3 = (Key3<?, ?, ?>) o;
        return Objects.equals(first, key3.first) && Objects.equals(second, key3.second) && Objects.equals(third, key3.third);
    }

    @Override
    public int hashCode() {
        return Objects.hash(first, second, third);
    }
}
