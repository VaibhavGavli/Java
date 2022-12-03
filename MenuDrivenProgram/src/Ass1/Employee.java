package Ass1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Employee {
	private int eid;
	private String name;
	private double salary;
	
	public Employee(int eid, String name, double salary) {
		super();
		this.eid = eid;
		this.name = name;
		this.salary = salary;
	}

	public Employee() {
		super();
	}

	public int geteid()
	 {
		 return eid;
	 }


	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", salary=" + salary +  "]";
	}

	public static void main(String[] args) {
		int choice=1;
		int eid;
		String name;
		double salary;
		List<Employee>emps=new ArrayList<>();
		
		do
		{
			System.out.println("1. Accept");
			System.out.println("2. Display");
			System.out.println("3. Search");
			System.out.println("4. Delete");
			System.out.println("5. Modify");
			System.out.println("6. Size");
			System.out.println("0. Exit");
			System.out.println("Enter your choice");
			Scanner sc=new Scanner(System.in);
			choice=sc.nextInt();

			
		switch(choice)
		{
		case 1:
			System.out.println("Enter Emp Id ,Name And Salary");
			eid=sc.nextInt();
			name=sc.next();
			salary=sc.nextDouble();
			Employee e=new Employee(eid,name,salary);
			emps.add(e);
			break;
	    
		case 2:
			for(int i=0;i<emps.size();i++)
			{
				System.out.println(emps.get(i));
				break;
			}
		case 3:
			int temp;
			
			System.out.println("Enter the Empid to searched ");
			temp=sc.nextInt();
			for(int i=0;i<emps.size();i++)
			{
				if(temp==emps.get(i).geteid())
				{
					System.out.println(emps.get(i));
					break;
				}
			}
		case 4:
			System.out.println("Enter the Empid which is to be delete ");
			for(int i=0;i<emps.size();i++)
			{
				
			}
		      
			
		
		case 5:
			int mod;
			
			System.out.println("Enter Emp Id to Modify");
			mod=sc.nextInt();
			for(int i=0;i<emps.size();i++)
			{
				if(mod==emps.get(i).geteid())
				{
					System.out.println("Enter Emp Id,Name And Salary");
					eid=sc.nextInt();
					name=sc.next();
					salary=sc.nextDouble();
					Employee e=new Employee(eid,name,salary);

					emps.set(i, e);
					break;
					
				}
			}
		}
			
		}while(choice!=0);

	}

	
}
