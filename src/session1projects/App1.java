package session1projects;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App1 {
	
	//main => ctrl + space
	public static void main(String[] args) {
		Car c1 = new Car("Toyota", 2018);
		Car c2 = new Car(2018 ,"Toyota");
		
		//sysout => ctrl + space		
		System.out.println(c1.toString());
		
		System.out.println(c1 instanceof Car);
		
		System.out.println("please enter how many rows you need");
		//Ctrl + shift + o => importing the library
		Scanner sc = new Scanner(System.in); 
		int row = sc.nextInt();
		
		// CTRL + D => removing line
		for (int i = 0; i < row; i++) {
			for(int j=0 ; j< i ; j++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
		
		List<Car> lst = new ArrayList<Car>();
		lst.add(new Car("Toyota", 2018));
		lst.add(new Car("Honda", 2018));
		lst.add(new Car("RAv4", 2018));
		
		
		
		Person person1 = new Person();
		Person person2 = new Person("toto", "popo");
		Person person3 = new Person("daddy","shark", 12);
		
		List<Person> lstPersons =new ArrayList<Person>();
		lstPersons.add(person1);
		lstPersons.add(person2);
		lstPersons.add(person3);
		
		//foreach
		for (Person person : lstPersons) {
			System.out.println(person);
		}
		
		
		Student st1 = new Student();
		st1.setName("toto");
		st1.setStdId("11231231");
		
		Student st2 = new Student();
		st1.setName("popo");
		st1.setStdId("23412341");
		
		System.out.println(st1);
		System.out.println(st2);
		
		
	}
}
