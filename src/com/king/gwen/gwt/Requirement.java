package com.king.gwen.gwt;

import com.king.gwen.collaborators.Arranger;

public interface Requirement<T> extends Arranger{
	
	T require();
}
