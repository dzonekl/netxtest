package com.netxforge.netxtest

import com.netxforge.netxtest.dragonX.DragonX
import javax.inject.Inject
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.junit.Test
import org.junit.runner.RunWith

//import java.io.URL 
@InjectWith(typeof(DragonXInjectorProvider))
@RunWith(typeof(XtextRunner))
class DragonXBasicTest {

	@Inject
	ParseHelper<DragonX> parser

	@Test
	def void parseDomainmodel() {

		//	URL url = this.getClass().getResource("/SNMPv2-SMI.txt.mib")
		val model = parser.parse(
			"// A Mobile originating call test script

UE{ 
	MSISDN:31612962997
}


TestCase  {
	MobileOriginatingCall
	Description:\"This tests makes a mobile originating call and from one UE to another UE\"
	
	Test{
		CALL { 
		
		AnswerTime : 600 // Seconds
		 	
		}
	
	}
} 

")

		model.tests; // Obtain the tests. 
		model.ues; // Obtain the ues. 

		}

	}
	