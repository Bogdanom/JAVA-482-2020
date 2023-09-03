package lesson6.hw_6_2;
public class ContractEmployee extends Employee {
	private int days;
	private String federalTaxIdmember;

	public ContractEmployee(long id, String name, int days, String federalTaxIdmember) {
		super(id, name);
		this.days = days;
		this.federalTaxIdmember = federalTaxIdmember;
	}

	public int getDays() {
		return days;
	}
	public void setDays(int days) {
		this.days = days;
	}
	public String getFederalTaxIdmember() {
		return federalTaxIdmember;
	}
	public void setFederalTaxIdmember(String federalTaxIdmember) {
		this.federalTaxIdmember = federalTaxIdmember;
	}

	@Override
	public String toString() {
		return "ContractEmployee ["
				+super.toString()
				+ ", FedTaxId: " + federalTaxIdmember
				+", working days:" + days + "]";
	}

	@Override
	public double calculatePay() {
		return 1000*days;
	}

}
