package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Clearmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList list=new ArrayList();
list.add("first");//add the first into list
list.add("second");//"
list.add("Third");
list.add("Fourth");

Iterator itr=list.iterator();
while(itr.hasNext())
{
	System.out.println(itr.next());
}
System.out.println("list cleared");
list.clear();//clear the values
}

}
