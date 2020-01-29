package Project;

import java.util.ArrayList;

import java.util.List;

import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;

//changes made by viresh on 08-01-2020
public class MyHandler extends DefaultHandler {

	private List<State> tList =new ArrayList<State>();
	State t = null;
	List<String> ot = null;
	
	
	public List<State> getStates(){
		return tList;
	}
	
	
	@Override
	public void startElement(String uri,String localName , String qName,Attributes attribute) {
		if(qName.equalsIgnoreCase("Vertices")) {
			String it = attribute.getValue("incomingTransitions");
			String name = attribute.getValue("name");
			t= new State();
			ot=new ArrayList<String>();
			t.setName(name);
			t.setIncomingTransition(it);
			
			
		}else if(qName.equalsIgnoreCase("outgoingTransitions")) {
			
			 String s = attribute.getValue("xmi:id");
			ot.add(s);
			 
		}
		
	}
	@Override
	public void endElement(String uri,String localName,String qName) {
		 if(qName.equalsIgnoreCase("Vertices")) {
			 t.setOutgoingTransition(ot);
			tList.add(t);
			
		}
	}
}
