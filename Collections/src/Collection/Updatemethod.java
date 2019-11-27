package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Updatemethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list=new ArrayList();
		list.add("first");//add the first into list
		list.add("second");
		Iterator itr=list.iterator();
		System.out.println("List of values");
		while(itr.hasNext())//returns true if the iteration
		{
			System.out.println(itr.next());
		}
		System.out.println("Update values");
		list.set(1, "35");
		Iterator itr1=list.iterator();
		while(itr1.hasNext())//returns true if the iteration
		{
			System.out.println(itr1.next());
		}
	}

}
