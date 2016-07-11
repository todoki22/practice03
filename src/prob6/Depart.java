package prob6;

public class Depart extends Employee {
	private String departName;
	
	public Depart( String name, int salary, String departName ){
		super( name, salary );
		this.departName = departName;
	}

	public String getDepartName() {
		return departName;
	}

	public void setDepartName(String departName) {
		this.departName = departName;
	}

	@Override
	public void getInformation() {
		System.out.printf(
			"이름: %s   연봉: %d   부서:%s\n", getName(), getSalary(), getDepartName() );
	}


}
