package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Arraylist1removemethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size");
		int n=s.nextInt();
		ArrayList list=new ArrayList();//Arraylist class creation
		//or we can declare using ArrayList<String> list=new ArrayList();
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the name");
			String name=s.next();
			System.out.println("Enter the age");
			String age=s.next();
			list.add(name);//add method
			list.add(age);
		
		}
		System.out.println(list.get(0));
		list.remove(0);
		//System.out.println(list.get(0));
		Iterator itr=list.iterator();//or we can use for(i=0;i<n;i++) and sop(i);
		while(itr.hasNext())//returns true if the iteration
		{
			System.out.println(itr.next());
		}
				
	}

}
