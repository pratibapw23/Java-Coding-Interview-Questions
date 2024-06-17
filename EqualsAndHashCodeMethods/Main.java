package EqualsAndHashCodeMethods;

import java.util.HashSet;
import java.util.Set;

class Student{
	int id;
	String name;
	
	public Student(int id, String name) {
		this.id=id;
		this.name=name;
	}
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	@Override 
	  public int hashCode(){
		return this.id;
	  }
	@Override 
	public boolean equals(Object obj) {
        Student stud=(Student)obj;
        return stud.id==this.id;
    }

}

public class Main {

	public static void main(String[] args) {
		Set<Student> studSet=new HashSet<>();
		Student s1=new Student(1,"johel");
		Student s2=new Student(2,"harry");
		Student s3=s1;
		Student s4=new Student(1,"potter");
		
		studSet.add(s1); 
		studSet.add(s2); 
		studSet.add(s3); 
		studSet.add(s4); 
		for(Student obj:studSet) {
			System.out.println(obj.hashCode()+" "+"id="+obj.getId()+" "+"name="+obj.getName());
		}
		System.out.println(s1.equals(s4));
	}

}
