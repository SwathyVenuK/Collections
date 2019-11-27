package CollectionLinkedlist;

import java.util.LinkedList;
import java.util.Scanner;

public class Linkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int n=s.nextInt();
LinkedList<String> list=new LinkedList<String>();
for(int i=0;i<n;i++)
{
	     System.out.println("Enter the name");
		String name=s.next();
		  System.out.println("Enter the address");
			String add=s.next();
		   System.out.println("Enter the age");
			String age=s.next();
		list.add(name);
		list.add(add);
		list.add(age);
}
System.out.println("Size of list"+list.size());
System.out.println("Size of list"+list.isEmpty());
}

}
