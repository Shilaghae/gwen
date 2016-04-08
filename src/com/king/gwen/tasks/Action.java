package com.king.gwen.tasks;

/**
 * This interface defines an action to be taken on an object of type {@link T}. The action should return an object of type {@link K} which
 * describes the state of the system after the action was taken.
 *
 * @param <T> The type of the object to act upon.
 */
public interface Action<T> {
	public void actOn(T systemToBeUsedToAct);
}
