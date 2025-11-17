package clone.employee;

public class Employee implements Cloneable {

	private int empNo;
	private String name;
	private Address address;

	public int getEmpNo() {
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Object clone() throws CloneNotSupportedException {

		Employee emp = (Employee) super.clone();
		emp.setAddress((Address) address.clone());

		return emp;
	}

}
