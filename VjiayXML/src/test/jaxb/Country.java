package test.jaxb;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement
@XmlType(propOrder = { "countryName", "population", "listOfstates"})
public class Country {
	
	private String countryName;
	private int population;
	private ArrayList<State> listOfstates;
	
	
	public String getCountryName() {
		return countryName;
	}
	
	@XmlElement
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public int getPopulation() {
		return population;
	}
	
	@XmlElement
	public void setPopulation(int population) {
		this.population = population;
	}
	public ArrayList<State> getListOfstates() {
		return listOfstates;
	}
	

	@XmlElementWrapper(name = "stateList")
	@XmlElement(name = "state")
	public void setListOfstates(ArrayList<State> listOfstates) {
		this.listOfstates = listOfstates;
	}
}
