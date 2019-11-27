package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Addthearraylist {

	public static void main(String[] args) {
		//Scanner s=new Scanner(System.in);
		ArrayList<String> list=new ArrayList();
		list.add("hai");
		list.add("welcome");
		list.add("to ooty");
		ArrayList<String> list1=new ArrayList();
		list1.add("nice");
		list1.add("to");
		list1.add("meet you");
		list.addAll(list1);
		Iterator itr1=list.iterator();
		while(itr1.hasNext())
		{
			System.out.println(itr1.next());
		}

	}

}
