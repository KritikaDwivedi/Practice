package tests;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	List<ComparatorClass> list=new ArrayList<ComparatorClass>();
	list.add(new ComparatorClass("Kritika",123,27));
	list.add(new ComparatorClass("Ashish",012,26));
	list.add(new ComparatorClass("Disha",145,25));
	Comparator<ComparatorClass> nameComparator = new Comparator<ComparatorClass>() {
		@Override
        public int compare(ComparatorClass e1, ComparatorClass e2) {
            return e1.getName().compareTo(e2.getName());
        }
	};
	
	Collections.sort(list,nameComparator);
	System.out.println("Sorted by Name:"+ list);
	
	Comparator<ComparatorClass> ageComparator = new Comparator<ComparatorClass>() {
		@Override
        public int compare(ComparatorClass e1, ComparatorClass e2) {
            return e1.getAge()-e2.getAge();
        }
	};
	Collections.sort(list,ageComparator);
	System.out.println("Sorted by Age:"+ list);
	
	
	Comparator<ComparatorClass> idComparator = new Comparator<ComparatorClass>() {
		@Override
        public int compare(ComparatorClass e1, ComparatorClass e2) {
            return e1.getId()-e2.getId();
        }
	};
	Collections.sort(list,idComparator);
	System.out.println("Sorted by Id:"+ list);
}	
}


class ComparatorClass{
	
	private String name;
	private int id;
	private int age;
	
	ComparatorClass(String name,int id, int age){
		this.name=name;
		this.id=id;
		this.age=age;		
	}
	public String getName() {
		return name;
	}
	
	public int getId() {
		return id;
	}
	
	public int getAge() {
		return age;
	}
	
	@Override
	public String toString() {
		return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
	}
	
	
}
