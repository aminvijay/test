package test.sorting.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CountryComparable {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Country indiaCountry= new Country(1, "India", 1144);
		 Country chinaCountry=new Country(4, "China", 2222);
		 Country nepalCountry=new Country(3, "Nepal", 3333);
		 Country bhutanCountry=new Country(2, "Bhutan", 4444);
		 
		 List<Country> listOfCountries = new ArrayList<Country>();
	        listOfCountries.add(indiaCountry);
	        listOfCountries.add(chinaCountry);
	        listOfCountries.add(nepalCountry);
	        listOfCountries.add(bhutanCountry);
	        
	        System.out.println("Before Sort  : ");
	        for (int i = 0; i < listOfCountries.size(); i++) {
				Country country=(Country) listOfCountries.get(i);
				System.out.println("Country Id: "+country.getId()+"||"+"Country name: "+country.getName());
			}
	        
	        Collections.sort(listOfCountries);
	        System.out.println("After Sort  : ");
	        for (int i = 0; i < listOfCountries.size(); i++) {
				Country country=(Country) listOfCountries.get(i);
				System.out.println("Country Id: "+country.getId()+"||"+"Country name: "+country.getName());
			}

	}

}
