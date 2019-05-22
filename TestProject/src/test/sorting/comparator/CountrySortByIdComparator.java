package test.sorting.comparator;

import java.util.Comparator;

public class CountrySortByIdComparator implements Comparator<Country>{

    @Override
    public int compare(Country country1, Country country2) {

        return (country1.getId() < country2.getId() ) ? -1: (country1.getId() > country2.getId() ) ? 1:0 ;
    }

}