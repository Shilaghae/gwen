
package com.king.gwen;

import com.king.gwen.collaborators.Actor;
import com.king.gwen.collaborators.Arranger;
import com.king.gwen.collaborators.Asserter;
import com.king.gwen.gwt.Given;
import com.king.gwen.gwt.Requirement;
import com.king.gwen.gwt.Then;
import com.king.gwen.gwt.When;

public class Gwen {

	public static <T> T require(Requirement<T> object) {
		return object.require();
	}
	
    public static <T> T given(Given<T> object) {
        return object.given();
    }

    public static <T extends Arranger> T given(T actor) {
        return actor;
    }

    public static <T> T when(When<T> object) {
        return object.when();
    }

    public static <T extends Actor> T when(T actor) {
        return actor;
    }

    public static <T> T then(Then<T> object) {
        return object.then();
    }

    public static <T extends Asserter> T then(T actor) {
        return actor;
    }

}
