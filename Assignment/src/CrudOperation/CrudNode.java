package CrudOperation;


class CrudNode {
	int employee_id;
	String name;
	String gender;
	float salary;
	CrudNode next;
	public CrudNode(int employee_id, String name, String gender, float salary) {
		
		this.employee_id = employee_id;
		this.name = name;
		this.gender = gender;
		this.salary = salary;
		next=null;
	}
}