package org.example;

/**
 * Класс SomeBean с полями, помеченными аннотацией @AutoInjectable.
 */
public class SomeBean {
    @AutoInjectable
    private SomeInterface field1;

    @AutoInjectable
    private SomeOtherInterface field2;

    public void foo() {
        field1.doSomething();
        field2.doSomeOther();
    }

    // Геттеры для тестирования
    public SomeInterface getField1() {
        return field1;
    }

    public SomeOtherInterface getField2() {
        return field2;
    }
}
