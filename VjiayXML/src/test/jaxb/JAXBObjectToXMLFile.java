package test.jaxb;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class JAXBObjectToXMLFile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Customer customer = new Customer();
		customer.setId(100);
		customer.setAge(35);
		customer.setName("Vijay");
		
		
		Customer customer1 = new Customer();
		customer1.setId(101);
		customer1.setAge(25);
		customer1.setName("Ajay");
		
		try{
			File file = new File("c:\\jaxbSample.xml");
			JAXBContext context = JAXBContext.newInstance(Customer.class);
			Marshaller marshaller = context.createMarshaller();
			
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			marshaller.marshal(customer, file);
			marshaller.marshal(customer1, file);
			
			marshaller.marshal(customer, System.out);
			
			
			Unmarshaller unmarshaller = context.createUnmarshaller();
			Customer cust = (Customer) unmarshaller.unmarshal(file);
			
			System.out.print("cust name " + cust.getName());
			
		}catch(JAXBException  e){
			e.printStackTrace();
		}

	}

}
