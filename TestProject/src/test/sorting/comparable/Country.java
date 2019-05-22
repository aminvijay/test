package test.sorting.comparable;

public class Country implements Comparable<Country>{
	
	int id;
	String name;
	int population;
	public Country (int id, String name, int population) {
		super();
		this.id = id;
		this.name = name;
		this.population = population;
	}
	
	public String toStirng() {
		return " id " + id + " name " + name + " population = " + population;
	}
	
	public int compareTo(Country ctr){
		return ctr.getId() - this.getId();
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPopulation() {
		return population;
	}
	public void setPopulation(int population) {
		this.population = population;
	}
}
