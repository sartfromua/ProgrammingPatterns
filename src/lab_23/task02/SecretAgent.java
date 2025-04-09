package lab_23.task02;

public class SecretAgent extends Spy {

	private String info;

	@Override
	void visit(MilitaryBase militaryBase) {
		militaryBase.setSoldiers(militaryBase.getSoldiers() - 1);
		militaryBase.setOfficers(militaryBase.getOfficers() - 1);
	}

	String getInfo() {
		return info;
	}

	@Override
	void visit(GeneralStaff generalStaff) {
		generalStaff.setGenerals(generalStaff.getGenerals() - 1);
		info = String.valueOf(generalStaff.getSecretPaper());
	}
}
