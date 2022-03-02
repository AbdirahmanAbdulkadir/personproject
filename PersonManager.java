package challengesonQa;

import java.util.ArrayList;
import java.util.List;



public class PersonManager {

	private ArrayList<Person> personarray;
	
	public PersonManager() {}
	
	
	public PersonManager(Person p) {
		this.personarray= new ArrayList<>();
		personarray.add(p);
		
	}
	
	public  Person findperson(String name) {
		for(Person p1: personarray) {
			if(p1.getName()==name) {
				return p1;
			} 
				
		}
		
		System.out.println("person not found");
			return null;
		
		
	}

	public void everyone() {
		personarray.stream().forEach(x -> System.out.println( x));
	}
	
	
	
	
	
}
