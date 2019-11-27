package CollectionLinkedlist;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.Scanner;
import java.util.TreeSet;

public class Caseset1 {

	public static void main(String[] args) {
	String symbol;
	int num,count=0;
	Scanner s=new Scanner(System.in);
	Set<NewCard> obj=new TreeSet<NewCard>(new Symbol());
	NewCard[] c=new NewCard[40];
		System.out.println("Enter the no of symbols");
int n=s.nextInt();
int i;
while(obj.size()<n)
{
	symbol=s.next();
	num=s.nextInt();
	c[count]=new NewCard();
	c[count].setSymbol(symbol);
	c[count].setNum(num);
	obj.add(c[count]);
	count++;
	
}
System.out.println(n+"Symbols gathered in"+count+"cards.");
System.out.println("Cards are");
Iterator<NewCard> itr=obj.iterator();
while(itr.hasNext())
{
	NewCard ca=(NewCard)itr.next();
	System.out.println(ca.getSymbol()+""+ca.getNum());
}

	}

}
