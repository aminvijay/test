package test.jaxb;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement (namespace = "test.jaxb.Country")
public class State {

	private String stateName;
	private String stateCapital;
	private int population;
	
	public String getStateName() {
		return stateName;
	}
	
	@XmlElement
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	public String getStateCapital() {
		return stateCapital;
	}
	
	@XmlElement
	public void setStateCapital(String stateCapital) {
		this.stateCapital = stateCapital;
	}
	public int getPopulation() {
		return population;
	}
	
	@XmlElement
	public void setPopulation(int population) {
		this.population = population;
	}
	
	
}
