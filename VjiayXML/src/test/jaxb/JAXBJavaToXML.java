package test.jaxb;

import java.io.File;
import java.util.ArrayList;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class JAXBJavaToXML {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Country country = new Country();
		country.setCountryName("India");
		country.setPopulation(11111111);
		
		ArrayList<State> stateList = new ArrayList<State>();
		
		State state1 = new State();
		state1.setStateName("Gujarta");
		state1.setStateCapital("Gandhinagar");
		state1.setPopulation(2222);
		
		
		State state2 = new State();
		state2.setStateName("Maharastra");
		state2.setStateCapital("Mumbai");
		state2.setPopulation(1111);
		
		stateList.add(state1);
		stateList.add(state2);
		
		country.setListOfstates(stateList);
		
		try {
			JAXBContext context = JAXBContext.newInstance(Country.class);
			Marshaller marshaller = context.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			
			File outputFile = new File("C:\\coutry.xml");
			marshaller.marshal(country, outputFile);
			
			
		}catch (JAXBException e ){
			e.printStackTrace();
		}
		
		

	}

}
