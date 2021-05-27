package kalkulatorWalut;

import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/*
 * @author Julia Zielonka
 * 
 * ParserXML
 *
 * 25.05.2021
 * 
 */

public class ParserXML {
	
	//create static fields.
	public static NodeList nodeList;
	public static Node node;
	public static Element element;
	
	//method to parse XML document.
	public static void parse(String path) {
		try {
			//parse an input XML file and obtain DOM from the file.
			File file = new File(path);
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			DocumentBuilder db = dbf.newDocumentBuilder();
			Document doc = db.parse(file);
			doc.getDocumentElement().normalize();
			
			//create nodeList with all of the Elements in document with a tag name "Cube".
			nodeList = doc.getElementsByTagName("Cube");
			
			//create elements from every node in the nodeList.
			for (int i = 0; i < nodeList.getLength(); i++) {
				node = nodeList.item(i);
				element = (Element) node;
			}
		} 
		//catch the exception if occurred.
		catch (Exception e)
		{
			System.out.println("File parsing failed");
		}
	}
}
