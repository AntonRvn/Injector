package org.example;

public class InjectorTest2 {
    public static void main(String[] args) {
        SomeBean sb = new Injector().inject(new SomeBean());
        sb.foo(); // Выведет "A" и "C"
    }
}
