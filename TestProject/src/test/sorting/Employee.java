package test.sorting;

import java.util.Arrays;
import java.util.Comparator;

public class Employee implements Comparable<Employee> {
	
	private int age;
	private String fName;
	private String lName;
	private int salary;
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public Employee(int age, String fName, String lName, int salary){
		this.age = age;
		this.fName = fName;
		this.lName = lName;
		this.salary = salary;
	}
	
	public String toString(){
		return "[age=" + this.age + ", fName=" + this.fName + ", lName=" + this.lName + ", salary=" + this.salary;
	}
	
	public static void main(String[] args) {
		
		Employee [] emp = new Employee[4];
		
		emp[0] = new Employee(56, "Chirag", "Amin", 10000);
		emp[1] = new Employee(20, "Avani", "Patel", 20000);
		emp[2] = new Employee(30, "Raj", "Rathod", 25000);
		emp[3] = new Employee(20, "Jay", "Shah", 40000);
		
		Arrays.sort(emp);
		
		//System.out.println(" Default sorting for employee is " + Arrays.toString(emp));
		
		Arrays.sort(emp, Employee.ageComprator);
		System.out.println(" Employee Age Sorting " + Arrays.toString(emp));
		
		Arrays.sort(emp, Employee.fNameComparator);
		System.out.println(" Employee Sorting by fName " + Arrays.toString(emp));
		
		Arrays.sort(emp, Employee.ageFnameComparator);
		System.out.println(" Employee Sorting by ageFnameComparator " + Arrays.toString(emp));
	}
	
	public int compareTo(Employee e){
		return this.age - e.age;
	}
	
	public static Comparator<Employee> ageComprator = new Comparator<Employee> () {		
		public int compare(Employee e1, Employee e2){
			return e1.getAge() -e2.getAge();
		}
	};
	
	public static  Comparator<Employee> salaryComparator = new Comparator<Employee>() {		
		public int compare(Employee e1, Employee e2){
			return e1.getSalary() - e2.getSalary();			
		}	
	};
	
	public static Comparator<Employee> fNameComparator = new Comparator<Employee>() {
		public int compare(Employee e1, Employee e2){
			return e1.fName.compareTo(e2.fName);
		}
	};
	
	public static Comparator<Employee> ageFnameComparator = new Comparator<Employee> () {
		public int compare(Employee e1, Employee e2){
			int flag = e1.age -e2.age;
			if(flag==0) flag = e1.fName.compareTo(e2.fName);
			return flag;
		}		
	};
}
