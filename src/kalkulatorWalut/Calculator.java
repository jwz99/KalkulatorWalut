package kalkulatorWalut;

import org.w3c.dom.Element;

/*
 * @author Julia Zielonka
 * 
 * Calculator
 *
 * 25.05.2021
 * 
 */

public class Calculator extends ParserXML{
	
	//method to convert euro to chosen currency.
	public static double convert(double euro, String currency) {
		
		//parse .xml file.
		parse("kursy_walut.xml");
		
		//initialize the result variable.
		double result = 0;
		
		//get every element from every node in the nodeList.
		for (int i = 0; i < nodeList.getLength(); i++) {
		     node = nodeList.item(i);
		     element = (Element) node;
		     
		     //find the rate for the input currency.
		     if(element.getAttribute("currency").equalsIgnoreCase(currency)) {
		    	 //convert euro to the input currency.
		    	 result = euro*Double.parseDouble(element.getAttribute("rate"));
		     }
	    }
		
		return result;
	}
}
