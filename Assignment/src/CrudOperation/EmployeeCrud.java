package CrudOperation;
import java.util.Scanner;

public class EmployeeCrud {	
	CrudNode root;
	void createList() {
		root=null;
	}
	
	
	void insert(int employee_id, String name,String gender, float salary) {
		CrudNode n = new CrudNode(employee_id, name, gender, salary);
		if(root==null) {
			root= n;
		}
		else  {
			CrudNode t= root;
			while(t.next!=null) {
				t=t.next;
				
			}
			t.next=n;
		}
		
	}
	

	void printList() {
		if(root==null) {
			System.out.println("Empty list");
		}
		else {
			CrudNode t=root;
			while(t!=null) {
				System.out.println("Employee id: "+t.employee_id+"\nName: "+t.name+"\nGender: "+t.gender+"\nSalary: "+t.salary);
				t=t.next;
			}
			
		}
	}
	
	void update(CrudNode t) {
		Scanner sn = new Scanner(System.in);
		System.out.println("\n1.Update name\n2.Update gender\n3.Update Salary");
		int i_ch =sn.nextInt();
		if(i_ch==1) {
			System.out.println("Old: "+t.name);
			System.out.println("\nEnter New");
			t.name= sn.next();
		}
		
		else if(i_ch==2) {
			System.out.println("Old: "+t.gender);
			System.out.println("\nEnter New");
			t.gender= sn.next();
		}
		
		else if(i_ch==3) {
			System.out.println("Old: "+t.salary);
			System.out.println("\nEnter New");
			t.salary= sn.nextFloat();
		}
		System.out.println("Updated");
	}

	void search(int id) {
		if(root==null) {
			System.out.println("Empty list");
		}
		else {
			CrudNode t=root;
			while(t!=null && t.employee_id!=id) {
			  t=t.next;
			}
			if(t==null) {
				System.out.println("employee not found");
			}
			else if(t.employee_id==id)
				System.out.println(" employee found");
			System.out.println("Employee id: "+t.employee_id+"\nName: "+t.name+"\nGender: "+t.gender+"\nSalary: "+t.salary);
			t=t.next;
		}
	}

	void deletekey(int key) {
		if(root==null) {
			System.out.println("Empty list");
		}
		else {
			CrudNode t=root;
			CrudNode t2=root;
			while(t!=null && t.employee_id!=key) {
				t2=t;
			  t=t.next;
			}
			if(t==null) {
				System.out.println("element not found");
			}
			else if(t.employee_id==key) {
				System.out.println(" found");
			
			if(t==root) {//case1: root delete
				root=root.next;
			}
			else if(t.next==null) {//case 2: last deleted
				t2.next=null;
			}
			else //case3: delete specific
				t2.next=t.next;
			System.out.println("Deleted: "+t.employee_id);
			}
			
		}
	}
	public static void main(String[] args) 
	{
		int ch,id;
		String name,gender;
		float sal;
		Scanner sn = new Scanner(System.in);
		EmployeeCrud ec= new EmployeeCrud();
		
		
		do {
			System.out.println("\n1.Register a new employee\n2.Search for employee\n3.Update any record\n4.Delete record\n5.Print all records\n0.Exit");
			ch=sn.nextInt();
			
			switch(ch) {
			case 1:
				System.out.println("Enter Id: ");
				id=sn.nextInt();
				System.out.println("Enter name of employee: ");
				name = sn.next();
				System.out.println("Enter gender: ");
				gender = sn.next();
				System.out.println("Enter salary: ");
				sal= sn.nextFloat();
				ec.insert(id, name, gender, sal);
				System.out.println("Inserted");
				break;
				
			case 2: 
				System.out.println("Enter id of employee you are searching for: ");
				id=sn.nextInt();
				ec.search(id);
//				ec.printList();
				break;
				
			case 3:
				ec.update(ec.root);
				break;
				
			case 4:
				System.out.println("Enter id of employee you want to delete: ");
				id = sn.nextInt();
				ec.deletekey(id);
				System.out.println("Record deleted");
				break;
				
			case 5:
				ec.printList();
				break;
				
			case 0:
				System.out.println("Exiting code");
				break;
				
			default:
				System.out.println("Entered wrong input");
				break;
			}
		}while(ch!=0);
	}

}