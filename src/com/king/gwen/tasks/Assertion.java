
package com.king.gwen.tasks;

/**
 * This interface defines an assertion to be performed with the help of an object of type {@link T}. If the assertion
 * fails, usually a runtime exception is thrown.
 * @param <T> The type of the object used with the assertion.
 */
public interface Assertion<T> {

    void assertWith(T objectUsedToPerformAssertion);
}
