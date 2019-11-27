package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Delete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		//ArrayList<String> list=new ArrayList();
		int i;int j=1;
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the size");
		int n1=s1.nextInt();
		ArrayList a1=new ArrayList();//Arraylist class creation
		Custome[] cus=new Custome[n1];
		for(i=0;i<n1;i++)
		{
			System.out.println("Enter the name");
			String name=s1.next();
			System.out.println("Enter the address");
			String add=s1.next();
			System.out.println("Enter the contact number");
			int cn=s1.nextInt();
			System.out.println("Enter the Email id");
			String email=s1.next();
			System.out.println("Enter the Proof Type");
			String pt=s1.next();
			System.out.println("Enter the Proof id");
			int pid=s1.nextInt();
			cus[i]=new Custome();
			
			
			
			System.out.println("Thank you for registering. Your id is ...."+j);
			j++;
			System.out.println("Do you want to update email");
			String r=s.next();
			String c=r.toLowerCase();
			if(c.equals("yes"))
			{
				System.out.println("updated email");
				String m=s.next();
				cus[i].setName(name);
				cus[i].setAdd(add);
				cus[i].setCn(cn);
				cus[i].setEmail(m);
				cus[i].setPt(pt);
				cus[i].setPid(pid);
				
				
			}
			else
			{
				
				cus[i].setName(name);
				cus[i].setAdd(add);
				cus[i].setCn(cn);
				cus[i].setEmail(email);
				cus[i].setPt(pt);
				cus[i].setPid(pid);
				
			}
			a1.add(cus[i]);
		}
		Iterator<Custome> itr=a1.iterator();//or we can use for(i=0;i<n;i++) and sop(i);
		for(i=0;itr.hasNext();i++)
		{
			Custome c=itr.next();
			int d=i;
			d++;
			System.out.println("Details are"+d);
			System.out.println("name:"+c.getName());
			System.out.println("address:"+c.getAdd());
			System.out.println("email:"+c.getEmail());
			System.out.println("proof id:"+c.getPid());
			System.out.println("proof type:"+c.getPt());
			System.out.println("email:"+c.getEmail());
		}
	
		System.out.println("Details of Customes");
		System.out.println("------------------------------");
		System.out.println("id\tName");
		System.out.println("\n------------------------------");
		for(i=0;i<n1;i++)
		{
		System.out.println(i+"\t"+cus[i].name);
		}
		System.out.println("do you want to delete(yes/no)");
		String g=s.next();
		System.out.println("Enter the index");
		int x=s.nextInt();
		String g1=s.next();
		String d=g1.toLowerCase();
		if(d.equals("yes"))
		{
			a1.remove(x);
			System.out.printf("index %d removed",x);
			System.out.printf("Display after removing");
			Iterator<Custome> itr1=a1.iterator();
			for(i=0;itr1.hasNext();i++)
			{
				
				int d1=i;
				d1++;
				Custome c=itr1.next();
				System.out.println();
				System.out.printf("Details of Custome"+d1);
				System.out.println();
				System.out.println("Details are"+d1);
				System.out.println("name:"+c.getName());
				System.out.println("address:"+c.getAdd());
				System.out.println("email:"+c.getEmail());
				System.out.println("proof id:"+c.getPid());
				System.out.println("proof type:"+c.getPt());
				System.out.println("email:"+c.getEmail());
			}
		
		}
	}

	
}
class Custome{
	
	String name;
	String add;
	String email;
	String pt;
	int pid;
	int cn;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAdd() {
		return add;
	}
	public void setAdd(String add) {
		this.add = add;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPt() {
		return pt;
	}
	public void setPt(String pt) {
		this.pt = pt;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public int getCn() {
		return cn;
	}
	public void setCn(int cn) {
		this.cn = cn;
	}
	
}

