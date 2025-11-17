package clone.employee;

public class Address implements Cloneable {

	private String city;
	private String state;

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Object clone() throws CloneNotSupportedException {

		return super.clone();
	}

}
