package tests;

import java.util.ArrayList;
import java.util.Collections;

class ComparableClass implements Comparable<ComparableClass> {

	 private int person_id;
	 private String name;
	
	@Override
	public int compareTo(ComparableClass o) {
		//ComparableExample p = (ComparableExample) o; 
        return this.person_id - o.person_id ;
	}
	
	public ComparableClass(int person_id,String name) {
		this.person_id=person_id;
		this.name=name;
	}
	
	public double getPersonId() { 
		return person_id; 
		} 
    public String getName()   {  
    	return name; 
    	} 

}

public class ComparableExample 
{ 
    public static void main(String[] args) 
    { 
        ArrayList<ComparableClass> list = new ArrayList<ComparableClass>(); 
        list.add(new ComparableClass(890,"Force Awakens")); 
        list.add(new ComparableClass(234,"Star Wars")); 
  
        Collections.sort(list); 
  
        System.out.println("Persons after sorting : "); 
        for (ComparableClass person: list) 
        { 
            System.out.println(person.getName() + " " + 
            		person.getPersonId()); 
        } 
    } 
} 
