package com.netxforge.netxtest.interpreter;

import com.netxforge.netxtest.dragonX.Action;
import com.netxforge.netxtest.dragonX.Parameter;
import com.netxforge.netxtest.dragonX.UE;
import com.netxforge.netxtest.dragonX.UEMetaObject;

/**
 * A dispatching interface for the DragonX Grammar.
 * 
 * @author Christophe Bouhier
 * 
 */
public interface IExternalDispatcher {

	/**
	 * Process the {@link Action} object.
	 * 
	 * @param action
	 */
	public void processAction(Action action);

	/**
	 * Process the {@link Parameter} object.
	 * 
	 * @param p
	 */
	public void processParameter(Parameter p);

	/**
	 * Process the {@link UE} object.
	 * 
	 * @param ue
	 */
	public void processUE(UE ue);

	/**
	 * Process the {@link UEMetaObject} object.
	 * 
	 * @param metaObject
	 */
	public void processMetaObject(UEMetaObject metaObject);

	/**
	 * Execute the dispatching.
	 */
	public void execute();

}
