package com.netxforge.netxtest;

import com.netxforge.netxtest.DragonXInjectorProvider;
import com.netxforge.netxtest.dragonX.DragonX;
import javax.inject.Inject;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.junit.Test;
import org.junit.runner.RunWith;

@InjectWith(DragonXInjectorProvider.class)
@RunWith(XtextRunner.class)
@SuppressWarnings("all")
public class DragonXBasicTest {
  @Inject
  private ParseHelper<DragonX> parser;
  
  @Test
  public void parseDomainmodel() {
    try {
      final DragonX model = this.parser.parse(
        "// A Mobile originating call test script\n\nUE{ \n\tMSISDN:31612962997\n}\n\n\nTestCase  {\n\tMobileOriginatingCall\n\tDescription:\"This tests makes a mobile originating call and from one UE to another UE\"\n\t\n\tTest{\n\t\tCALL { \n\t\t\n\t\tAnswerTime : 600 // Seconds\n\t\t \t\n\t\t}\n\t\n\t}\n} \n\n");
      model.getTests();
      model.getUes();
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
