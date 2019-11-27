package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Case1 {

	public static void main(String[] args) {
Scanner s=new Scanner(System.in);
		ArrayList<String> list=new ArrayList();
		int i;int j=1;
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the size");
		int n1=s1.nextInt();
		ArrayList a1=new ArrayList();//Arraylist class creation
		Customer[] cus=new Customer[n1];
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
			cus[i]=new Customer();
			
			
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
		Iterator<Customer> itr=a1.iterator();//or we can use for(i=0;i<n;i++) and sop(i);
		while(itr.hasNext())//returns true if the iteration
		{
			Customer c=itr.next();
			System.out.println("Details are");
			System.out.println("name:"+c.getName());
			System.out.println("address:"+c.getAdd());
			System.out.println("email:"+c.getEmail());
			System.out.println("proof id:"+c.getPid());
			System.out.println("proof type:"+c.getPt());
			System.out.println("email:"+c.getEmail());
		}
	
	}
}
class Customer{
	String name;
	String add;
	String email;
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
	String pt;
	int pid;
	int cn;
}
