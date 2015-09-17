package compareToOverride;

import java.util.Date;
import java.util.HashMap;

public class PersonTest {

	public static void main(String[] args) {
		Date dd = new Date(2015,1,1);
		Person matt = new Person("Mathew", 1, dd);

		Person sherryd = new Person("Sherry", 3, dd);
		Person sherry = new Person("Sherry", 3, dd);

		System.out.println(matt.compareTo(sherry));
		
		HashMap< Person, Integer> marks = new HashMap<Person, Integer>();
		
		marks.put(matt, 20);
		marks.put(sherry, 100);
		marks.put(sherryd, 80);
		
		System.out.println(marks.get(matt));


		System.out.println(sherry.hashCode());

		System.out.println(sherryd.hashCode());
		System.out.println(sherry.equals(sherryd));

		System.out.println(marks.get(sherryd));
		
		
	}

}

class Person implements Comparable<Person>{
	  private String name;
	  private int id;
	  private Date dob;
	  
	public Person(String name, int id, Date dob) {
		super();
		this.name = name;
		this.id = id;
		this.dob = dob;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	@Override
	public int compareTo(Person o) {
		return (this.id < o.id) ? -1 : (this.id > o.id) ? 1: 0;
	}
	  
	@Override
	public int hashCode(){
		int result = 0;
		result = result*31 ;
		result = result*31 + id;
		result = result*31 + name.hashCode();
		result = result*31 + dob.hashCode();
		return result;
	}
	
	@Override
	public boolean equals(Object obj){
		if(! (obj instanceof Person)){
			return false;
		}
		Person p2 = (Person)obj;
		if(this.id == p2.id && this.name.equals(p2.name) && this.dob == p2.dob){
			return true;
		}
		return false;
	}
}
