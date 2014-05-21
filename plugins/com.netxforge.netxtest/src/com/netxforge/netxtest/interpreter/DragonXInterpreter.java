/*******************************************************************************
 * Copyright (c) 10 apr. 2014 NetXForge.
 * 
 * This program is free software: you can redistribute it and/or modify it under
 * the terms of the GNU General Public License as published by the Free Software
 * Foundation, either version 3 of the License, or (at your option) any later
 * version.
 * 
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU General Public License for more
 * details. You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>
 * 
 * Contributors: Christophe Bouhier - initial API and implementation and/or
 * initial documentation
 *******************************************************************************/
package com.netxforge.netxtest.interpreter;

import java.math.BigDecimal;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.netxforge.netxtest.dragonX.Action;
import com.netxforge.netxtest.dragonX.DragonX;
import com.netxforge.netxtest.dragonX.DragonXPackage;
import com.netxforge.netxtest.dragonX.TestCase;

/**
 * A Dispatcher for instances of EClasses of the {@link DragonXPackage}.
 * 
 * It internally uses a polymorphic dispatcher to dispatch between the
 * implementations for the different EClasses.
 * 
 * @author Christophe Bouhier - An implementation for the DragonX Language
 */
public class DragonXInterpreter {

	private PrintingPolymorphicDispatcher<BigDecimal> dispatcher = PrintingPolymorphicDispatcher
			.createForSingleTarget("internalEvaluate", 2, 2, this);

	private IExternalDispatcher extDispatcher;

	/*
	 * Construct without a root object constraint.
	 */
	@Inject
	public DragonXInterpreter() {
	}

	/**
	 * Example dispatch.
	 */
	public Object evaluate(DragonX script) {

		Object lastResult = null;
		for (TestCase t : script.getTests()) {

			// No dispatch parameters
			Object result = dispatcher.invoke(t,
					ImmutableMap.<String, Object> of());

			if (result != null) {
				lastResult = result;
			}

		}
		return lastResult;
	}

	protected Object internalEvaluate(TestCase t,
			ImmutableMap<String, Object> args) {

		Object lastResult = null;
		for (Action a : t.getProcedure().getActions()) {
			Object result = dispatcher.invoke(a, ImmutableMap.copyOf(args));
			if (result != null) {
				lastResult = result;
			}
		}
		return lastResult;

	}

	protected Object internalEvaluate(Action a,
			ImmutableMap<String, Object> values) {
		extDispatcher.dispatch(a);
		return null;
	}

	public IExternalDispatcher getExtDispatcher() {
		return extDispatcher;
	}

	public void setExtDispatcher(IExternalDispatcher extDispatcher) {
		this.extDispatcher = extDispatcher;
	}

}
