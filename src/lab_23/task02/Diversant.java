package lab_23.task02;

public class Diversant extends Spy {

	@Override
	void visit(MilitaryBase militaryBase) {
		militaryBase.setTanks(militaryBase.getTanks() - 1);
		militaryBase.setJeeps(militaryBase.getJeeps() - 1);
	}

	@Override
	void visit(GeneralStaff generalStaff) {
		generalStaff.setSecretPaper(generalStaff.getSecretPaper() - 1);
	}
}
