package lesson6.hw_6_2;
public class SalariedEmployee extends Employee  {
	private String socialSecurityNumber;
	
	public SalariedEmployee(long id, String name, String socialSecurityNumber) {
		super(id, name);
		this.socialSecurityNumber = socialSecurityNumber;
	}

	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}

	public void setSocialSecurityNumber(String socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}

	@Override
	public String toString() {
		return "SalariedEmployee ["
				+super.toString()
				+", SocSecId:" + socialSecurityNumber + "]";
	}

	@Override
	public double calculatePay() {
		return 20000;
	}

}

