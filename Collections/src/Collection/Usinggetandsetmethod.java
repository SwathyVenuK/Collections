package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Usinggetandsetmethod {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size");
		int n=s.nextInt();
		ArrayList a1=new ArrayList();//Arraylist class creation
		//or we can declare using ArrayList<String> list=new ArrayList();
		Employee[] emp=new Employee[n];
	
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the name");
			String name=s.next();
			System.out.println("Enter the age");
			int age=s.nextInt();
		emp[i]=new Employee();
	    emp[i].setAge(age);
		emp[i].setName(name);
		a1.add(emp[i]);
		
		}
		
		Iterator<Employee> itr=a1.iterator();//or we can use for(i=0;i<n;i++) and sop(i);
		while(itr.hasNext())//returns true if the iteration
		{
			Employee e=itr.next();
			System.out.println(e.getName()+""+e.getAge());
		}
				

	}

}
