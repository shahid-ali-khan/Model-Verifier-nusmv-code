package Project;


import java.util.List;

public class State {
	
    String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	String incomingTransition;
	List<String> outgoingTransition;
	public String getIncomingTransition() {
		return incomingTransition;
	}
	public void setIncomingTransition(String incomingTransition) {
		this.incomingTransition = incomingTransition;
	}
	public List<String> getOutgoingTransition() {
		return outgoingTransition;
	}
	
	public void setOutgoingTransition(List<String> outgoingTransition) {
		this.outgoingTransition = outgoingTransition;
	}
	@Override
	public String toString() {
		return "State [name=" + name + "]";
	}
	

	
	
}
