/*
 * generated by Xtext
 */
package com.netxforge.netxtest;

import com.netxforge.netxtest.interpreter.DragonXInterpreter;

/**
 * Use this class to register components to be used at runtime / without the
 * Equinox extension registry.
 */
public class DragonXRuntimeModule extends
		com.netxforge.netxtest.AbstractDragonXRuntimeModule {

	// contributed by
	// org.eclipse.xtext.generator.grammarAccess.GrammarAccessFragment
	public Class<DragonXInterpreter> bindDragonXInterpreter() {
		return DragonXInterpreter.class;
	}

}
