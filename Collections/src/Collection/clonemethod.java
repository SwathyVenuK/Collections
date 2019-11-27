package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class clonemethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String> list=new ArrayList();
list.add("first");//add the first into list
list.add("second");//"
list.add("Third");
list.add("Fourth");
Iterator itr=list.iterator();
System.out.println("List of values");
while(itr.hasNext())//returns true if the iteration
{
	System.out.println(itr.next());
}
ArrayList List1=(ArrayList)list.clone();
Iterator itr1=list.iterator();
System.out.println("Clone values");
while(itr1.hasNext())//returns true if the iteration
{
	System.out.println(itr1.next());
}


//or we can use for(i=0;i<n;i++) and sop(i);
while(itr.hasNext())//returns true if the iteration
{
	System.out.println(itr.next());
}
	}

}
