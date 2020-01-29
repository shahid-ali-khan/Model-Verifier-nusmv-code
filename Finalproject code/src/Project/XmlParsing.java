package Project;

import java.awt.FlowLayout;

import java.io.IOException;
import java.util.List;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;

public class XmlParsing {

	
	public List<State> xmlParseData() {
		List<State> tList = null;
		SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();
		try {
			SAXParser saxParser= saxParserFactory.newSAXParser();
			MyHandler handler = new MyHandler();
			saxParser.parse("statechartxml.xml", handler);
		  tList = handler.getStates();
			
//			for(State t : tList) {
//				System.out.println(t);
//			}
		} catch (ParserConfigurationException e) {
			
			e.printStackTrace();
		} catch (SAXException e) {
		
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}

		
		return tList;

	}

}
