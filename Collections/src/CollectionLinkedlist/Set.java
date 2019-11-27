package CollectionLinkedlist;

import java.util.HashSet;
import java.util.Iterator;

public class Set {

	public static void main(String[] args) {
		HashSet<String> set=new HashSet<String>();
		set.add("sreeprasad");
		set.add("sanjay");
		set.add("vignesh");
		set.add("lalettan");
		set.add("abi");
		set.add("sarath");
		set.add("lalettan");
		set.add("sheethal");
		set.add("lalettan");
		set.add("sarath");
		set.add("mappan");
		set.add("pattu");
		set.add("sarath");
		set.add("vignesh");
		
		Iterator<String> itr=set.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

	}

}
