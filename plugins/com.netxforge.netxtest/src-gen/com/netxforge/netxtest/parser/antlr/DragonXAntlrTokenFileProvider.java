/*
* generated by Xtext
*/
package com.netxforge.netxtest.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class DragonXAntlrTokenFileProvider implements IAntlrTokenFileProvider {
	
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
    	return classLoader.getResourceAsStream("com/netxforge/netxtest/parser/antlr/internal/InternalDragonX.tokens");
	}
}
