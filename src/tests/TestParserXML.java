package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import kalkulatorWalut.ParserXML;

/*
 * @author Julia Zielonka
 * 
 * TestParserXML
 *
 * 26.05.2021
 * 
 */

public class TestParserXML {
	//test parse method.
	@Test
	public void parse() {
		
		String path = "kursy_walut.xml";
		
		Assertions.assertDoesNotThrow(() -> ParserXML.parse(path));
}
	//test parse method if the file does not exist. 
	@Test
	public void parse_catch_exception() {
		
		//create path to nonexisting file
		String path = "nieistniejacyplik.xml";
		
		Assertions.assertDoesNotThrow(() -> ParserXML.parse(path));
	}
}
