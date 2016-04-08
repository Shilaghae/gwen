
package com.king.gwen.tasks;

/**
 * This interface defines an arrangement to be performed with the help of an object of type {@link T}.
 * @param <T> The type of the object used to perform the arrangement with.
 */
public interface Arrangement<T> {

    void arrangeWith(T objectUsedToPerformArrangement);
}
